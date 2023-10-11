package services;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class calculadoraServicioTest {
    calculadoraServicio sc;
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
       sc= new calculadoraServicio();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void devuelveSuma(){

        assertEquals(20d,sc.add(10d,10d),0);
    }


}