/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author Curso Mañana
 */
public class Matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar una matriz 3x2 que almacene cadenas
        String [][] nombre = {{"Wale", "Gyo"},
                              {"Teto", "Yiyi"},
                              {"Dreito", "Maire"}};
        for (String[] nombre1 : nombre) {
            for (int col = 0; col < nombre[0].length; col++) {
                //System.out.print(nombre[fila][col] + "\t");
                System.out.printf("%-20s", "\"" + nombre1[col] + "\"");
            }
            System.out.println();
        }
    }
}
