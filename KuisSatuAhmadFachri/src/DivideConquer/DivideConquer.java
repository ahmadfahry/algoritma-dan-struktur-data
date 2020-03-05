/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivideConquer;

/**
 *
 * @author Ahmad Fachri
 */
public class DivideConquer {
  
       static void DivideConquer(int n, char tower1, char tower3, char tower2) {
       if (n == 1) 
        { 
            System.out.println("Pindah 1 gelang dari tower " +  tower1 + " ke tower " + tower3); 
            return; 
        } 
        DivideConquer(n-1, tower1, tower2, tower3); 
        
        System.out.println("Pindah Gelang " + n + " Dari Tower " +  tower1 + " Ke tower " + tower3); 
        DivideConquer(n-1, tower2, tower3, tower1); 
    }   
 
    public static void main(String args[]) 
    { 
        int n = 4;  //Jumlah Gelang
        DivideConquer(n, 'A', 'C', 'B');   //A,B,C Adalah nama dari Tower
    }
    
}