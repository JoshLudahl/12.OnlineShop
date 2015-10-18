import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Storehouse {

    private Map<String, Integer> house;
    private Map<String, Integer> stock;

    public Storehouse() {
        house = new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.house.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        for (String item : house.keySet()) {
            if (item.equals(product)) {
                for (String s : stock.keySet()) {
                    if (stock.get(product) > 0) {
                        return house.get(item);
                    }
                }
            }
        }
        return -99;
    }

    public int stock(String product) {
        for (String item : stock.keySet()) {
            if (item.equals(product)) {
                return stock.get(item);
            }
        }
        return 0;
    }

    public boolean take(String product) {

        for (String item : stock.keySet()) {
            if (item.equals(product) && stock(product) > 0) {
                stock.put(item, stock.get(item)-1);
                return true;
            }
        }

        return false;
    }
    
    public Set<String> products() {
        Set<String> listings = stock.keySet();
        return listings;
        
    }

}
