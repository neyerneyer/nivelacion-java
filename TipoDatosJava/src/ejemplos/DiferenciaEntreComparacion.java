package ejemplos;

public class DiferenciaEntreComparacion {
    public static void main(String[] args) {
        String x = new String("Saludo");
        String y = new String("Saludo");

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}
