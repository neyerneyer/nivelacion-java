package primitivos.booleano;

public class DemoBooleano {
    public static void main(String args[]){
        boolean b = true;
        if (b == true)
            System.out.println("Hola Javeros esto es un demo booleano!");
    }
}
class Demo2Booleano{
    public static void main(String args[])
    {
        boolean boleano;

        boleano=false;
        System.out.println("boleano es: "+boleano);

        boleano=true;
        System.out.println("boleano es: "+boleano);

        //Un valor booleano puede contralar la sentencia if

        if(boleano) System.out.println("Esto si ejecutará.");

        boleano=false;
        if(boleano) System.out.println("Esto no se ejecutará.");

        //El resultado de un operador relacional es un valor booleano
        System.out.println("10 > 9 es "+ (10 > 9));
        System.out.println("20 > 10 es "+ (20 > 10));
        System.out.printf("La comparación es: "+"Bienvenido".equals("Welcome"));
    }
}