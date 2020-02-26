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
public class Mainsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("Program menghitung keuntungan total(satuan juta, Misal 5,9)");
        System.out.println("Masukkan jumlah bulan :  ");
        int elm = sc.nextInt();
        
        Sum sm = new Sum (elm);
        System.out.println("=============================================");
        for (int i = 0; i < sm.elemen; i++){
            System.out.println("Masukkan untung bulan ke - " + (i+1)+ " = ");
            sm.keuntungan[i] = sc.nextDouble();
            
        }
        System.out.println("===============================================");
        System.out.println("Algoritma brute force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("===============================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + "bulan adalah = " + sm.totalDC(sm.keuntungan, 0,sm.elemen-1));
    }
    
}
