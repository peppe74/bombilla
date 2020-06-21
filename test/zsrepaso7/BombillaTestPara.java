/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsrepaso7;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Jamiroquaik
 */
@RunWith (value = Parameterized.class)
public class BombillaTestPara {
    
   private boolean estado;
   private String expResult;

    public BombillaTestPara(boolean estado, String expResult) {
        this.estado = estado;
        this.expResult = expResult; //Fundamental que este aqui en el constructor
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Parameters
    
    public static Collection<Object[]>  parametros(){
        
        Object[][] datos = new Object[][] {
            {true, "Esta encendida"},                  //"expResult" es String asi que hay que poner lo que devuelve con palabras, ej:"Bien"
            {false, "Esta apagada"}
        };
        return Arrays.asList(datos);
                
    }

     @Test
    public void testEncApa() {
        System.out.println("EncApa");
        Bombilla instancia = new Bombilla(estado);
        String result = instancia.EncApa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
