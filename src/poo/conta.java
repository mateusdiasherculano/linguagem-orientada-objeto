package poo;

public class conta {

     String cliente;
     double saldo;

     public conta(){}
     public conta (String cliente, double saldo){
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
    public void transferePara(conta destino, double valor){
        this.saca(valor);
        destino.depositar(valor);
    }
}
