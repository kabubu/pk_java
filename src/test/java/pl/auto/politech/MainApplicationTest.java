package pl.auto.politech;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by VCM637 on 10/19/2015.
 */
public class MainApplicationTest extends AbstractApplicationTest {
    @Override
    public void setup() {
        application = new Application();

    }

    @Test
    public void testMainMethod() throws Exception {
        assertTrue(true);
    }
}
