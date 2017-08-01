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
    
}
