package colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class colecaoMap {

    public static void main(String[] args) {

        Map<String, String> pais = new HashMap<>();
        pais.put("BR", "Brasil" );
        pais.put("RU", "Russia" );
        pais.put("IN", "India" );
        pais.put("CN", "China" );
        System.out.println(pais);

        System.out.println(pais.containsKey("US")); //método para descobrir se existe
                                                // determinado favor dentro das chaves
        System.out.println(pais.containsValue("Brasil")); //método para identificar se um valor
                                                //esta presente no nosso mapa
        System.out.println(pais.get("CN"));//retorna o conteudo das chaves

        pais.remove("RU"); //remove conteudo
        System.out.println(pais);

        Set<String> keys = pais.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + pais.get(key));
        }
    }
}
