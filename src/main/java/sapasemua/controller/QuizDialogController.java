/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapasemua.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import sapasemua.model.Kuis;
import sapasemua.model.Soal;
import sapasemua.view.QuizDialog;

/**
 *
 * @author versa
 */
public class QuizDialogController extends MouseAdapter implements ActionListener {
    private QuizDialog view;
    private final Kuis kuis;
    private final DefaultListModel<String> soalListModel = new DefaultListModel();

    public QuizDialogController(Kuis kuis) {
        this.kuis = kuis;
        populateListSoal();      
    }

    public void setView(QuizDialog view) {
        this.view = view;
        this.view.addListener(this);
        this.view.addAdapter(this);
        this.view.setTopikText(kuis.getTopik());
        this.view.getSoalList().setModel(soalListModel);
        this.view.getSoalList().setSelectedIndex(0);
        renderSoal(this.kuis.getSoalbyIndex(0));
    }
    
    
    private void populateListSoal(){
        kuis.getDaftarSoal().forEach((soal) -> {
            soalListModel.addElement("Soal " + soal.getNomor());
        });
    }
    
    private void renderSoal(Soal s){
        if (s.getIndexJawabanTerpilih() == -1){
            view.getAnswerButtonGroup().clearSelection();
        } else {
            view.getAnswerButtons()[s.getIndexJawabanTerpilih()].setSelected(true);
        }
        for (int i=0; i<view.getAnswerButtons().length; i++){
            view.getAnswerButtons()[i].setText(s.getPilihanJawaban().get(i).getTeks());
        }
        view.getImageCanvas().setImageFromB64String(s.getB64image());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        // BUTTON SIMPAN
        if (source.equals(view.getSimpanButton())){
            int idx;
            // get selected radio buttons' index => idx
            for (idx=0; idx<view.getAnswerButtons().length; idx++){
                if (view.getAnswerButtons()[idx].isSelected()){
                    break;
                }
            }
            Soal s = kuis.getSoalbyIndex(view.getSoalList().getSelectedIndex());
            s.setIndexJawabanTerpilih(idx);
        } 
        
        // BUTTON SELESAI
        else if (source.equals(view.getSelesaiButton())){
            kuis.hitungNilai();
            System.out.println("nilai: " + kuis.getNilai());
            view.showMessage("Nilai anda: " + kuis.getNilai());
            view.dispose(); // Close the current frame
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int idx = view.getSoalList().getSelectedIndex();
        renderSoal(kuis.getSoalbyIndex(idx));
    }
    
    
}
