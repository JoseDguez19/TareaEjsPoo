/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejspoo5;

/**
 *
 * @author ap550
 */
public class Ej5_12 {
    
    public static void main(String[] args) {
        int producto = 1;
        
        for (int i = 1; i <= 15; i += 2) {
            producto *= i;
        }
        
        System.out.println("El producto de los enteros impares del 1 al 15 es: " + producto);
    }
}

