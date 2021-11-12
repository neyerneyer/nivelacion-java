package ejemplo;

public class BucleWhile {
    //numero impares del 1 al 25

    public static void main(String[] args) {
        byte i = 1;
        while (i <= 25) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

    }

}

class TablaMultiplicarWhile {
    public static void main(String[] args) {
        int n = 7;
        int limite = 10;
        int contador = 1;
        while (contador <= limite) {
            int resultado = contador * n;
            System.out.println(n + " * " + contador + " = " + resultado);
            contador++;
           // contador = contador + 1;
        }
    }
}
