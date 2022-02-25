package herança;

public class quadrado implements areaCalculavel {

    double lado;
    public quadrado(double lado){
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado ;
    }
}
