package intervalos;

import java.util.Arrays;

/*
 * @author Ana Gonçalo
 */
public class Intervalos {

    public static void main(String[] args) {
        
    }
    
    public static String quebraIntervalos(int[] lista){
        if(lista.length == 0)
            return "Lista vazia";
        
        int[] lista_ = lista.clone();
        Arrays.sort(lista_);
        if(!Arrays.equals(lista, lista_))
            return "Lista desordenada";
        
        return "["+lista[0]+"]";
    }
    
}
