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
public class HomemadeProduct extends Product{
    private String name;
    private String product_name;
    protected static int total_hmp = 0;

    public HomemadeProduct(int id, String type, int price ,String name ,String product_name) {
        super(id, type, price);
        this.name = name;
        this.product_name = product_name;
        total_hmp++;
    }

    @Override
    public void point() {
        loginScreen.list.get(loginScreen.kullanici).setMoney(loginScreen.list.get(loginScreen.kullanici).getMoney() + Shopping.total_bill/15);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    

    @Override
    public String toString() {
        return "HomemadeProduct{" + "product_name=" + product_name + '}';
    }
}
