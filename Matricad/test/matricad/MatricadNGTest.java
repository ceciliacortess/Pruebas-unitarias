/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package matricad;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alumno
 */
public class MatricadNGTest {

    public MatricadNGTest() {
    }

    static String[] cadenes;
    static String[] vacia;

    @BeforeClass
    public static void setUpClass() throws Exception {
        cadenes = new String[]{"hui", "�s", "dilluns", "i", "no", "m'agrada", "gens"}; 	// carrega la matriu de cadenes
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = java.lang.IllegalArgumentException.class)
    public void crear1(){
        Matricad crea1= new Matricad(null);
    }
    @Test(expectedExceptions = java.lang.IllegalArgumentException.class)
    public void crear2(){
        Matricad crea2= new Matricad(vacia);
    }
//    
    @Test
    public void crear3(){
        Matricad crea3= new Matricad(cadenes);
    }
    
    
     /**
     * Test of getMaxCad method, of class Matricad.
     */
    @Test
    public void testGetMaxCad() {
        System.out.println("getMaxCad");
        Matricad instance = new Matricad(cadenes);
        String expResult = "m'agrada";
        String result = instance.getMaxCad();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSumaCaracters method, of class Matricad.
     */
    @Test
    public void testGetSumaCaracters() {
        System.out.println("getSumaCaracters");
        Matricad instance = new Matricad(cadenes);
        int expResult = 27;
        int result = instance.getSumaCaracters();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIndexDe method, of class Matricad.
     */
    @Test
    public void testGetIndexDe1() {
        System.out.println("getIndexDe");
        String unaCadena = "no";
        Matricad instance = new Matricad(cadenes);
        int expResult = 4;
        int result = instance.getIndexDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test(expectedExceptions = java.lang.IllegalArgumentException.class)
    public void testGetIndexDe2() {
        System.out.println("getIndexDe");
        String unaCadena = null;
        Matricad instance = new Matricad(cadenes);
        int expResult = 0;
        int result = instance.getIndexDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test(expectedExceptions = java.util.NoSuchElementException.class)
    public void testGetIndexDe3() {
        System.out.println("getIndexDe");
        String unaCadena = "si";
        Matricad instance = new Matricad(cadenes);
        int expResult = 0;
        int result = instance.getIndexDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
