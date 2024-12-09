package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        HotDrink BlackTea = new HotDrink("BlackTea", 100, 50,90);
        HotDrink GreyTea = new HotDrink("GreyTea", 90, 50,90);
        HotDrink Cappuchino = new HotDrink("Cappuchino", 150, 100,80);
        products.add(BlackTea);
        products.add(GreyTea);
        products.add(Cappuchino);
        HotDrinkVendingMachine HotMachine1 = new HotDrinkVendingMachine(products);
        System.out.println(HotMachine1.getProduct("BlackTea"));
        System.out.println(HotMachine1.getProduct("GreyTea", 50, 90));
        System.out.println(HotMachine1.getProduct("Cappuchino"));
    }
}