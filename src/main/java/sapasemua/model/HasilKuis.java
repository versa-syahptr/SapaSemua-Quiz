/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapasemua.model;

/**
 *
 * @author versa
 */
public abstract class HasilKuis {
    private int id;
    private double nilai;

    public int getIdHasilKuis() {
        return id;
    }

    public double getNilai() {
        return nilai;
    }

    public void setIdHasilKuis(int id) {
        this.id = id;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    
    public abstract void hitungNilai();
    
}
