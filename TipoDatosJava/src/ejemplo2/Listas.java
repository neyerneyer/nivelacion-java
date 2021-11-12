package ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    //Listas de cualquier tipo
    List lista = new ArrayList();

    List <String> listaString = new ArrayList<String>();
    List<Integer> listasInteger = new ArrayList<Integer>();
    List<Double> listaDouble = new ArrayList<Double>();
    List<Object> listaObjeto = new ArrayList<Object>();
    List <Listas> listasClases = new ArrayList<>();

    //supongamos que queremos agregar los siguientes nombre: Juan, Pedro, Lucas, Maria, Luna
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Lucas");
        nombres.add("Maria");
        nombres.add("Luna");
        System.out.println(nombres);
        nombres.size();
        System.out.println(nombres.size());
        System.out.println(nombres.get(3));
        System.out.println("--------------------------");
        nombres.remove(4);
        System.out.println(nombres);
        nombres.add(4,"Juana");
        System.out.println("--------------------------");
        System.out.println(nombres);
        System.out.println(nombres.indexOf("Juana"));


    }

}
