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

public class Ej5_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        for (int i = 1; i <= 5; i++) {
            do {
                System.out.print("Ingrese un numero entre 1 y 30: ");
                num = sc.nextInt();
            } while (num < 1 || num > 30);
            
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

