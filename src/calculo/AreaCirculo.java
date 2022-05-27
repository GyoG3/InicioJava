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
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Calcular el area de un circulo
        Scanner sc = new Scanner (System.in);
        // obligatoriamnete hay que definir el tipo de datos
        double a, r;
        System.out.print("Ingresar el valor del radio del circulo: ");
        r = sc.nextDouble();
        a = Math.PI * Math.pow(r, 2);   //r*r
        System.out.println("El area del circulo es: " + a);
        System.out.println("El area del circulo es: " + a);
    }
    
}

/*  Algoritmo Ejemplo72
	//Calcular el area de un circulo
	Escribir Sin Saltar "Ingrese radio? "; Leer r
	a <- PI * r^2
	Escribir "Area del circulo: ", a
	Escribir "Area circulo: ", TRUNC(a*100)/100
	Escribir "Area circulo: ", TRUNC(a*1000)/1000
FinAlgoritmo
*/

