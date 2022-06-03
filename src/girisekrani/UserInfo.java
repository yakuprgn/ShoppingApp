/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package girisekrani;

/**
 *
 * @author Yakup Ergun - Kubra Yildiz
 */
public class UserInfo implements GiftMoney{
    
    private String user_name;
    private String password;
    private String gender;
    private String country;
    private int credit_card_no;
    private int money;
    private ContactInfo cont_info;

    public UserInfo(String user_name, String password, String gender, String country, int credit_card_no, int money, ContactInfo cont_info) {
        this.user_name = user_name;
        this.password = password;
        this.gender = gender;
        this.country = country;
        this.credit_card_no = credit_card_no;
        this.money = money;
        //this.adress = adress;
        this.cont_info = cont_info;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCredit_card_no() {
        return credit_card_no;
    }

    public void setCredit_card_no(int credit_card_no) {
        this.credit_card_no = credit_card_no;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ContactInfo getCont_info() {
        return cont_info;
    }

    public void setCont_info(ContactInfo cont_info) {
        this.cont_info = cont_info;
    }
    
    @Override
    public void giftMoneyPoint() {
        this.money += 100;
    }
    
    @Override
    public String toString() {
        return "UserInfo{" + "user_name=" + user_name + ", password=" + password + ", gender=" + gender + ", country=" + country + '}';
    }

    

}
