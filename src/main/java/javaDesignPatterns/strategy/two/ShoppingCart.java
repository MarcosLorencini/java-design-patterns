package javaDesignPatterns.strategy.two;

import java.util.ArrayList;
import java.util.List;

//Notice that payment method os shopping cart requires payment algorithm as argument and doesn't
//store it anywhere as instance variable.

public class ShoppingCart {

    //List of items
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for(Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public  void pay(PaymentStrategy paymentMethdo) {
        int amount = calculateTotal();
        paymentMethdo.pay(amount);
    }
}
