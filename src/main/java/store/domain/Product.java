package store.domain;

public class Product {

    private final String name;
    private final int price;
    private final Promotion promotion;
    private int quantity;

    public Product(String name, int price, int quantity, Promotion promotion) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.promotion = promotion;
    }
}
