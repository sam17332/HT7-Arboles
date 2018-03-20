/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hecto
 */
public class DiccionarioTest {
    
    public DiccionarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of traducir method, of class Diccionario.
     */
    @Test
    public void testTraducir() {
        System.out.println("traducir");
        String linea = "";
        Diccionario instance = new Diccionario();
        String expResult = "el perro *toma* agua *adentro* *de* *su* casa ";
        String result = instance.traducir("the dog toma water adentro de su house");
        assertEquals(expResult, result);

    }

    /**
     * Test of mostrarInorder method, of class Diccionario.
     */
    @Test
    public void testMostrarInorder() {
        System.out.println("mostrarInorder");
        Diccionario instance = new Diccionario();
        instance.mostrarInorder();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
