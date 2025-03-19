package org.example;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public double getPrice()
    {
        return this.price;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
