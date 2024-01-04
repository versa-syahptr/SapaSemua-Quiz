/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapasemua.controller;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;

import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import sapasemua.model.Kuis;
import sapasemua.view.QuizDialog;
import sapasemua.view.StartPage;

/**
 *
 * @author versa
 */
public class StartPageController extends MouseAdapter implements ActionListener, ChangeListener {
    private StartPage view;
    private final DefaultTableModel nilaiTableModel; 

    public StartPageController() {
        String[] columnNames = {"No", "Topik Kuis", "Nilai"};
        nilaiTableModel = new DefaultTableModel(columnNames, 0);
    }

    public void setView(StartPage view) {
        this.view = view;
        this.view.addActionListener(this);
        this.view.addChangeListener(this);
        this.view.getNilaiTable().setModel(nilaiTableModel);
    }    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        view.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Kuis kuis = null;
        // KUIS ALFABET
        if (source.equals(view.getAlfabetButton())){
            kuis = Kuis.get(1, "Alfabet");
        } 
        
        // KUIS KELUARGA
        else if (source.equals(view.getKeluargaButton())){
            kuis = Kuis.get(2,"Keluaga");
        }
        
        QuizDialog qDialog = new QuizDialog(view, true);
        QuizDialogController qDialogControl = new QuizDialogController(kuis);
        qDialogControl.setView(qDialog);
        qDialog.setVisible(true);
        view.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (view.getTabSelectedIndex() == 1){
            nilaiTableModel.setRowCount(0); // reset table
            Kuis.listKuis.forEach((kuis) -> {
                if (kuis.getNilai() >= 0){
                    Object[] rowData = {kuis.getIdHasilKuis(),
                                        kuis.getTopik(),
                                        kuis.getNilai()};
                    nilaiTableModel.addRow(rowData);
                }
            });
        }
    }
    
}
