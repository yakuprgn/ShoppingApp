/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingApp;

import girisekrani.loginScreen;

/**
 *
 * @author Yakup Ergun - Kubra Yildiz
 */
public class Clothes extends Product{
    private String brand;
    private String form;
    protected static int total_clothes = 0;

    public Clothes(int id, String type, int price, String brand, String form) {
        super(id, type, price);
        this.brand = brand;
        this.form = form;
        total_clothes++;
    }

    @Override
    public void point() {
        loginScreen.list.get(loginScreen.kullanici).setMoney(loginScreen.list.get(loginScreen.kullanici).getMoney() + Shopping.total_bill/15);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
    
    

    @Override
    public String toString() {
        return "Clothes{" + "brand=" + brand + ", form=" + form + '}';
    }
    
}
