/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector;

/**
 *
 * @author Curso Mañana
 */
public class VectorUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// CREAR UN VECTOR DE N ENTEROS
        int n = 5;
        int [] v = new int[n]; 
        
//LLENAR EL VECTOR
        for (int i=0; i<v.length; i++) {   //Indice de un vector siempre empieza en 0
            v[i] = i+1;
        }
//MOSTRAR EL VECTOR
       for (int i=0; i<v.length; i++) {
        System.out.println(v[i]);
       }
    }
    
}
