/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3;

/**
 *
 * @author Edwin
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        recTriangle(5);
        
    }
    public static void recTriangle(Integer b) {
        
        if (b==1){
            System.out.println("*");
        }else{
            recTriangle(b-1);
            for(int i=0; i<b; i++){
                System.out.print("* ");
            }
            System.out.println("");
            
        }
    }
    
    
    
}
