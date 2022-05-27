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
public class FindCapicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ca, s = "";
        System.out.println("ingrese la cadena de texto");
        ca = sc.nextLine();

        for (int i = ca.length() - 1; i >= 0; i--) {
            s = s + ca.charAt(i);
        }
        if (ca.equals(s)) {
            System.out.println("es capicua");
        } else {
            System.out.println("no es capicua");
        }
        System.out.println(s + "    " + ca);
    }
    
}
