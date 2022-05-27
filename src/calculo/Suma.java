/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo;

import java.util.Scanner;

/**
 *
 * @author Curso Mañana
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        // obligatoriamnete hay que definir el tipo de datos
        double n1, n2, s;
        System.out.print("Ingresar el numero 1: ");
        n1 = sc.nextDouble();
        System.out.print("Ingresar el numero 2: ");
        n2 = sc.nextDouble();
        s = n1 + n2;
        System.out.println("El resultado es: " + s);
        
        
    }
    
}
/*  Algoritmo Ejemplo53
	Escribir Sin Saltar "Ingresar el número 1? "; Leer n1
	Escribir Sin Saltar "Ingresar el número 2? "; Leer n2
	s <- n1 + n2
	Escribir "El resultado es: ", s
FinAlgoritmo

*/