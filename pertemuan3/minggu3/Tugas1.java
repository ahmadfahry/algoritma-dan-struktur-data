/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;

/**
 *
 * @author Ahmad Fachri
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Program menghitung nilai mahasiswa");
        System.out.print("masukkan jumlah mahasiswa");
        int jumlah = sc.nextInt();
        
        Nilaimahasiswa[]nm = new Nilaimahasiswa[jumlah];
        
        for(int i=0; i<jumlah; i++){
            sc.nextLine();
            nm[i]= new Nilaimahasiswa();
            System.out.print("Mahasiswa ke-" + (i+1)+ " : ");
            nm[i].namaMhs = sc.nextLine();
            System.out.print("Masukkan nilai tugas\t:");
            nm[i].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan nilai kuis\t:");
            nm[i].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan nilai UTS\t:");
            nm[i].nilaiUTS = sc.nextInt();
            System.out.print("Masukkan nilai UAS\t:");
            nm[i].nilaiUAS = sc.nextInt();
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("Total Nilai Mahasiswa Mata Kuliah Algoritma Struktur Data");
        System.out.println("==========================================================");
        
        
        for(int i=0; i<jumlah; i++){
            System.out.println("Mahasiswa ke-" + (i+1)+ " : " + nm[i].namaMhs);
            System.out.println("Nilai tugas\t: " + nm[i].nilaiTugas + ", Nilai kuis\t:  " +  nm[i].nilaiKuis);
            System.out.println("Nilai uts\t: " + nm[i].nilaiUTS + ",Nilai uas\t\t: " + nm[i].nilaiUAS);
            System.out.println("Total nilai mahasiswa : " + nm[i].hitungTotalNilai(nm[i].nilaiTugas , nm[i].nilaiKuis , nm[i].nilaiUTS , nm[i].nilaiUAS));
            System.out.println("");
            
         
        }
        System.out.println("============================================================");
        System.out.println("");
        
        
        for(int i=0; i<jumlah; i++){
            System.out.println("Total nilai mahasiswa : " + nm[i].hitungTotalNilai(nm[i].nilaiTugas , nm[i].nilaiKuis , nm[i].nilaiUTS , nm[i].nilaiUAS) /4);
            
        }
        
        
        
        // TODO code application logic here
    }
    
}
