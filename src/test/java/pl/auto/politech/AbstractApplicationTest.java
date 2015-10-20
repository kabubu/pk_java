package pl.auto.politech;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class AbstractApplicationTest {

    protected Application application;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Before class here...");
    }

    @Before
    public abstract void setup();

    @After
    public void tearDown() {
        System.out.println("After here...");
    }
}