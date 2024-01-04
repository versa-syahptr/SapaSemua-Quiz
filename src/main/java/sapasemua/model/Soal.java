/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapasemua.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import sapasemua.controller.DB;

/**
 *
 * @author versa
 */
public class Soal extends IsiSoal {
    private int id, nomor;
    private String b64image = "";
    private int indexJawabanTerpilih = -1;

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
        } finally {
            DB.close();
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

    public int getIndexJawabanTerpilih() {
        return indexJawabanTerpilih;
    }

    public void setIndexJawabanTerpilih(int indexJawabanTerpilih) {
        this.indexJawabanTerpilih = indexJawabanTerpilih;
    }
    
    public Jawaban getJawabanTerpilih(){
        if (indexJawabanTerpilih == -1){
            return null;
        }
        return getPilihanJawaban().get(indexJawabanTerpilih);
    }

    public String getB64image() {
        return b64image;
    }

    public void setB64image(String b64image) {
        this.b64image = b64image;
    }
    
    @Override
    public String toString() {
        return "Soal{" + "id=" + id + ", nomor=" + nomor + ", teks=" + getPertanyaan() + '}';
    }
    
    
    
    
    
    
}
