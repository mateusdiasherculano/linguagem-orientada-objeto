package estudoJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExpressaoRegular {

    public static void main(String[] args) {

        boolean b = "Java".matches("Java");

        /*MODIFICADORES
        (?i), Ignora maiúscula e minúscula
        (?x), comentarios
        (?m), Multilinhas
        (?s), Dottal */

       b = "Java".matches("(?i)java");


        /* METACARACTERES
        .  Qualquer caracter
        \d dígitos        [0-9]
        \D não é dígito   [^0-9]
        \s espaços        [ \t\n\x0B\f\r]
        \S não é espaço   [^\s]
        \w letra          [a-zA-Z_0-9]
        \W não é letra */

       b =  "@".matches(".");
       b =  "2".matches("\\d");
       b =  "a".matches("\\w");
       b =  " ".matches("\\s");

       String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
       b = "72920-163".matches(cep);


       /* QUANTIFICADORES
       X{n}    X, exatamente n vezes
       X{n,}   X, pelo menos n vezes
       X{n, m} X, pelos menos n mas não maos que m vezes
       X?      X, 0 ou 1 vez
       X*      X, 0 ou + vezes
       X+      X, 1 ou + vezes */

        b = "21".matches("\\d{2}");
        b = "123".matches("\\d{2,}");
        b = "123456".matches("\\d{2,5}");

        b = " ".matches(".?"); //0 ou 1
        b = "ab".matches(".*"); // 0 ou +
        b = "123".matches(".+"); // 1 ou +

        b = "72920-163".matches("\\d{5}-\\d{3}");
        b = "30/12/2000".matches("\\d{2}/\\d{2}/\\d{4}");


        /*METACARACTER DE FRONTEIRA
        ^ inicia
        $ finaliza
        | ou */

        b = "Pier21".matches("^Pier.*");
        b = "Pier21".matches(".*21$");
        b = "tem java aqui".matches(".*java.*");
        b = "tem java aqui".matches("^tem.*aqui$");
        b = "sim".matches("sim|nao");

        /*AGRUPADORES
        [...]           Agrupamento
        [a-z]           Alcance
        [a-e][i-u]      Uniao
        [a-z&&[aeiou]]  Interseção
        [^abc]          Exceção
        [a-z&&[^m-p]]   Subtração
        \x              Fuga lateral */

        b = "x".matches("[a-z]");
        b = "3".matches("[0-9]");

        b = "True".matches("[tT]rue");//true True
        b = "true".matches("[tT]rue|[yY]es");// true True yes Yes
        b = "Mateus".matches("[A-Z][a-z]*");// Primeiro nome com a letra maiuscula
        b = "olho".matches("[^abc]lho");
        b = "crau".matches("cr[ae]u");// crau creu

        b = "rh@mateus.com".matches("\\w+@\\w+\\.\\w{2,3}"); // validação de email
        System.out.println(b);

        String doce = "Qual é o doce mais doCe que o doce?";
        Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        /* SUBSTITUIÇÕES */

        String r = doce.replaceAll("(?i)doce", "DOCINHO");

        String rato = "O rato roeu a roupa do rei de roma";
        r = rato.replaceAll("r[aeiou]", "XX");

        r = "Tabular este texto".replaceAll("\\s", "\t");

        String url = "www.mateus.com.br/clientes-2011.html";
                    //http://www.mateus.com.br/2011/clientes.jsp// Objetivo
        String re = "www.mateus.com.br/\\w{2,}-\\d{4}.html";
        b = url.matches(re);


        re = "(www.mateus.com.br)/(\\w{2,})-(\\d{4}).html";

        r = url.replaceAll(re,"http://$1/$3/$2.jsp");
        System.out.println(r);
        System.out.println(url);
    }
}
