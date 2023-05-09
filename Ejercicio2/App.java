package Ejercicio2;

import java.util.Scanner;
import java.util.Vector;

public class App {

    /**
     * Lee 50 personas desde el teclado.
     * @param v
     */
    public static void leerPersonas(Vector<Persona> v) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.capacity(); i++) {
            System.out.println("Edad: ");
            int edad = sc.nextInt();
            System.out.println("Sexo masculino o fememino(M/F): ");
            String sexo = sc.next();
            Persona.Sexo s = Persona.Sexo.M;
            if (sexo.equals("F")) {
                s = Persona.Sexo.F;
            }
            v.add(new Persona(edad, s));
        }
        sc.close();
    }

    /**
     * Calcula el número de personas mayores de edad
     * @param v Vector de personas
     * @return Número de personas mayores de edad
     */
    public static int calcularMayoresDeEdad(Vector<Persona> v) {
        int mayoresDeEdad = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).edad >= 18) {
                mayoresDeEdad++;
            }
        }
        return mayoresDeEdad;
    }

    public static int calcularMenoresDeEdad(Vector<Persona> v) {
        int menoresDeEdad = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).edad < 18) {
                menoresDeEdad++;
            }
        }
        return menoresDeEdad;
    }

    /**
     * Calcula el número de personas masculinas mayores de edad
     * @param v Vector de personas
     * @return Número de personas masculinas mayores de edad
     */
    public static int calcularMasculinasMayoresDeEdad(Vector<Persona> v) {
        int masculinasMayoresDeEdad = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).sexo == Persona.Sexo.M && v.get(i).edad >= 18) {
                masculinasMayoresDeEdad++;
            }
        }
        return masculinasMayoresDeEdad;
    }

    /**
     * Calcula el número de personas femeninas menores de edad
     * @param v Vector de personas
     * @return Número de personas femeninas menores de edad
     */
    public static int calcularFemeninasMenoresDeEdad(Vector<Persona> v) {
        int femeninasMenoresDeEdad = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).sexo == Persona.Sexo.F && v.get(i).edad < 18) {
                femeninasMenoresDeEdad++;
            }
        }
        return femeninasMenoresDeEdad;
    }

    /**
     * Calcula el número de personas femeninas
     * @param v Vector de personas
     * @return Número de personas femeninas
     */
    public static int calcularFemeninas(Vector<Persona> v) {
        int femeninas = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).sexo == Persona.Sexo.F) {
                femeninas++;
            }
        }
        return femeninas;
    }

    /**
     * Muestra las estadísticas del conjunto de personas
     * según el enunciado del ejercicio.
     * - Personas totales +18
     * - Personas totales -18
     * - Personas masculinas +18
     * - Personas femeninas -18
     * - % +18 sobre el total
     * - % de femeninas sobre el total
     */
    public static void mostrarEstadisticas(Vector<Persona> v) {
        final int mayoresDeEdad = calcularMayoresDeEdad(v);
        final int menoresDeEdad = calcularMenoresDeEdad(v);
        final int masculinasMayoresDeEdad = calcularMasculinasMayoresDeEdad(v);
        final int femeninasMenoresDeEdad = calcularFemeninasMenoresDeEdad(v);
        final float porcentajeMayoresDeEdad = mayoresDeEdad / (float) v.size() * 100;
        final float porcentajeFemeninas = calcularFemeninas(v) / (float) v.size() * 100;

        System.out.println("Personas mayores de edad: " + mayoresDeEdad);
        System.out.println("Personas menores de edad: " + menoresDeEdad);
        System.out.println("Personas masculinas mayores de edad: " + masculinasMayoresDeEdad);
        System.out.println("Personas femeninas menores de edad: " + femeninasMenoresDeEdad);
        System.out.println("% de personas mayores de edad: " + porcentajeMayoresDeEdad);
        System.out.println("% de personas femeninas: " + porcentajeFemeninas);
    }

    public static void main(String[] args) {
        Vector<Persona> personas = new Vector<Persona>(3);
        leerPersonas(personas);
        mostrarEstadisticas(personas);
    }
}
