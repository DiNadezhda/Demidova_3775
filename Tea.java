package OPP.HW1;

public class Tea extends Product{
    private String tea;
    public Tea(String name, double price, int value, int temp, String tea) {
        super(name, price, value, temp);
        this.tea = tea;
    }

    @Override
    public String toString() {
        return String.format("Чай со вкусом %s, %s", tea, super.toString());
    }
}
