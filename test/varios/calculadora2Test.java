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
public class calculadora2Test {
    
    private calculadora calcu;
    private int resultado;
    
    @Before
    public void creacalculadora(){
    calcu=new calculadora(20,10);
    }
    
    @After
    public void borracalculadora(){
        calcu=null;
    }
    
    
      public calculadora2Test() {
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
    
    @Test
    public void testSuma(){
        resultado=calcu.suma();
        assertEquals(30,resultado);
    }
    /**
     * Test of suma method, of class calculadora.
     
    @Test
    public void testSuma() {
        System.out.println("suma");
        calculadora instance = new calculadora(20,10);
        int expResult = 30;
        int result = instance.suma();
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class calculadora.
     */
    @Test
    public void testResta(){
        resultado=calcu.resta();
        assertEquals(10,resultado);
    }

    /**
     * Test of multiplica method, of class calculadora.
     */
    @Test
    public void testMultiplica(){
        resultado=calcu.multiplica();
        assertEquals(200,resultado);
    }

    /**
     * Test of divide method, of class calculadora.
     */
    @Test
    public void testDivide(){
        resultado=calcu.divide();
        assertEquals(2,resultado);
    }
}
