package ejemplo;

public class Datos {
    public static void main(String[] args) {
        boolean booleano;
        booleano = false;
        System.out.println("Boleano es: " + booleano);
        booleano = true;
        System.out.println("Boleano es: " + booleano);
        if (booleano) System.out.println("Esto si se va a ejecutar");
        booleano = false;
        if (booleano) System.out.println("Esto no se va a ejecutar");
        boolean insta = (10 > 9);
        System.out.println("10 > 9 es " + insta);
        System.out.println("20 < 9 es " + (20 < 9));
        System.out.print("La comparacion es: " + "Bienvenidos".equals("Welcome"));
    }
}
