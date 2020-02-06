/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslimaa;
import java.util.Scanner;

/**
 *
 * @author Ahmad Fachri
 */
public class luAsjava { static Scanner sc = new Scanner(System.in);

    static void menu(){
    System.out.println("==========MENU============");
    System.out.println("1. Luas segitiga");
    System.out.println("2. Luas segiempat");
    System.out.println("3. Luas lingkaran");
    System.out.println("4. Exit");
    System.out.println("======================");
    }
    static void memilih() {
        int menu;
        System.out.print("Pilih Menu: ");
        menu = sc.nextInt();
        switch (menu) {
            
            case 1:
                segitiga();
                System.out.println("===========1===========");
                menu();
                memilih();
                break;
                
                case 2:
                segiempat();
                System.out.println("===========2===========");
                menu();
                memilih();
                break;
                     
                case 3:
                lingkaran();
                System.out.println("===========3===========");
                menu();
                memilih();
                break;
                    
                case 4:
                System.out.println("Selamat menu yang anda pilih berhasil dijalankan !");
                System.exit(0);
        
                default:
                System.out.println("Maaf! Menu yang anda masukkan tidak ada dalam daftar!");
        }
    }
    static void segitiga() {
       int alas, tinggi;
	float luas;
	System.out.print("Masukkan alas: ");
	alas = sc.nextInt();
	System.out.print("Masukkan tinggi: ");
	tinggi = sc.nextInt();
	luas = alas * tinggi / 2;
	System.out.println("Luas Segitiga = " + luas);
        System.out.println();
    }
    static void segiempat(){
        int sisi,luas; 
        System.out.print("Masukkan sisi: ");
        sisi = sc.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas Segiempat = " + luas);
        System.out.println();
    } 
    static void lingkaran(){
       	float phi = 3.14F, jari2,luas;
	System.out.print("Masukkan jari-jari : ");
	jari2 = sc.nextInt();
	luas = phi * jari2 * jari2;
	System.out.print("luas = " + luas);
        System.out.println();
    }
 public static void main(String[] args) {
 menu();
 memilih();
    }
}