package Ejercicio2;
public class Persona {
    public enum Sexo {
        M, F
    }

    public int edad;
    public Sexo sexo;
    
    public Persona() {
        this.edad = -1;
        this.sexo = Sexo.M;
    }

    public Persona(int edad, Sexo sexo) {
        this.edad = edad;
        this.sexo = sexo;
    }

}
