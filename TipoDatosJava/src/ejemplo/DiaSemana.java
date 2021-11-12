package ejemplo;

import java.util.Scanner;

public class DiaSemana {
    //Aplicando el control de flujo switch, realiza un programa que al ingresar un día en números del 1 al 7
    // muestre el día en texto.

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero para conocer el dia de la semana");
        byte dia = numero.nextByte();
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia no existe");

        }
    }
}
