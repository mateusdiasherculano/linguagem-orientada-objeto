package colecao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class colecaoList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Futebol");
        list.add("Basquete");
        list.add("Tênis");
        list.add("Vôlei");
        list.add("Natação");
        list.add("Hockey");
        list.add("Boxe");
        list.add("Futebol");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++){
            String letra = list.get(i);
            list.set(i, letra.toUpperCase());
        }

        System.out.println(list.indexOf("BOXE"));
        System.out.println(list.subList(2, 4));
        list.subList(2, 4).clear();
        System.out.println(list);
    }
}
