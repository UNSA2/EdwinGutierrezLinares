/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejericicio2;

/**
 *
 * @author Edwin
 */
public class Ejericicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int d=3;
        rotateLeft(a,d);
    }
    public static int[] rotateLeft(int[] arr, int d) {
        int v=0;
        for(int i=0;i<d;i++)
        {
            for(int x=0; x< arr.length-1;x++)
            {
                v = arr[x];
                arr[x] = arr[x+1];
                arr[x+1] = v;
            }
        }
               
        return arr;
    }
    
}
