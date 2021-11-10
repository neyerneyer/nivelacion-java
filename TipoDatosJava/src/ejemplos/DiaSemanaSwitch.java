package ejemplos;

import java.util.Scanner;

public class DiaSemanaSwitch {
    //Aplicando el control de flujo switch, realiza un programa
    // que al ingresar un día en números del 1 al 7 muestre el día en texto.
    public static void main(String[] args) {
        int numero = 2;
        switch(numero){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("ingreso otro numero");
                break;
        }
    }
}
class DiaSemanaSwitchConsola{
    public static void main(String[] args) {
        Scanner dias = new Scanner (System.in);
        System.out.println("ingrese un numero para saber a que dia de la semana pertenece");
        int numero = 0;
        while ( numero >7 || numero<1){
            numero =dias.nextInt();

            switch(numero){
                case 1:
                    System.out.println("lunes");
                    break;
                case 2:
                    System.out.println("martes");
                    break;
                case 3:
                    System.out.println("miercoles");
                    break;
                case 4:
                    System.out.println("jueves");
                    break;
                case 5:
                    System.out.println("viernes");
                    break;
                case 6:
                    System.out.println("sabado");
                    break;
                case 7:
                    System.out.println("domingo");
                    break;
                default:
                    System.out.println("ingreso otro numero");
                    break;
            }

        }
    }
}
