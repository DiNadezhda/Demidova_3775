package OPP.HW1;

import java.util.ArrayList;
import java.util.List;
public class VendingMachine {
    private List<Product> vending = new ArrayList<>();
    private double money = 0;

    public VendingMachine addProduct(Product product) {
        vending.add(product);
        return this;
    }

    public Product searchProduct(String name) {
        for (Product item : vending) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public Product sell(String name) throws Exception {
        Product target = searchProduct(name);
        try {
            if (!target.sellCounter()){
                vending.remove(target);

            }
            this.money += target.getPrice();
        } catch (NullPointerException e) {
            throw new Exception("Товар не найден", e);
        }

        return target;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Product item : vending) {
            res.append(item);
            res.append("\n");
        }
        res.append(String.format("В автомате сейчас %.2f рублей", money));
        return res.toString();
    }
}
