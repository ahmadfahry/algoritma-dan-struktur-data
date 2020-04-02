/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Ahmad Fachri
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void LigaInggris(String[] args) {
        System.out.println("Soal Tipe A");
        System.out.println("Nama\t\t\t\t:AHMAD FACHRI");
        System.out.println("NIM\t\t\t\t\t:1941720121");
        System.out.println("KELAS\t\t\t\t:TI-1F");
        
        Scanner sc= new Scanner (System.in);
        String angka,hasil,Nilaitinggi = null,Nilairendah = null;
        int angka1=20,angka2=70,angka3=90,jumlah1,jumlah2,jumlah3,kurang1,kurang2,kurang3,kurang4,kurang5,kurang6,rata2;
        angka1 = sc.nextInt();
        angka2 = sc.nextInt();
        angka3 = sc.nextInt();
        System.out.println("angka pertama\t: " + angka1);
        System.out.println("angka kedua\t: " + angka2);
        System.out.println("angka ketiga\t: " + angka3);
        
        jumlah1 = angka1+angka2;
        jumlah2 = angka2+angka3;
        jumlah3 = angka1+angka3;
        kurang1 = angka1-angka2;
        kurang2 = angka2-angka3;
        kurang3 = angka2-angka1;
        kurang4 = angka1-angka3;
        kurang5 = angka3-angka2;
        kurang6 = angka3-angka1;
        
        
        if(jumlah1 == angka3 || kurang1 == angka3) {
          System.out.println("BENAR");
          rata2 = (angka1 + angka2 + angka3) / 2;
          System.out.println("Rata - rata = " + rata2);
          if(rata2 > 80) {
              System.out.println("NilaiTinggi");
              System.out.println("============================");
          }
          else {
              System.out.println("NilaiRendah");
              System.out.println("=============================");
          }
        }
        
        
          else if(jumlah2 == angka1 || kurang2 == angka1) {
                  System.out.println("BENAR");
                  rata2 = (angka1 + angka2 + angka3) / 2;
                  System.out.println("Rata - rata = " + rata2);
                  if(rata2 > 80){
                  }
                      else if (jumlah3 == angka2 || kurang3 == angka2) {
                              System.out.println("BENAR");
                              rata2 = (angka1 + angka2 + angka3) / 2;
                              System.out.println("Rata - rata = " + rata2);
                              if(rata2 > 80) {
                                  System.out.println("NilaiTinggi");
                                  System.out.println("==========================");
                              }
                              else {
                                  System.out.println("NilaiRendah");
                                  System.out.println("===========================");
                                  
                              }
                              
                      }}
                      else if (jumlah1 == angka3 || kurang4 == angka3) {
                          System.out.println("BENAR");
                          rata2 = (angka1 + angka2 + angka3) / 2;
                          System.out.println("Rata - rata = " + rata2);
                          if(rata2 > 80){
                              System.out.println("NilaiTinggi");
                              System.out.println("================================");
                              
                          }
                          else {
                              System.out.println("NilaiRendah");
                              System.out.println("================================");
                              
                          }
                          
                      }
                      else if (jumlah2 == angka1 || kurang5 == angka1) {
                          System.out.println("BENAR");
                          rata2 = (angka1 + angka2 + angka3) / 2;
                          System.out.println("Rata - rata = " + rata2);
                          if(rata2 > 80) {
                              System.out.println("NilaiTinggi");
                              System.out.println("==================================");
                              
                          }
                          else {
                              System.out.println("NilaiRendah");
                              System.out.println("=================================");
                              
                          }
                          
                      }
                      else if (jumlah3 == angka2 || kurang6 == angka2) {
                          System.out.println("BENAR");
                          rata2 = (angka1 + angka2 + angka3) / 2;
                          System.out.println("Rata - rata = " + rata2);
                          if(rata2 > 80) {
                              System.out.println("NilaiTinggi");
                              System.out.println("==================================");
                              
                          }
                               
                          else {
                              System.out.println("NilaiRendah");
                              System.out.println("=================================");
                              
                          }
                          
                      }
                      else { 
                          System.out.println("SALAH");
                          
                       
                              
                              
                              
                          
                          
                  
                          
                  
                              
                          
                              
                                          
                                          
                              
                              
                              }
                  
                  
        
                  }
          }
              
          
        
        
        
        
        
        
        // TODO code application logic here
    
    

