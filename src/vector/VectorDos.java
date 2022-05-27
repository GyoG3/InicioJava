/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector;

import java.util.Scanner;

/**
 *
 * @author Curso Mañana
 */
public class VectorDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
    // CREAR UN VECTOR DE N ENTERO PERO DEFINIDO POR TECLADO    
        System.out.print("Ingrese el tamaño del vector: ");
        n = sc.nextInt();
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
