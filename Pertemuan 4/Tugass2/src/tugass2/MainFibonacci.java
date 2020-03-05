/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugass2;
import static tugass2.Fibonacci.angka;
import static tugass2.Fibonacci.hitung1;
import static tugass2.Fibonacci.hitung2;
import java.util.Scanner;

/**
 *
 * @author Ahmad Fachri
 */
public class MainFibonacci {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci[] fb = new Fibonacci[angka];
        System.out.print("Masukkan Angka : ");
        angka = sc.nextInt();
        
        System.out.println("Hasil Bilangan Fibonacci");
        for(int i=0; i<angka; i++){
            if(i == 0 || i == 1){
                continue;
            }
            int hitung = hitung1 + hitung2;
            System.out.println(hitung1 + " + " + hitung2 + " = " + hitung);
            hitung1 = hitung2;
            hitung2 = hitung;
        }
        
        System.out.println("Hasil Bilangan Fibonacci dengan Brute Force");
        for(int i=0; i<angka; i++){
            int hasil = FibonacciBf(i);
            System.out.print(hasil + " ");
        }
    }

}