package Ejercicio1;
import java.util.Scanner;

public class App {

    /**
     * Imprime los numeros impares desde n hasta 1
     * y los pares desde n hasta 0
     * @param n numero entero positivo
     */
    public static void listar(final int n) {
        boolean esPar = (n % 2) == 0;
        int stop = esPar?0:1;
        for (int i = n; i >= stop; i -= 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        listar(numero);
    
        sc.close();
    }
}
