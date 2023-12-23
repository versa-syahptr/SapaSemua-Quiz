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
public abstract class IsiSoal {
    private String pertanyaan;
    private ArrayList<Jawaban> pilihanJawaban;

    public IsiSoal() {
        pilihanJawaban = new ArrayList();
    }
    
    public abstract void tambahPilihanJawaban(Jawaban j);
    public abstract void hapusPilihanJawaban(Jawaban j);

    public String getPertanyaan() {
        return pertanyaan;
    }

    public ArrayList<Jawaban> getPilihanJawaban() {
        return pilihanJawaban;
    }
    
    public abstract void setPertanyaan(String t);
    
}
