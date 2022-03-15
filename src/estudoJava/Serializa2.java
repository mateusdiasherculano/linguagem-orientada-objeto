package estudoJava;

import poo.conta;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Serializa2 {



    public void armazenarContas( ArrayList<conta> contas) throws IOException {

        try (FileOutputStream fos = new FileOutputStream("C:/estudos/files/objeto.ser")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(contas);
            }
        }
    }

    public ArrayList<conta> recuperarContas() throws IOException, ClassNotFoundException {
        try(FileInputStream fis = new FileInputStream("C:/estudos/files/objeto.ser")){
           try(ObjectInputStream ois  = new ObjectInputStream(fis)) {
            return ( ArrayList<conta>) ois.readObject();
           }
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<conta> contas = new ArrayList<>();
        contas.add(new conta("Mateus", 15000.21));
        contas.add(new conta("Alziene", 12000.01));
        contas.add(new conta("Elias", 10000.33));
        contas.add(new conta("Cecilia", 7000.62));


        Serializa2 operacao = new Serializa2();
        operacao.armazenarContas(contas);
        ArrayList<conta> contas2 = operacao.recuperarContas();
        for (conta conta: contas2) {
            conta.exibeSAldo();
        }
    }
}
