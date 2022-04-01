package estudoJava;

import poo.Conta;

import java.io.*;
import java.util.ArrayList;

public class Serializa2 {



    public void armazenarContas( ArrayList<Conta> contas) throws IOException {

        try (FileOutputStream fos = new FileOutputStream("C:/estudos/files/objeto.ser")) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(contas);
            }
        }
    }

    public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException {
        try(FileInputStream fis = new FileInputStream("C:/estudos/files/objeto.ser")){
           try(ObjectInputStream ois  = new ObjectInputStream(fis)) {
            return ( ArrayList<Conta>) ois.readObject();
           }
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Mateus", 15000.21));
        contas.add(new Conta("Alziene", 12000.01));
        contas.add(new Conta("Elias", 10000.33));
        contas.add(new Conta("Cecilia", 7000.62));


        Serializa2 operacao = new Serializa2();
        operacao.armazenarContas(contas);
        ArrayList<Conta> contas2 = operacao.recuperarContas();
        for (Conta conta: contas2) {
            conta.exibeSAldo();
        }
    }
}
