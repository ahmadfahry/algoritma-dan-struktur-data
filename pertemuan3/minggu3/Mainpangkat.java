/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;
import java.util.Scanner;

/**
 *
 * @author Ahmad Fachri
 */
public class Mainpangkat {
    Scanner sc = new Scanner(System.in);
    {
        System.out.println("=====================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        pangkat []png = new pangkat [elemen];
        for (int i = 0; i < elemen; i++){
            png[i]= new pangkat();
            System.out.println("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+"  : ");
            png[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat ke - "+(i+1)+"  : ");
             png[i].pangkat = sc.nextInt();
             
             System.out.println("====================================");
             System.out.println("Hasil pangkat dengan Brute force");
             
         
        }
        for (int i = 0; i < elemen; i++){
            System.out.println("Nilai" + png[i].nilai+" pangkat " + png[i].pangkat+"adalah : " +png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("===========================================");
        System.out.println("Hasil pangkat dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++){
         System.out.println("Nilai" + png[i].nilai+" pangkat " + png[i].pangkat+"adalah : " +png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        
    }
    }
}
    
    

