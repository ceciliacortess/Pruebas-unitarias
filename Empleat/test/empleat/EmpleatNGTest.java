/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package empleat;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author CECILIA
 */
public class EmpleatNGTest {
    
    public EmpleatNGTest() {
    }

    /**
     * Test 1 of calculaSalariBrut method, of class Empleat.
     * Se espera que salga la excepción, ya que tipusEmpleat es incorrecto.
     * @throws java.lang.Exception
     */
    //@Test(expectedExceptions = empleat.MaException.class)
    public void testCalculaSalariBrut1() throws Exception {
        System.out.println("calculaSalariBrut1");
        String tipusEmpleat = "hola";
        double vendesMes = 0.0;
        int horesExtra = 0;
        Empleat instance = new Empleat();
        double expResult = 0.0;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 2 of calculaSalariBrut method, of class Empleat.
     * Se espera que salga la excepción, ya que vendesMes es negativo.
     * @throws Exception 
     */
    //@Test(expectedExceptions = empleat.MaException.class)
    public void testCalculaSalariBrut2() throws Exception {
        System.out.println("calculaSalariBrut2");
        String tipusEmpleat = "venedor";
        double vendesMes = -5;
        int horesExtra = 0;
        Empleat instance = new Empleat();
        double expResult = 0.0;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 3 of calculaSalariBrut method, of class Empleat.
     * Se espera que salga la excepción, ya que horesExtra es negativo.
     * @throws Exception 
     */
    //@Test(expectedExceptions = empleat.MaException.class)
    public void testCalculaSalariBrut3() throws Exception {
        System.out.println("calculaSalariBrut3");
        String tipusEmpleat = "encarregat";
        double vendesMes = 1500;
        int horesExtra = -10;
        Empleat instance = new Empleat();
        double expResult = 0.0;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 4 of calculaSalariBrut method, of class Empleat.
     * Test escribiendo correctamente todos los datos con tipusEmpleat = encarregat.
     * @throws Exception 
     */
    //@Test
    public void testCalculaSalariBrut4() throws Exception {
        System.out.println("calculaSalariBrut4");
        String tipusEmpleat = "encarregat";
        double vendesMes = 1500;
        int horesExtra = 10;
        Empleat instance = new Empleat();
        double expResult = 1785.7;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 5 of calculaSalariBrut method, of class Empleat.
     * Test escribiendo correctamente todos los datos con tipusEmpleat = encarregat y un margen de error de un 0.1.
     * @throws Exception 
     */
    //@Test
    public void testCalculaSalariBrut5() throws Exception {
        System.out.println("calculaSalariBrut5");
        String tipusEmpleat = "encarregat";
        double vendesMes = 1500;
        int horesExtra = 10;
        Empleat instance = new Empleat();
        double expResult = 1785.8;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 6 of calculaSalariBrut method, of class Empleat.
     * Test escribiendo correctamente todos los datos con tipusEmpleat = venedor.
     * @throws Exception 
     */
    //@Test
    public void testCalculaSalariBrut6() throws Exception {
        System.out.println("calculaSalariBrut6");
        String tipusEmpleat = "venedor";
        double vendesMes = 2000;
        int horesExtra = 10;
        Empleat instance = new Empleat();
        double expResult = 1285.7;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 7 of calculaSalariBrut method, of class Empleat.
     * Se espera que salga la excepción, ya que tipusEmpleat es null.
     * @throws Exception 
     */
    //@Test(expectedExceptions = java.lang.NullPointerException.class)
    public void testCalculaSalariBrut7() throws Exception {
        System.out.println("calculaSalariBrut7");
        String tipusEmpleat = null;
        double vendesMes = 2000;
        int horesExtra = 10;
        Empleat instance = new Empleat();
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 8 of calculaSalariBrut method, of class Empleat.
     * Se espera que salga la excepción, ya que tipusEmpleat está escrito incorrectamente (incluye mayus).
     * @throws Exception 
     */
    //@Test(expectedExceptions = empleat.MaException.class)
    public void testCalculaSalariBrut8() throws Exception {
        System.out.println("calculaSalariBrut8");
        String tipusEmpleat = "Venedor";
        double vendesMes = 2000;
        int horesExtra = 10;
        Empleat instance = new Empleat();
        double expResult = 1285.7;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 9 of calculaSalariBrut method, of class Empleat.
     * Se espera que salga la excepción, ya que tipusEmpleat está escrito incorrectamente (incluye mayus).
     * @throws Exception 
     */
    //@Test(expectedExceptions = empleat.MaException.class)
    public void testCalculaSalariBrut9() throws Exception {
        System.out.println("calculaSalariBrut9");
        String tipusEmpleat = "Encarregat";
        double vendesMes = 1500;
        int horesExtra = 10;
        Empleat instance = new Empleat();
        double expResult = 1785.7;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 10 of calculaSalariBrut method, of class Empleat.
     * Se espera que salga la excepción, ya que tipusEmpleat está escrito incorrectamente (incluye espacios).
     * @throws Exception 
     */
    //@Test(expectedExceptions = empleat.MaException.class)
    public void testCalculaSalariBrut10() throws Exception {
        System.out.println("calculaSalariBrut10");
        String tipusEmpleat = "encarregat ";
        double vendesMes = 1500;
        int horesExtra = 10;
        Empleat instance = new Empleat();
        double expResult = 1785.7;
        double result = instance.calculaSalariBrut(tipusEmpleat, vendesMes, horesExtra);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test 1 of calculaSalariNet method, of class Empleat.
     * Test escribiendo correctamente todos los datos (retencion=0.16).
     * @throws java.lang.Exception
     */
    @Test
    public void testCalculaSalariNet1() throws Exception {
        System.out.println("calculaSalariNet1");
        double salariBrut = 1500;
        Empleat instance = new Empleat();
        double expResult = 1260;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 2 of calculaSalariNet method, of class Empleat.
     * Se espera que salga la excepción, ya que salariBrut es negativo.
     * @throws java.lang.Exception
     */
    @Test(expectedExceptions = empleat.MaException.class)
    public void testCalculaSalariNet2() throws Exception {
        System.out.println("calculaSalariNet2");
        double salariBrut = -1500;
        Empleat instance = new Empleat();
        double expResult = 0.0;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 3 of calculaSalariNet method, of class Empleat.
     * Test escribiendo correctamente todos los datos (retencion=0).
     * @throws java.lang.Exception
     */
    @Test
    public void testCalculaSalariNet3() throws Exception {
        System.out.println("calculaSalariNet3");
        double salariBrut = 900;
        Empleat instance = new Empleat();
        double expResult = 900;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test 4 of calculaSalariNet method, of class Empleat.
     * Test escribiendo correctamente todos los datos (retencion=0).
     * @throws java.lang.Exception
     */
    @Test
    public void testCalculaSalariNet4() throws Exception {
        System.out.println("calculaSalariNet4");
        double salariBrut = 1600;
        Empleat instance = new Empleat();
        double expResult = 1280;
        double result = instance.calculaSalariNet(salariBrut);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
//No se me han ocurrido más tests para este método :)
}
