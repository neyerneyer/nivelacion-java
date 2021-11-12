package ejemplo;

public class DemoNumero {
    public static void main(String[] args) {
        int numero1 = 35;
        int numero4 = 35;
        float numero6;
        float numero2 = 5.6f;
        float numero5 = 5.6f;
        double numero3 = 100.895;
        int n;
        numero6 = numero1 + numero4;
        numero3 = numero2;
        System.out.println("El valor del numero es: " + numero2);
        System.out.println("El valor del numero es: " + numero3);
        System.out.println(numero6);
        System.out.println("suma es: " + (numero1 + numero4));
        System.out.println("Resta es: " + (numero1 - numero4));
        System.out.println("Multiplicación es: " + numero1 * numero4);
        n = numero1 * numero4;
        // porcentaje =(obtuve puntaje * 100)/puntaje total
        float porcertange = ((n*100)/10000);
        System.out.println("porcentaje= "+porcertange);
        System.out.println("Divisor es: " + numero1 / numero4);
        System.out.println("Residuo es: " + numero1 % numero4);
    }
}
