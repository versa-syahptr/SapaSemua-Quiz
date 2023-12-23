/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapasemua.model;

/**
 *
 * @author versa
 */
public class Soal extends IsiSoal {

    @Override
    public void tambahPilihanJawaban(Jawaban j) {
        getPilihanJawaban().add(j);
    }

    @Override
    public void hapusPilihanJawaban(Jawaban j) {
        getPilihanJawaban().remove(j);
    }

    @Override
    public void setPertanyaan(String t) {
        
    }
    
    
    
}
