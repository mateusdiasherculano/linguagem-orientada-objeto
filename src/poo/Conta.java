package poo;

public class Conta implements java.io.Serializable{

     String cliente;
     double saldo;

     public Conta(){}
     public Conta(String cliente, double saldo){
         this.cliente = cliente;
         this.saldo = saldo;
     }

     public String getCliente(){
         return cliente;
     }
     public double getSaldo(){
         return saldo;
     }

    public void exibeSAldo(){
        System.out.println(cliente + " seu saldo é: R$ "+ saldo);
    }
    public void saca (double valor){
        saldo -= valor;
    }
    public void depositar (double valor){
        saldo += valor;
    }
    public void transferePara(Conta destino, double valor){
        this.saca(valor);
        destino.depositar(valor);
    }
}
