package automationjunit.asserts;

import org.junit.Assert;
import org.junit.Test;

public class AssertArrayEquals {
    @Test
    public void pruebaCompararStringArray   () {
        String[] arrayEsparado = {"uno", "dos", "tres"};
        String[] arrayValidacion = {"uno", "dos", "tres"};
        Assert.assertArrayEquals(arrayEsparado, arrayValidacion);
    }
}
