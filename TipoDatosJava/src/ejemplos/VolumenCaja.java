package ejemplos;

import java.util.Scanner;

public class VolumenCaja {
    //Elaborar un programa en que permita determinar el volumen de una caja de dimensiones A, B y C.
    public static void main(String args[]) {
        int largo, altura, ancho, volumen;
        largo = 20;
        altura = 30;
        ancho = 15;
        volumen = largo * altura * ancho;
        System.out.println("El volumen de la caja es: " + volumen);
    }
}

class VolumenCajaConsola {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el largo: ");

        int largo = lectura.nextInt();

        System.out.println("Ingrese la altura: ");

        int altura = lectura.nextInt();

        System.out.println("Ingrese el ancho: ");

        int ancho = lectura.nextInt();

        System.out.println("Los valore ingresador fueron:\n" + "largo: " + largo + " altura: " + altura + " y ancho: " + ancho);
        System.out.println("El volumen de la caja es: " + largo * altura * ancho);
    }
}