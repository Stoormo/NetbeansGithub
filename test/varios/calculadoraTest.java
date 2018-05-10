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
public class calculadoraTest {
    
    public calculadoraTest() {
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
     * Test of suma method, of class calculadora.
     */
    @Test
    public void testSuma() {
        /*System.out.println("suma");
        calculadora instance = null;
        int expResult = 0;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        */
        System.out.println("suma");
        calculadora instance = new calculadora(20,10);
        int expResult = 30;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        /*fail("The test case is a prototype.")*/;
    }

    /**
     * Test of resta method, of class calculadora.
     */
    @Test
    public void testResta() {
        /*System.out.println("resta");
        calculadora instance = null;
        int expResult = 0;
        int result = instance.resta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        */
        System.out.println("resta");
        calculadora instance = new calculadora(10,5);
        int expResult = 5;
        int result = instance.resta();
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplica method, of class calculadora.
     */
    @Test
    public void testMultiplica() {
        /*System.out.println("multiplica");
        calculadora instance = null;
        int expResult = 0;
        int result = instance.multiplica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        */        
        System.out.println("multiplica");
        calculadora instance = new calculadora(2,2);
        int expResult = 4;
        int result = instance.multiplica();
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class calculadora.
     */
    @Test
    public void testDivide() {
        /*System.out.println("divide");
        calculadora instance = null;
        int expResult = 0;
        int result = instance.divide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        */        
        System.out.println("divide");
        calculadora instance = new calculadora(4,2);
        int expResult = 2;
        int result = instance.divide();
        assertEquals(expResult, result);
    }
    
}
