package automationjunit.asserts;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AssertThat {
    int numero = 0;

    @Before
    public void setData() {
        this.numero = 8;
    }

    @Test
    public void pruebaAssertThatEquals() {
        assertThat("hola", is("hola"));
    }
    @Test
    public void pruebaAssertThatNoEquals() {
        assertThat(numero, is(10));
    }
    @Test
    public void pruebaAssertWithMessage() {
        assertThat("Esto no es igual","123",is("1234"));
    }
}
