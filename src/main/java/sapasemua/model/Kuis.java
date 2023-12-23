/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapasemua.model;

import java.util.ArrayList;

/**
 *
 * @author versa
 */
public class Kuis extends HasilKuis {
    private String topik;
    private ArrayList<Soal> daftarSoal;

    public Kuis(String topik) {
        this.topik = topik;
        daftarSoal = new ArrayList();
    }
    
    public void tambahSoal(Soal s){
        daftarSoal.add(s);
    }
    
    public void hapusSoal(Soal s){
        daftarSoal.remove(s);
    }
}
