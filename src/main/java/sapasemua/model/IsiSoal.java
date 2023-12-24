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
public class IsiSoal {
    private String pertanyaan;
    private ArrayList<Jawaban> pilihanJawaban;

    public IsiSoal(String pertanyaan) {
        this.pertanyaan = pertanyaan;
        pilihanJawaban = new ArrayList();
    }
    
    public void tambahPilihanJawaban(Jawaban j){
        pilihanJawaban.add(j);
    }
    public void hapusPilihanJawaban(Jawaban j){
        pilihanJawaban.remove(j);
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public ArrayList<Jawaban> getPilihanJawaban() {
        return pilihanJawaban;
    }
    
    public void setPertanyaan(String pertanyaan){
        this.pertanyaan = pertanyaan;
    }
    
    public Jawaban getJawabanBenar(){
        for(Jawaban j : pilihanJawaban){
            if (j.adalahBenar()){
                return j;
            }
        }
        return null;
    }
    
}
