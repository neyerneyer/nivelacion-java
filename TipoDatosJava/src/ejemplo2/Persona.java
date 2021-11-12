package ejemplo2;

public class Persona {
    // Realizar un programa que solicite a un persona el nombre, pais  y edad y que muestre la acción de comer o cantar
    //para alguna persona que se ingrese
    private String nombre;
    private String pais;
    private int edad;

    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer(){
        System.out.println("Comer");
    }
    public void cantarMucho(){
        System.out.println("Cantar");
    }

}
