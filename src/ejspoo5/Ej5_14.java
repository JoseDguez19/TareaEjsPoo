/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejspoo5;

/**
 *
 * @author ap550
 */
public class Ej5_14 {
        public static void main(String[] args) {
        Deitel_5_14 ejemplo = new Deitel_5_14();
        ejemplo.Interes();
    }
}

class Deitel_5_14 {
    private double monto;
    private double principal = 1000;

    public void Interes() {
        for(double tasa = 0.05; tasa <= 0.1; tasa += 0.01) {
            System.out.printf("\n%s%20s", "Anio", "Monto en deposito");
            System.out.printf(" para una tasa igual a: %.2f\n", tasa);

            for(int anio = 1; anio <= 10; anio++) {
                monto = principal * Math.pow(1.0 + tasa, anio);
                System.out.printf("%4d%,20.2f\n", anio, monto);
            }

            System.out.println("\n");
        }
    }

}
