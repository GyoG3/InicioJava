/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclefor;

import java.util.Scanner;

/**
 *
 * @author Curso Mañana
 */
public class LetraCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Todo bucle tiene
        //Inicio--Final(Condicion)--Incremento
        //Serie 1...n
        int n = 10;
        int m = 10;
        int o = -5;
        System.out.println("Serie de uno en uno");
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
        System.out.println("Serie de dos en dos");
        for(int i=1; i<=n; i=i+2){
            System.out.println(i);
        }
        System.out.println("Serie de decremento negativo");
        for(int i=o; i<=-1; i++) {
            System.out.println(i);
        }
        
        //Romper un bucle
        int p = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if(i==5) break;
        }
        
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Ingrese palabra: ");
        cadena = sc.next();     //Si la palabra fuese HOLA, la longitud de la cadena seria 0123
        System.out.println("Tamano: " + cadena.length());
        for (int i=0; i < cadena.length(); i++){
            System.out.print(cadena.charAt(i));
        }
        
        String cadenauno;
        System.out.print("Ingrese palabra: ");
        cadenauno = sc.nextLine();     //Oraciones
        System.out.println("Tamano: " + cadenauno.length());
        for (int i=0; i < cadenauno.length(); i++){
            System.out.print(cadenauno.charAt(i));
        }
        
        
    }
    
}
