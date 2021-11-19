package automationjunit.asserts;

import org.junit.Assert;
import org.junit.Test;

public class AssertEquals {
    //El método assertEquals() compara si dos objetos son iguales
    @Test
    public void pruebaCompararIgual() {
        String var1 = "hola";
        String var2 = "Hola";
        Assert.assertEquals(var1,var2);
    }
}
