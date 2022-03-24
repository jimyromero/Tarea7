package helpers;

public class Dolar extends Divisa {

    public Dolar() {
    }

    public double conversion(float amount) {
        total = amount * 24.5;
        return total;
    }
}
