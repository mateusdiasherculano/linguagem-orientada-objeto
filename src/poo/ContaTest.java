package poo;

public class ContaTest {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.cliente = "Mateus";
        conta.saldo = 10_000;
        conta.exibeSAldo();

        Conta destino = new Conta();
        destino.cliente = "Alziene";
        destino.saldo = 8_000;
        destino.exibeSAldo();

        conta.transferePara(destino, 1500);
        conta.exibeSAldo();
        destino.exibeSAldo();

    }


}
