/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingApp;

/**
 *
 * @author Yakup Ergun - Kubra Yildiz
 */
public abstract class Product {
    
    private int id;
    private String type;
    private int price;
    protected static int total_products = 0;

    public Product(int id, String type, int price) {
        this.id = id;
        this.type = type;
        this.price = price;
        total_products++;
    }
    
    public abstract void point();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", type=" + type + ", price=" + price + '}';
    }
    
}
