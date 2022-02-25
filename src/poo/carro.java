package poo;

public class carro {

    String modelo;
    int velocidadeMaxima;
    double segundosZeroACem;
    motor motor;

    public carro(){}

    public carro( String modelo, int velocidadeMaxima,double segundosZeroACem){
        this(modelo,velocidadeMaxima,segundosZeroACem,null);
    }

    public carro( String modelo, int velocidadeMaxima,double segundosZeroACem,motor motor){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
        this.motor = motor;
    }

}
