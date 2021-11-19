package automationjunit.asserts;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class AssertGemelos {
    //Los métodos assertSame() y assertNotSame(), comprueba si dos referencias de objetos apuntan al mismo objeto o no
    //Digamos que no es suficiente  que los objetos sean iguales, deben ser exactamente el mismo objeto
    @Test
    public void pruebaComparaIgualdadPorReferencia() {
        String dato = "hola";
        String valor = "hola";
        System.out.println("dato es: " + dato);
        System.out.println("dato es: " + valor);
        assertSame(dato, valor);

    }

    @Test
    public void pruebaComparaNoIgualdadPorReferencia() {
        String dato = "hola";
        String valor = new String("hola");
        String valor1 = new String("hola");
        System.out.println("dato es: " + dato);
        System.out.println("dato es: " + valor);
        Assert.assertNotSame(dato, valor);
        Assert.assertNotSame(valor1, valor);

    }
}
