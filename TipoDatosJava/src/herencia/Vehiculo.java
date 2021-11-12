package herencia;

public class Vehiculo {
    //Realizar un programa donde se encuentra una clse Taxi y Autobus con caracteristicas similares como:
    //encendido, apagado, matricula,modelo y potencia. Podria resumirse esos elemento en comùn en una clase padre
    //(Vehiculo) y las clases hijo o subclases (Taxi y AutoBus)heredar lo de la clase padre.

    //atributos
    private String matricula;
    private String modelo;
    private int potencia;

    //Set:modificador y el get: obtener información
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void encerderVehiculo(){
        System.out.println("El vehiculo está encendido");
    }
    public void apagarVehiculo(){
        System.out.println("El vehiculo está apagado");
    }

}
