/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingApp;

import girisekrani.loginScreen;
import static shoppingApp.Shopping.total_bill;

/**
 *
 * @author Yakup Ergun - Kubra Yildiz
 */
public class Electronic extends Product{
    private String brand;
    private String model;
    protected static int total_electronics = 0;

    public Electronic(int id, String type, int price, String brand, String model) {
        super(id, type, price);
        this.brand = brand;
        this.model = model;
        total_electronics++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
    
    @Override
    public void point() {
        loginScreen.list.get(loginScreen.kullanici).setMoney(loginScreen.list.get(loginScreen.kullanici).getMoney() + Shopping.total_bill/20);
    }

    @Override
    public String toString() {
        return "Electronic{" + "brand=" + brand + ", model=" + model + '}';
    }
}
