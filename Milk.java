package OPP.HW1;

public class Milk extends Product{
    public Milk(String name, double price, int value, int temp) {
        super(name, price, value, temp);
    }

    @Override
    public String toString() {
        return String.format("Молоко : %s" ,super.toString());
    }
}
