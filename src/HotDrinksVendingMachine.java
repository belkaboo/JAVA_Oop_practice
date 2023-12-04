import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {

    private List<Product> productList = new ArrayList<>();
    @Override
    public void initProduct(List<Product> productList) {
    this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product item : productList)
            if(item.getName().equals(name))
                return item;
        return null;
    }

    public Product getProduct(String name, int volume, int temperature){
        for (Product item : productList)
            if(item.getName().equals(name) && ((HotDrinks) item).getVolume() == volume && ((HotDrinks) item).getTemperature() == temperature)
                return item;
        return null;

    }
}
