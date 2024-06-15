package gof.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //List of items
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
    //Passing the strategy as an argument to the method,and not use composition (i.e., making the strategy an instance variable of the context class)
    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
