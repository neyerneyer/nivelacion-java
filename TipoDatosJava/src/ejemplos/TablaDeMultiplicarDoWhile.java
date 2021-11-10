package ejemplos;

public class TablaDeMultiplicarDoWhile {
    public static void main(String[] args) {
        int numero=3;
        int multiplicador = 1;
        do {  System.out.println (numero + " X " + multiplicador + " = " + numero * multiplicador );
            multiplicador += 1;
        } while(multiplicador<=10);
    }
}
