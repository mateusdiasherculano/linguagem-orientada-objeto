package poo;

public class carroTest {
    public static void main(String[] args) {

        carro ferrari = new carro();
        ferrari.modelo = "ferrari";
        ferrari.velocidadeMaxima = 349;
        ferrari.segundosZeroACem = 3.2;
        motor v12 = new motor();
        v12.tipo = "V12";
        v12.potencia = 660;
        ferrari.motor = v12;

        carro k = new carro("Kornigsegg CCXR", 430, 3.1);
        motor v8 = new motor("v8", 1018);
        k.motor = v8;

        carro bugatti = new carro("bugatti Veyron",430,2.2, new motor("w16", 1200));

        System.out.println(bugatti.motor.potencia);
    }
}
