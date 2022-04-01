package herança;

public class Quadrado implements AreaCalculavel {

    double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado ;
    }
}
