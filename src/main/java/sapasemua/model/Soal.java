/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapasemua.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import sapasemua.controler.DB;

/**
 *
 * @author versa
 */
public class Soal extends IsiSoal {
    private int id, nomor;
    private Jawaban jawabanTerpilih;

    public Soal(int id, String pertanyaan) {
        super(pertanyaan);
        this.id = id;
        fetchJawaban();
    }
    
    private void fetchJawaban(){
        String sql = "SELECT * FROM `jawaban` WHERE `id_soal`=%d;";
        try {
            ResultSet rs = DB.fetch(sql.formatted(this.id));
            while(rs.next()){
                Jawaban jaw = new Jawaban(rs.getInt("id"), 
                                         rs.getString("teks"), 
                                    rs.getBoolean("benar"));
                tambahPilihanJawaban(jaw);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Soal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public Jawaban getJawabanTerpilih() {
        return jawabanTerpilih;
    }

    public void setJawabanTerpilih(Jawaban jawabanTerpilih) {
        this.jawabanTerpilih = jawabanTerpilih;
    }

    @Override
    public String toString() {
        return "Soal{" + "id=" + id + ", nomor=" + nomor + ", teks=" + getPertanyaan() + '}';
    }
    
    
    
    
    
    
}
