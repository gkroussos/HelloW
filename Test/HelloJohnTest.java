import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloJohnTest {
    @Test
    public void getName() throws Exception {
        HelloJohn john = new HelloJohn("John");
        assertEquals("John",john.getName());
    }
}