package ejemplo2;

public class Main {
    public static void main(String[] args) {
        Persona diego = new Persona();
        diego.setNombre("Diego Maradona");
        diego.setEdad(22);
        diego.setPais("Argentina");

        System.out.println(diego.getNombre());
        System.out.println(diego.getEdad());
        System.out.println(diego.getPais());
        diego.comer();

        Persona karen = new Persona();
        karen.setNombre("Karen Maradona");
        karen.setEdad(30);
        karen.setPais("Colombia");
        System.out.println(karen.getNombre());
        System.out.println(karen.getEdad());
        System.out.println(karen.getPais());
        karen.comer();
        karen.cantarMucho();

    }
    // Realizar un programa  que pida marca de carro, color, cantidad de puertas, modelo del carro,
    // y que este con gasolina full o en reserva
}
