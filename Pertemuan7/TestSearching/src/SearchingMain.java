/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Fachri
 */
public class SearchingMain {
    public static void main(String[] args) {
          int data[] = {10, 40, 30, 50, 70, 20, 100, 90}; 
        
    Searching pencarian = new Searching (data, 8);
    System.out.println (" ISI ARRAY ");
    pencarian.TampilData();
    
    int cari = 30;
        
        System.out.println("Sequential search");
        int posisi=pencarian.FindSeqSearch(cari);
        if(posisi!= -1){
            System.out.println("Data : " + cari + " ditemukan pada indeks " + posisi );
            
        }else{
            System.out.println("Data " + cari + "tidak ditemukan");
        }
           System.out.println("==============================");
        System.out.println("menggunakan binary search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.TampilPosisi(cari, posisi);
    }
}
    

    
    


    