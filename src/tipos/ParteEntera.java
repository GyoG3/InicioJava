/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipos;

/**
 *
 * @author Curso Mañana
 */
public class ParteEntera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double x = 2.345659938;
    int y = (int)x;
    double z = x - y;
    double m = x * 100;
    int n = (int)(x*100);
    double o = ((int)(x*100))/(double)100;
    double m1 = Math.round(x*100.0)/100.0;
    System.out.println("y = " + y);
    System.out.println("z = " + y);
    System.out.println("m = " + y);
    System.out.println("n = " + y);
    System.out.println("m1 = " + m1);
    }
    
}
