/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package src;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class CuentaTest extends TestCase{
    
    private static Cuenta Cuenta12345;
    private static Cuenta Cuenta67890;
    
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inicio");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Fin");
    }
    
    @Before
    public void setUp() {
        System.out.println("Entro");
    }
    
    @After
    public void tearDown() {
        System.out.println("Salgo");
    }

    /**
     * Test of Reintegro method, of class Cuenta.
     */
    @Test
    public void testReintegro() {
        System.out.println("Reintegro");
        Cuenta instance1 = new Cuenta(300);
        int result = instance1.Reintegro(100);
        assertEquals(200, result);
        //assertEquals(100, Cuenta.Reintegro(100));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deposito method, of class Cuenta.
     */
    @Test
    public void testDeposito() {
        System.out.println("deposito");
        Cuenta instance2 = new Cuenta(300);
        int result = instance2.deposito(100);
        assertEquals(400, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testT0014() {
        System.out.println("T0014");
        Cuenta12345 = new Cuenta(50);
        Cuenta67890 = new Cuenta(0);
        
        Cuenta12345.Reintegro(200);
        Cuenta67890.Reintegro(350);
        Cuenta12345.deposito(100);
        Cuenta67890.Reintegro(200);
        Cuenta67890.Reintegro(150);
        Cuenta12345.Reintegro(200);
        Cuenta67890.deposito(50);
        Cuenta67890.Reintegro(100);
                
        assertEquals(-250, Cuenta12345.getSaldo());
        assertEquals(-500, Cuenta67890.getSaldo());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
