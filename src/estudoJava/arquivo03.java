package estudoJava;

import poo.conta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class arquivo03 {

    private Path path = Paths.get("C:/estudos/files/contas.txt");
    private Charset utf8 = StandardCharsets.UTF_8;

    public void armazenarContas( ArrayList<conta> contas) throws IOException{
        try (BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
            for (conta conta: contas) {
                writer.write(conta.getCliente() + ";" +conta.getSaldo()+ "\n");
            }
        }
    }

    public ArrayList<conta> recuperarContas() throws IOException {
        ArrayList<conta> contas = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
            String line = null;
            while ((line = reader.readLine()) != null){
               String[] t = line.split(";");
               conta conta = new conta(t[0], Double.parseDouble(t[1]));
               contas.add(conta);

            }
        }
        return contas;

    }

    public static void main(String[] args) throws IOException {

        ArrayList<conta> contas = new ArrayList<>();
        contas.add(new conta("Mateus", 15000.21));
        contas.add(new conta("Alziene", 12000.01));
        contas.add(new conta("Elias", 10000.33));
        contas.add(new conta("Cecilia", 7000.62));


        arquivo03 operacao = new arquivo03();
        operacao.armazenarContas(contas);
        ArrayList<conta> contas2 = operacao.recuperarContas();
        for (conta conta: contas2) {
            conta.exibeSAldo();
        }
    }
}
