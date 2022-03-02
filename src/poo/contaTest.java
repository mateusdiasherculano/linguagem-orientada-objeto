package poo;

public class contaTest {
    public static void main(String[] args) {

        conta conta = new conta();
        conta.cliente = "Mateus";
        conta.saldo = 10_000;
        conta.exibeSAldo();

        conta destino = new conta();
        destino.cliente = "Alziene";
        destino.saldo = 8_000;
        destino.exibeSAldo();

        conta.transferePara(destino, 1500);
        conta.exibeSAldo();
        destino.exibeSAldo();

    }


}
