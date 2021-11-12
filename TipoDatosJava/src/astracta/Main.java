package astracta;

public class Main {
    public static void main(String[] args) {
        String colorCuadrado = "Verde";
        double ladoCuadrado = 2.5;
        Cuadrado cuadrado = new Cuadrado(colorCuadrado,ladoCuadrado);
        System.out.println("El area del cuadrado " + cuadrado.getColor() + " es: " + cuadrado.calcularArea());

        String colorTriangulo = "Rojo";
        double baseTriangulo = 8.5;
        double alturaTriangulo = 2.5;
        Triangulo triangulo = new Triangulo(colorTriangulo,baseTriangulo,alturaTriangulo);
        System.out.println("El area del triangulo " + triangulo.getColor() + " es: " + triangulo.calcularArea());

    }
}
