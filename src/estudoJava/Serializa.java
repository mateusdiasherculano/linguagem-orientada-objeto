package estudoJava;

import poo.conta;
import java.io.*;
import java.util.Arrays;



public class Serializa {

    public static void main(String[] args) throws Exception {

        String[] nomes = {"Ricardo", "Mateus", "Ruth"};

        conta conta1 = new conta("Mateus", 111_222_333.444);
        conta conta2 = new conta("keith", 111_222_333.454);

        /* ESCRITA DE OBJETO */
        FileOutputStream fos = new FileOutputStream("C:/estudos/files/objeto.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(conta1);
        oos.writeObject(conta2);
        oos.close();

        /* LEITURA DE OBJETO */
        FileInputStream fis = new FileInputStream("C:/estudos/files/objeto.ser");
        ObjectInputStream ois  = new ObjectInputStream(fis);
        conta c1 = (conta) ois.readObject();
        conta c2 = (conta) ois.readObject();
        ois.close();

        c1.exibeSAldo();
        c2.exibeSAldo();

    }
}
