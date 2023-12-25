/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapasemua.model;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import sapasemua.controler.DB;

/**
 *
 * @author versa
 */
public class Kuis extends HasilKuis {
    private int id;
    private String topik;
    private ArrayList<Soal> daftarSoal;

    public Kuis(int id, String topik) {
        this.id = id;
        this.topik = topik;
        daftarSoal = new ArrayList();
        fetchSoal();
    }
    
    public void tambahSoal(Soal s){
        daftarSoal.add(s);
    }
    
    public void hapusSoal(Soal s){
        daftarSoal.remove(s);
    }

    @Override
    public void hitungNilai() {
        int nilai = 0;
        for (Soal soal : daftarSoal){
            int idx = soal.getIndexJawabanTerpilih();
            if (idx >= 0 && soal.getPilihanJawaban().get(idx).adalahBenar()){
                nilai++;
            }
            // pasti NPE
//            if (soal.getIndexJawabanTerpilih() == null || soal.getJawabanBenar() == null){
//                
//            } else if (soal.getIndexJawabanTerpilih().equals(soal.getJawabanBenar())){
//                nilai++;
//            }
                
        }
        setNilai(((double)nilai/daftarSoal.size())*100);
    }
    
    private void fetchSoal(){
        String sql = "SELECT * FROM `soal` WHERE `id_kuis`=%d;";
        try {
            ResultSet rs = DB.fetch(sql.formatted(this.id));
            while(rs.next()){
                Soal s = new Soal(rs.getInt("id"), 
                            rs.getString("pertanyaan"));
                daftarSoal.add(s);
                s.setNomor(daftarSoal.size());
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Kuis.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getTopik() {
        return topik;
    }

    public void setTopik(String topik) {
        this.topik = topik;
    }

    public ArrayList<Soal> getDaftarSoal() {
        return daftarSoal;
    }

    public void setDaftarSoal(ArrayList<Soal> daftarSoal) {
        this.daftarSoal = daftarSoal;
    }
    
    public Soal getSoalbyIndex(int idx){
        return daftarSoal.get(idx);
    }

    @Override
    public String toString() {
        return "Kuis{" + "id=" + id + ", topik=" + topik + '}';
    }
    
    
}
