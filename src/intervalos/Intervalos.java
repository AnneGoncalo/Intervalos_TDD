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
        
        int inicio = lista[0];
        String result = "";

        for (int i = 0; i < lista.length; i++) {
            if (i == lista.length - 1 && lista[i - 1] != lista[i] - 1) {
                result += "[" + lista[i] + "]";
            } else if (i == lista.length - 1 && lista[i - 1] == lista[i] - 1) {
                result += "[" + inicio + "-" + lista[i] + "]";
            } else if ((i + 1 != lista.length) && lista[i + 1] != lista[i] + 1) {
                if (lista[i] == inicio) {
                    result += "[" + lista[i] + "], ";
                } else {
                    result += "[" + inicio + "-" + lista[i] + "], ";
                }
                inicio = lista[i + 1];
            }
        }
        return result;
    }
    
}
