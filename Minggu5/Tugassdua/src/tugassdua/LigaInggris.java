/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassdua;

/**
 *
 * @author Ahmad Fachri
 */
public class LigaInggris {
        
    String namaKlub;
    int perLigaInggrisan;
    int agregat;
    int poin;
    
    LigaInggris (String nama, int p, int gd, int pts) {
        namaKlub = nama;
        perLigaInggrisan = p;
        agregat = gd;
        poin = pts;
    }
    
    void tampil() {
        System.out.println("============================================");
        System.out.println("Nama Klub : "+namaKlub);
        System.out.println("Jumlah PerLigaInggrisan : "+perLigaInggrisan);
        System.out.println("Jumlah Agregat : "+agregat);
        System.out.println("Poin yang didapat : "+poin);
        
    }
}
    

