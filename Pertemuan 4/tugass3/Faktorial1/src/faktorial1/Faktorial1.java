/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial1;

/**
 *
 * @author Ahmad Fachri
 */
public class Faktorial1 {

    /**
     * @param args the command line arguments
     */
     
        //Algoritma Brute Force
    public int faktorialBF(int n){
        int faktor = 1;
        int i = 1;
        
        while(i<= n){
            faktor = faktor*i;
            i++;
        }
        return faktor;
    }
}
        // TODO code application logic here
    
    
}
