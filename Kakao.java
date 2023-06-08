package OPP.HW1;

public class Kakao extends Product{
    public Kakao(String name, double price, int value, int temp) {
        super(name, price, value, temp);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Горячий шоколад: ")
                .append(super.toString());
        return res.toString();
    }
}
