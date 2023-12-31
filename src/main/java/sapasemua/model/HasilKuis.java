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
    private double nilai = -1;

    public int getIdHasilKuis() {
        return id;
    }

    public double getNilai() {
        double nilai_db = fetchNilai();
        if (nilai == -1){
            nilai = nilai_db;
        }
        return nilai;
    }

    public void setIdHasilKuis(int id) {
        this.id = id;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
        updateNilai();
    }
    
    // hitung nilai from correct answer
    public abstract void hitungNilai();
    // get nilai from DB
    public abstract double fetchNilai();
    // update nilai to DB
    public abstract void updateNilai();
    
}
