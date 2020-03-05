/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;
import java.util.Scanner;


/**
 *
 * @author Ahmad Fachri
 */
public class minMax {
    public int nilaiArray;
    
    public static void main(String[] args) {
        minMax[]ppArray = new minMax [5];
        ppArray[0] = new minMax();
        
        
        Scanner sc = new Scanner(System.in);
        
        
       for(int i=0; i<5; i++){
           ppArray[i]=new minMax();
           System.out.println("Nilai Array indeks ke -" + i);
           System.out.println("Masukkan nilai : ");
           ppArray[i].nilaiArray = sc.nextInt();
           
       }
       int min = ppArray[0].nilaiArray;
       int Max = ppArray[0].nilaiArray;
       for(int i=0; i<5; i++){
           if (ppArray[i].nilaiArray < min)
               min = ppArray[i].nilaiArray;
           else if (ppArray[i].nilaiArray>Max)
               Max = ppArray[i].nilaiArray;
    }
        System.out.println("Brute force");
        System.out.println("Nilai minimal : " + min);
        System.out.println("Nilai maximal : " + Max);
    
}
}
