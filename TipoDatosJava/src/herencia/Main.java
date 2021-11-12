package herencia;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        AutoBus autoBus = new AutoBus();
        Taxi taxi = new Taxi();

        vehiculo.apagarVehiculo();
        autoBus.apagarVehiculo();
        taxi.apagarVehiculo();
        autoBus.encerderVehiculo();
        taxi.encerderVehiculo();
    }
}
