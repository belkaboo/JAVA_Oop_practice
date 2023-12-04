import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new HotDrinks("Coffee",200,300,90));
        productList.add(new HotDrinks("Tea",150,400,86));
        productList.add(new HotDrinks("Soup",300,250,60));

        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("Tea",400,86));


    /*
    productList.add(new BottleOFWater("qwe", 123, 100));
        productList.add(new BottleOFWater("qwe", 200, 150));
        productList.add(new BottleOFWater("zxcg", 500, 1000));
        productList.add(new BottleOFWater("qaffwe", 123, 10));
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("qwe", 150));
        Product test = new BottleOFWater("asd", 123, 123);
        */

    }
}