package automationjunit.asserts;

import org.junit.Assert;
import org.junit.Test;

public class AssertBoleano {
    //Los métodos assertTrue() y assertFalse, estos nos validan si es resultado esperado fue verdadero o falso dependiendo de la condición
    @Test
    public void pruebaCompararBoleano(){
        String var1 = "hola";
        String var2 = "Hola";
        boolean validation = var1.equalsIgnoreCase(var2);
        Assert.assertTrue(validation);
        Assert.assertFalse(false);
    }
}
