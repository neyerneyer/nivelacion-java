package ejemplos;

public class TablaDeMultiplicarWhile {
    public static void main(String[] args) {
        int n=8;
        int limite = 10;
        int contador = 1;
        while (contador <= limite) {
            int resultado = contador * n;
            System.out.println(n + " * " + contador + " = " + resultado);
            //contador=contador+1;
            contador++;
        }
    }
}
