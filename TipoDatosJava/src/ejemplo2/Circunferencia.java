package ejemplo2;

public class Circunferencia {
    private static float pi = 3.1415926535f;
    private float radio = 0f;

    public Circunferencia(float radio) {
        this.radio = radio;
    }
    public static float area(float radio){
        return pi*(radio*radio);
    }

    public float areaSinStatic(){
       return pi*(radio*radio);
    }

    public static void main(String[] args) {
        System.out.println(Circunferencia.pi);
        System.out.println(Circunferencia.area(97f));
        Circunferencia circunferencia = new Circunferencia(74f);
        System.out.println(circunferencia.areaSinStatic());
    }
}
