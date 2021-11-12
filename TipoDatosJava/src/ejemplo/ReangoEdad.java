package ejemplo;

import java.util.Scanner;

public class ReangoEdad {
    /*
     * Aplicando el control de flujo if, elabora un programa que muestre un mensaje de acuerdo a la edad de una persona:
     *  Si la edad es de 0 a 10 años “niño”, si la edad es de 11 a 14 Años “pre- adolescente”, si la edad es de 15 a 18
     * años “adolescente”, si la edad es de 19 a 25 años “joven”, si la edad es de 26 a 65 años “adulto”, si la edad es
     *  Mayor de 65 “anciano”.
     */
    public static void main(String[] args) {
        byte edad = 10;

        if (edad >= 0 && edad <= 10) {
            System.out.println("Eres un niño");
        } else if (edad >= 11 && edad <= 14) {
            System.out.println("Eres un pre- adolescente");
        } else if (edad >= 15 && edad <= 18) {
            System.out.println("Eres un adolescente");
        } else if (edad >= 19 && edad <= 25) {
            System.out.println("Eres un joven");
        } else if (edad >= 26 && edad <= 65) {
            System.out.println("Eres un adulto");
        }else if(edad>65){
            System.out.println("Eres un anciano");
        }else {
            System.out.println("Edad erronea");
        }
    }
}
class RangoEdadConsola{
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = lectura.nextInt();

        if (edad >= 0 && edad <= 10) {
            System.out.println("Eres un niño");
        } else if (edad >= 11 && edad <= 14) {
            System.out.println("Eres un pre- adolescente");
        } else if (edad >= 15 && edad <= 18) {
            System.out.println("Eres un adolescente");
        } else if (edad >= 19 && edad <= 25) {
            System.out.println("Eres un joven");
        } else if (edad >= 26 && edad <= 65) {
            System.out.println("Eres un adulto");
        }else if(edad>65){
            System.out.println("Eres un anciano");
        }else {
            System.out.println("Edad erronea");
        }
    }
}
