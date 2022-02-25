package herança;

public class cubo implements volumeCalculavel, areaCalculavel{

    double lado;
    public cubo(double lado){
        this.lado = lado;
    }

    public double calculaVolume() {
        return 6 * lado * lado;
    }

    public double calcularArea() {
        return lado * lado * lado;
    }
}
