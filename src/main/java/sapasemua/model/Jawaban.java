/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapasemua.model;

/**
 *
 * @author versa
 */
public class Jawaban {
    private int id;
    private String teks;
    private boolean adalahBenar; 

    public Jawaban(int id, String teks, boolean adalahBenar) {
        this.id = id;
        this.teks = teks;
        this.adalahBenar = adalahBenar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeks(String teks) {
        this.teks = teks;
    }

    public void setAdalahBenar(boolean adalahBenar) {
        this.adalahBenar = adalahBenar;
    }

    public int getId() {
        return id;
    }

    public String getTeks() {
        return teks;
    }

    public boolean adalahBenar() {
        return adalahBenar;
    }

    @Override
    public String toString() {
        return "Jawaban{" + "id=" + id + ", teks=" + teks + ", adalahBenar=" + adalahBenar + '}';
    }
    
    
    
    
}
