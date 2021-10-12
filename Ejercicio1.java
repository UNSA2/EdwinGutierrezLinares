/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1;

/**
 *
 * @author Edwin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[]={1,2,3,4,5,6};
        reverseArray(A);
    }
    
    public static int[] reverseArray(int[] A) {
       int n=A.length;
       int v=0;
       for(int i=0; i<n/2; i++)
       {
           v = A[i];
           A[i] = A[n-1-i];
           A[n-1-i]=v;
                   
       }      
      
        return A;
    }
}
