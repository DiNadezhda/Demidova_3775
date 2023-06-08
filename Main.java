package OPP.HW1;
/*
Демидова Надежда
Группа 3775
 */
/*
Создать торговый кофейный автомат,
напитки в автомате должны содержать следующие данные:
наименование, объем, температура, цена.
Проинициализировать несколько напитков в классе main и торговый автомат,
воспроизвести логику продажи напитков.
Сделать согласно принципам ООП, пройденным на семинаре.
 */
public class Main {
    public static void main(String[] args) {
        VendingMachine apparat = new VendingMachine();
        apparat.addProduct(new Product("Вода холодная", 35, 100, 6))
                .addProduct(new Milk("Молоко", 50, 40, 40))
                .addProduct(new Product("Кипяток", 60, 120, 80))
                .addProduct(new Kakao("На молоке", 150, 50, 60))
                .addProduct(new Coffee("Латте", 70, 5, 70,"С сиропом"))
                .addProduct(new Coffee("Капучино", 80, 10, 70, "С корицей"))
                .addProduct(new Tea("Ромашка", 35.20,3, 80, "С сахаром"));

        System.out.println("До продажи");
        System.out.println(apparat);
        PrintSell(apparat,"Молоко");
        PrintSell(apparat,"Молоко");
        PrintSell(apparat,"Молоко");
        PrintSell(apparat,"Капучино");

        System.out.println();
        System.out.println("После продажи");
        System.out.println(apparat);

        PrintSell(apparat,"Латте");
        PrintSell(apparat,"Капучино");

        System.out.println();
        System.out.println("После продажи");
        System.out.println(apparat);

        System.out.println();
        PrintSell(apparat,"Ликер");
        System.out.println(apparat);
    }

    public static void PrintSell (VendingMachine machine, String nameProd){
        try{
            System.out.println(machine.sell(nameProd));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}
