/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author Ahmad Fachri
 */
public class Sum {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    Sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
        
        
            
        }
    double totalBF(double arr[]){
        
        for (int i = 0; i < elemen; i++){
            total = total + arr[i];
            
        }
            return total;
        }
    double totalDC(double arr[], int l , int r){
    if(1==r)
      return arr[1];
    else if(1<r){
        int mid=(1+r)/2;
        double lsum=totalDC(arr,l,mid-l);
        double rsum=totalDC(arr,mid+l,r);
        return lsum+rsum+arr[mid];
        
        
                
    }
return 0;

}
    
    
}

        
    
        
        
    
    

