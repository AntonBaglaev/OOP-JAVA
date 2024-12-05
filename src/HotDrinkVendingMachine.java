import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{

    private final List<Product> productList1;
    private  int money;

    public HotDrinkVendingMachine(List<Product> productList1) {
        this.productList1 = productList1;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product: productList1){
            if (product.getName().equals(name)){
                money += product.getPrice();
                return  product;
            }
        }
        return  null;
    }

    public HotDrink getProduct (String name, int volume, int temperature){
        for (Product product: productList1){
            if (product instanceof HotDrink){
                if (product.getName().equals(name) && ((HotDrink) product).getTemperature() == temperature){
                    return (HotDrink) product;
                }
            }
        }
        return null;
    }
}
