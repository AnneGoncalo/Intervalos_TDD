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
    
    @Test
    public void testNumerosEstaoNosSubgrupos() {
        int[] lista = {100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150};
        String[] subs = Intervalos.quebraIntervalos(lista).split(",");
        boolean ok; 
        for (int num : lista) {
            ok = false;
            for (String sub : subs) {
                sub = sub.replace(" ", "");
                sub = sub.substring(1, sub.length() - 1);
                String[] iniFim = sub.split("-");

                if (iniFim.length == 2 && num >= Integer.parseInt(iniFim[0]) && num <= Integer.parseInt(iniFim[1])) {
                    System.out.println(num + " entre " + iniFim[0] + " e " + iniFim[1]);
                    ok = true;
                    break;
                } else if (num == Integer.parseInt(iniFim[0])) {
                    System.out.println(num + " entre " + iniFim[0]);
                    ok = true;
                    break;
                }
            }
            if(!ok)
                fail("Erro");
        }
        assertTrue(true);

    }
    
    @Test
    public void testQuantidadeDeSubGrupos(){
        int[] lista = {100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150};
        int qtdQuebras=0;
        for(int i=0; i<lista.length; i++){
            if(i==lista.length-1){
                qtdQuebras++;
            }
            else if(lista[i]+1 != lista[i+1]){
                qtdQuebras++;
            }   
        }        
        
        String[] subs = Intervalos.quebraIntervalos(lista).split(",");
        int qtdQuebrasResultado = subs.length;
        
        assertEquals(qtdQuebras, qtdQuebrasResultado);
    }
    
}
