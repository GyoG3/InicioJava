/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifthenelse;

import java.util.Scanner;

/**
 *
 * @author Curso Mañana
 */
public class ValidarNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nota: ");
        nota = sc.nextDouble();
        if(nota >= 0 && nota < 5) {
            System.out.print("Reprobado");
        }else {
            if(nota >= 5 && nota <= 10){;
            System.out.println("Aprobado");
        }else {
            System.out.println("Nota no valida");
                }
    }
    
}
