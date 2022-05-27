/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author Curso Mañana
 */
public class Matriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar matriz enteros de tamaño 3x2 (filas x columnas)
        int [][] m = new int [3][2];
        
        //Llenar la matriz
        //      0       1
        //0   (0,0)   (0,1)
        //1   (1,0)   (1,1)
        //2   (2,0)   (2,1)
        
        //Procedimiento manual
        m[0][0] = 5;
        m[0][1] = 6;
        m[1][0] = 7;
        m[1][1] = 8;
        m[2][0] = 9;
        m[2][1] = 10;
        
        //Mostrar la matriz
        for(int f=0; f < m.length; f++){ //Relleano las filas
            for (int c = 0; c < m[0].length; c++){
                System.out.print("("+f+","+c+")="+m[f][c]);
            }
            System.out.println();
        }
        
        
        
        
        
    }
    
}
