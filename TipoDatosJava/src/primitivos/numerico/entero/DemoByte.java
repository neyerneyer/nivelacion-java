package primitivos.numerico.entero;

public class DemoByte {
    public static void main(String args[])
    {
        byte a = 126;

        // byte tiene un valor de 8 bits
        System.out.println(a);

        a++;
        System.out.println(a);

        // Se desborda aquí porque
        // el byte puede contener valores de -128 a 127
        a++ ;
        System.out.println(a);

        // bucle dentro del rango
        a++;
        System.out.println(a);

        a++ ;
        System.out.println(a+127);
    }
}
