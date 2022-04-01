package colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.add("Mateus");
        fila.add("Sandra");
        fila.add("Beatriz");
        System.out.println(fila);

        System.out.println(fila.peek());//mostra quem é o procimo da fila
        System.out.println(fila.poll());//remove o elemento do inino da fila
        System.out.println(fila);

        /* outros métodos disponiveis em linkedlist */
        LinkedList<String> f = (LinkedList<String>) fila;
        f.addFirst("Caio");// adiciona no inicio da fila
        f.addLast("gabriel");//coloca no final da fila
        System.out.println(f);

        System.out.println(f.peekFirst()); //mostra quem e a primeira pessoa da fila
        System.out.println(f.peekLast());// mostra quem é a ultima pessoa da fila

        f.pollFirst();
        f.pollLast();
        System.out.println(f);
    }
}
