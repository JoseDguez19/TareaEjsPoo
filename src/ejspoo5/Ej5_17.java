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

public class Ej5_17 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precios = {2.98, 4.50, 9.98, 4.49, 6.87};
        int producto, cantidad;
        double totalVenta = 0.0;
        
        System.out.println("Ingrese el numero del producto y la cantidad vendida. Ingrese 0 0 para terminar.");
        do {
            System.out.print("Producto: ");
            producto = sc.nextInt();
            System.out.print("Cantidad: ");
            cantidad = sc.nextInt();
            
            switch (producto) {
                case 1:
                    totalVenta += cantidad * precios[0];
                    break;
                case 2:
                    totalVenta += cantidad * precios[1];
                    break;
                case 3:
                    totalVenta += cantidad * precios[2];
                    break;
                case 4:
                    totalVenta += cantidad * precios[3];
                    break;
                case 5:
                    totalVenta += cantidad * precios[4];
                    break;
                default:
                    if (producto != 0 || cantidad != 0) {
                        System.out.println("Producto invalido. Intente nuevamente.");
                    }
                    break;
            }
            
        } while (producto != 0 || cantidad != 0);
        
        System.out.printf("El valor total de venta es: $%.2f", totalVenta);
        sc.close();
    }
}

