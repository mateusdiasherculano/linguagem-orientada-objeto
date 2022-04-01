package estudoJava;

import poo.Conta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Arquivo03 {

    private Path path = Paths.get("C:/estudos/files/contas.txt");
    private Charset utf8 = StandardCharsets.UTF_8;

    public void armazenarContas( ArrayList<Conta> contas) throws IOException{
        try (BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
            for (Conta conta: contas) {
                writer.write(conta.getCliente() + ";" +conta.getSaldo()+ "\n");
            }
        }
    }

    public ArrayList<Conta> recuperarContas() throws IOException {
        ArrayList<Conta> contas = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
            String line = null;
            while ((line = reader.readLine()) != null){
               String[] t = line.split(";");
               Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
               contas.add(conta);

            }
        }
        return contas;

    }

    public static void main(String[] args) throws IOException {

        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Mateus", 15000.21));
        contas.add(new Conta("Alziene", 12000.01));
        contas.add(new Conta("Elias", 10000.33));
        contas.add(new Conta("Cecilia", 7000.62));


        Arquivo03 operacao = new Arquivo03();
        operacao.armazenarContas(contas);
        ArrayList<Conta> contas2 = operacao.recuperarContas();
        for (Conta conta: contas2) {
            conta.exibeSAldo();
        }
    }
}
