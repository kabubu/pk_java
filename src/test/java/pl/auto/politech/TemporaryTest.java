package pl.auto.politech;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class TemporaryTest extends AbstractApplicationTest {
    @Override
    public void setup() {
        System.out.println("Before from TemporaryTest here...");
        application = new Application();

    }

    @Test
    public void testMainMethod() throws Exception {
        assertTrue(true);
    }
}
