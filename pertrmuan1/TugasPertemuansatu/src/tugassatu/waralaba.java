/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassatu;
import java.util.Scanner;

/**
 *
 * @author Ahmad Fachri
 */
public class waralaba {
static Scanner sc = new Scanner(System.in);
    static String[][] makanan = {};
    public static int[] nilai = {20000};

    public static void main(String[] args) {
        int harga = 0, hargatotal = 0;
        System.out.println("-------menu------");
        for (String menulagi = "Y"; menulagi.equalsIgnoreCase("y");) {
            System.out.println("1. Paket Chicken");
            System.out.println("2. Paket Oke");
            System.out.println("3. Cetak total");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu (angka) : ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("Chicken a (12000)");
                    System.out.println("Chicken b (15000)");
                    System.out.println("Chicken c (20000)");
                    System.out.print("Pilih Menu (angka) : ");
                    int menu1 = sc.nextInt();
                    sc.nextLine();
                    switch (menu1) {
                        case 1:
                            harga = 12000;
                            break;
                        case 2:
                            harga = 15000;
                            break;
                        case 3:
                            harga = 20000;
                            break;
                        default:

                    }

                    break;
                case 2:
                    System.out.println("oke 1 (10000)");
                    System.out.println("oke 2 (12000)");
                    System.out.println("oke 3 (15000)");
                    System.out.print("Pilih Menu (angka) : ");
                    int menu2 = sc.nextInt();
                    sc.nextLine();
                    switch (menu2) {
                        case 1:
                            harga = 10000;
                            break;
                        case 2:
                            harga = 12000;
                            break;

                        case 3:
                            harga = 15000;
                            break;

                        default:

                    }

                    break;

                default:
                    System.out.println("Pilih salah satu menu!");
                    break;
            }
            System.out.println("Masukkan Jumlah : ");
            int jumlah = sc.nextInt();
            sc.nextLine();
            System.out.println("Apakah anda ingin memilih menu lagi?");
            menulagi = sc.nextLine();
            hargatotal += harga * jumlah;
        }
        System.out.println("total : " + hargatotal);
    }
}


   