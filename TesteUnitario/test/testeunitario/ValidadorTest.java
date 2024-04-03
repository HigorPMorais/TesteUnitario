package testeunitario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import validador.Validador;

/**
 *
 * @author HPMORAIS
 */
public class ValidadorTest {
    
    static Validador instance; 
    
    public ValidadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new Validador();
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
     * Test of somenteNumeros method, of class Validador.
     */
    @Test
    public void testSomenteNumeros() {
        assertTrue(instance.somenteNumeros("11111111"));
    }

    /**
     * Test of cartaoValido method, of class Validador.
     */
    @Test
    public void testCartaoValido() {
        assertFalse(instance.cartaoValido(""));
        
        /*System.out.println("cartaoValido");
        String numCartao = "";
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.cartaoValido(numCartao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

    /**
     * Test of cpfValido method, of class Validador.
     */
    @Test
    public void testCpfValido() {
        System.out.println("cpfValido");
        String cpf = "";
        boolean expResult = false;
        boolean result = instance.cpfValido(cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cnpjValido method, of class Validador.
     */
    @Test
    public void testCnpjValido() {
        System.out.println("cnpjValido");
        String cnpj = "";
        boolean expResult = false;
        boolean result = instance.cnpjValido(cnpj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void numerosIguaisCPF(){
        assertEquals("11111111111", instance.cpfValido(""));
    }
    
}
