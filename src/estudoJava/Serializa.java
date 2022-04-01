package estudoJava;

import poo.Conta;
import java.io.*;


public class Serializa {

    public static void main(String[] args) throws Exception {

        String[] nomes = {"Ricardo", "Mateus", "Ruth"};

        Conta conta1 = new Conta("Mateus", 111_222_333.444);
        Conta conta2 = new Conta("keith", 111_222_333.454);

        /* ESCRITA DE OBJETO */
        FileOutputStream fos = new FileOutputStream("C:/estudos/files/objeto.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(conta1);
        oos.writeObject(conta2);
        oos.close();

        /* LEITURA DE OBJETO */
        FileInputStream fis = new FileInputStream("C:/estudos/files/objeto.ser");
        ObjectInputStream ois  = new ObjectInputStream(fis);
        Conta c1 = (Conta) ois.readObject();
        Conta c2 = (Conta) ois.readObject();
        ois.close();

        c1.exibeSAldo();
        c2.exibeSAldo();

    }
}
