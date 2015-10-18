
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;

public class ShoppingBasket {

    private List<Purchase> basket;

    public ShoppingBasket() {
        basket = new LinkedList<Purchase>();
    }

    public void add(String product, int price) {
        if (!basket.isEmpty()) {
            int i = 0;
            boolean found = false;
            while (i < basket.size() && found == false) {
                if (basket.get(i).getProduct().equals(product)) {
                    found = true;
                    break;
                }
                i++;
            }

            if (found) {

                basket.get(i).increaseAmount();
            }
            else {
                basket.add(new Purchase(product, 1, price));
            }
        } else {

            basket.add(new Purchase(product, 1, price));
        }
    }

    public int price() {
        int price = 0;
        for (Purchase item : basket) {
            price += item.price();
        }
        return price;
    }

    public void print() {
        for (Purchase item : basket) {
            System.out.println(item);
        }
    }
}
