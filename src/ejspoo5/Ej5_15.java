/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejspoo5;

/**
 *
 * @author ap550
 */
public class Ej5_15 {
    public static void main(String[] args) {
        
        // Patrón (a)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        
        System.out.println(); // Espacio entre patrones
        
        // Patrón (b)
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        
        System.out.println(); // Espacio entre patrones
        
        // Patrón (c)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        
        System.out.println(); // Espacio entre patrones
        
        // Patrón (d)
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

