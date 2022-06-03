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
public class All extends Product{
    private String name1;
    private String name2;
    protected static int total_all = 0;
    protected static int kazanilan_puan;
    

    public All(int id, String type, int price, String name1, String name2) {
        super(id, type, price);
        this.name1 = name1;
        this.name2 = name2;
        total_all++;
    }
    
    @Override
    public void point() {
        kazanilan_puan = Shopping.total_bill/100*4;
        loginScreen.list.get(loginScreen.kullanici).setMoney(loginScreen.list.get(loginScreen.kullanici).getMoney() + kazanilan_puan);
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "All{" + "name1=" + name1 + ", name2=" + name2 + '}';
    }
}
