package helpers;

public class Lempira extends Divisa {

    public Lempira() {
    }

    public double conversion(float amount) { 
        total = amount / 25.4;
        return total;
    }
}
