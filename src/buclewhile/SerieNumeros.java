/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclewhile;

import java.util.Scanner;

/**
 *
 * @author Curso Mañana
 */
public class SerieNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inicio fin(condicion) incremento
        //1 2 ... n
        Scanner sc = new Scanner(System.in);
        {
            int i = 1, n;
            System.out.print("Ingrese n: ");
            n = sc.nextInt();
            while(i<=n){
                System.out.println(i);
                i = i + 1 //i++
            }
        }
        Scanner sc1 = new Scanner(System.in);
        { //Bloque de codigo
            String ca;
            System.out.print("Ingrese la cadena: ");
            ca = sc1.nextLine();     //Controla el retorno de carro
            System.out.print("Longitud: " + ca.length());
            if (ca.length() > 0){
                for (int i = 0; i < ca.length(); i++){
                    if (i % 2 == 0){
                        System.out.print(ca.charAt(i));
                    }
            }
            }
                   
        }
    }
    
}
