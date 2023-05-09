package Ejercicio3;

import java.util.Scanner;

public class App {
    /**
     * Lee las horas trabajadas desde el teclado.
     * @param sc Scanner
     * @return Horas trabajadas
     */
    public static float leerHorasTrabajadas(Scanner sc) {
        return sc.nextFloat();
    }

    /**
     * Lee la tarifa desde el teclado.
     * @param sc Scanner
     * @return Tarifa
     */
    public static float leerTarifa(Scanner sc) {
        return sc.nextFloat();
    }

    /**
     * Calcula el salario según el enunciado.
     * @param horasTrabajadas
     * @param tarifa
     * @return Salario
     */
    public static float calcularSalario(float horasTrabajadas, float tarifa) {
        final float MULTIPLICADOR_HORAS_EXTRA = 1.5F;
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifa;
        }
        else {
            return 40 * tarifa + (horasTrabajadas - 40) * tarifa * MULTIPLICADOR_HORAS_EXTRA;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final float HORAS_TRABAJADAS = leerHorasTrabajadas(sc);
        final float TARIFA = leerTarifa(sc);
        final float SALARIO = calcularSalario(HORAS_TRABAJADAS, TARIFA);
        System.out.println("Salario: " + SALARIO); 

        sc.close();
    }
}
