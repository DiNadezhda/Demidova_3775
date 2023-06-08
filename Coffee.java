package OPP.HW1;

public class Coffee extends Product{
    private String coffee;
    public Coffee (String name, double price, int value, int temp, String coffee) {
        super(name, price, value, temp);
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return String.format("Название кофе %s, %s", coffee, super.toString());
    }
}
