/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejspoo5;

/**
 *
 * @author ap550
 */
import java.util.Scanner;

public class Ej5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de enteros que desea comparar: ");
        int n = input.nextInt();
        
        int menor = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el entero #" + (i+1) + ": ");
            int entero = input.nextInt();
            
            if (entero < menor) {
                menor = entero;
            }
        }
        
        System.out.println("El menor entero es: " + menor);
    }
}
