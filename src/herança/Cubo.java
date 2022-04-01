package herança;

public class Cubo implements VolumeCalculavel, AreaCalculavel {

    double lado;
    public Cubo(double lado){
        this.lado = lado;
    }

    public double calculaVolume() {
        return 6 * lado * lado;
    }

    public double calcularArea() {
        return lado * lado * lado;
    }
}
