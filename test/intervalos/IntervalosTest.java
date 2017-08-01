package intervalos;

import junit.framework.TestCase;
import org.junit.Test;

/*
 * @author Ana Gonçalo
 */
public class IntervalosTest extends TestCase {

    @Test
    public void testListaVazia() {
        int[] lista = {};
        assertEquals("Lista vazia", Intervalos.quebraIntervalos(lista));
    }
    
    @Test
    public void testListaDesordenada() {
        int[] lista = {91, 90};
        assertEquals("Lista desordenada", Intervalos.quebraIntervalos(lista));
    }
    
}
