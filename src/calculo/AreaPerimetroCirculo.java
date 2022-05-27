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
public class AreaPerimetroCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Perimetro: 2 * Math.PI * r
        // Area: Math.PI * Math.pow(r, 2)
        
        double r, a, p;
        System.out.print("Ingrese radio: ");
        r = sc.nextDouble();
        a = Math.PI * Math.pow(r, 2);
        p = 2 * Math.PI * r;
        System.out.println("El area del circulo es: " + ((int) (a * 100)) / (double) 100 + " cm2");
        System.out.println("El perimetro del circulo es: " + ((int) (p * 100)) / (double) 100 + " cm");
                
    }
    
}
