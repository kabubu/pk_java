package pl.auto.politech;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class AbstractApplicationTest {

    protected Application application;

    @BeforeClass
    public static void setUpBeforeClass() {

    }

    @Before
    public abstract void setup();



    @After
    public void tearDown() {

    }
}