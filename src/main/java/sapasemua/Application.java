package sapasemua;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author versa
 */

import sapasemua.model.*;

public class Application {
    public static void main(String[] args) {
        Kuis kuis = new Kuis(1, "Alfabet");
        System.out.println(kuis);
        for (Soal s : kuis.getDaftarSoal()){
            System.out.println("\t" + s);
            for (Jawaban j : s.getPilihanJawaban()){
                System.out.println("\t\t" + j);
            }
            
            System.out.println("\tJawaban benar: " + s.getJawabanBenar());
//            s.setJawabanTerpilih(s.getPilihanJawaban().getFirst());
        }
        kuis.getDaftarSoal().getFirst().setJawabanTerpilih(kuis.getDaftarSoal().getFirst().getPilihanJawaban().getFirst());
        kuis.hitungNilai();
        System.out.println("nilai: " + kuis.getNilai());
    }
}
