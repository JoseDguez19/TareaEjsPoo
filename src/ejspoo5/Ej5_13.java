/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejspoo5;

/**
 *
 * @author ap550
 */
public class Ej5_13 {
    public static void main(String[] args) {
        System.out.println("n\tn!");
        
        for (int i = 1; i <= 5; i++) {
            int factorial = 1;
            
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            
            System.out.println(i + "\t" + factorial);
        }
    }
}
