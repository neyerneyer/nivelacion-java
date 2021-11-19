package automationjunit.asserts;

import org.junit.Assert;
import org.junit.Test;

public class AssertVacio {
//Los métodos assertNull() y assertNotNull(), nos ayudan a validar si un resultado es nulo o no.
    @Test
    public void pruebaCompararSiEsNuloONo(){
        String dato1 = null;
        String dato2 = "Hola vacio";
        int num = 1;
        //Exitoso
        Assert.assertNull(dato1);
        //Fallido
        Assert.assertNull(dato2);
        //Exitoso
        Assert.assertNotNull(dato2);
        Assert.assertNotNull(num);
        //Fallido
        Assert.assertNotNull(dato1);
    }
}
