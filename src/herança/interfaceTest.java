package herança;

public class interfaceTest {
    public static void area(areaCalculavel o) {
        System.out.println(o.calcularArea());
    }

    public static void volume (volumeCalculavel o) {
        System.out.println(o.calculaVolume());
    }

    public static void main(String[] args) {

        area(new quadrado(2));
        volume(new cubo(2 ));

    }
}
