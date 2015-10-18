
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
        
    }

    public String getProduct() {
        return product;
    }

    public int price() {
        // which returns the purchase price. This is obtained by raising the unit amount by the unit price
        
        return this.amount * this.unitPrice;
    }

    public void increaseAmount() {
        // increases by one the purchase unit amount
        this.amount++;
    }

    public String toString() {
        //returns the purchase in a string form like the following
        return this.product + ": " + amount;
    }
}
