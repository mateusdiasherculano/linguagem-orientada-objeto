package colecao;

import java.util.*;
import java.util.concurrent.Callable;

public class colecaoUtilitario {
    
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Guarana");
        list.add("Uva");
        list.add("Manga");
        list.add("Coco");
        list.add("Açaí");
        list.add("Banana");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);//Utilizado para colocar em ordem alfabetica

        Collections.reverse(list);
        System.out.println(list);// Utilizado para inverter uma lista

        Collections.shuffle(list);
        System.out.println(list);// Coloca os dados em formas aleatórias

        Collections.addAll(list, "Laranja", "Abacaxi", "Melão");
        System.out.println(list);// Método para adicionar mais elementos

        System.out.println(Collections.frequency(list, "Abacaxi")); // Método para saber quantas vezes
        // uma palavra aparece em uma determinada coleção

        List<String> list2 = Arrays.asList("Acerola", "Graviola");
        boolean d = Collections.disjoint(list, list2);//Retorna informando se os elementos dentro dos
        // parametros estao na primeira coleção

        Collections.sort(list);
        int indice = Collections.binarySearch(list, "Guaraná");
        System.out.println(indice);
        System.out.println(list);

        Collections.fill(list, "Açaí");
        System.out.println(list);

        //coleção nao modificável

        Collection<String> constante =
                Collections.unmodifiableCollection(list);
    }
}
