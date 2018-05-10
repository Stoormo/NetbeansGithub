/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM 6J
 */
public class circulo1Test {
    
    public circulo1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCentroX method, of class circulo1.
     */
    @Test
    public void testGetCentroX() {
        System.out.println("getCentroX");
        circulo1 instance = null;
        double expResult = 0.0;
        double result = instance.getCentroX();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerimetro method, of class circulo1.
     */
    @Test
    public void testGetPerimetro() {
        System.out.println("getPerimetro");
        circulo1 instance = null;
        double expResult = 0.0;
        double result = instance.getPerimetro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mueve method, of class circulo1.
     */
    @Test
    public void testMueve() {
        System.out.println("mueve");
        double despX = 0.0;
        double despY = 0.0;
        circulo1 instance = null;
        instance.mueve(despX, despY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
