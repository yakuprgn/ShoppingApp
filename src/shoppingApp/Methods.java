/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingApp;

import girisekrani.loginScreen;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static shoppingApp.Shopping.total_bill;


/**
 *
 * @author Yakup Ergun - Kubra Yildiz
 */
public class Methods {
    
    public static ArrayList<Electronic> list_elec = new ArrayList<>();
    public static ArrayList<Clothes> list_clot = new ArrayList<>();
    public static ArrayList<HomemadeProduct> list_hmp = new ArrayList<>();
    public static ArrayList<All> list_All = new ArrayList<>();
    
    public static Electronic obj1;
    public static Clothes obj2;
    public static HomemadeProduct obj3;
    public static All obj4;
    
    public static int searchCount = 0;
    public static int addCount = 0;
    
    public static void readFile(){
        File f1 = new File("electronics.txt");
        File f2 = new File("clothes.txt");
        File f3 = new File("hmproducts.txt");
        File f4 = new File("products.txt");
        
        try {
            Scanner input1 = new Scanner(f1);
            Scanner input2 = new Scanner(f2);
            Scanner input3 = new Scanner(f3);
            Scanner input4 = new Scanner(f4);
            while(input1.hasNext()){
                String data1 = input1.nextLine();
                System.out.println(data1);
                String[] s1 = data1.split(" ");
                obj1 = new Electronic(Integer.parseInt(s1[0]) ,s1[1] ,Integer.parseInt(s1[2]) ,s1[3] ,s1[4]);
                list_elec.add(obj1);
            }
            System.out.println("\n"+"Electronic Dosyasi Okundu!"+"\n");
            
            while(input2.hasNext()){
                String data2 = input2.nextLine();
                System.out.println(data2);
                String[] s2 = data2.split(" ");
                obj2 = new Clothes(Integer.parseInt(s2[0]) ,s2[1] ,Integer.parseInt(s2[2]) ,s2[3] ,s2[4]);
                list_clot.add(obj2);
            }
            System.out.println("\n"+"Clothes Dosyasi Okundu!"+"\n");
            
            while(input3.hasNext()){
                String data3 = input3.nextLine();
                System.out.println(data3);
                String[] s3 = data3.split(" ");
                obj3 = new HomemadeProduct(Integer.parseInt(s3[0]) ,s3[1] ,Integer.parseInt(s3[2]) ,s3[3] ,s3[4]);
                list_hmp.add(obj3);
            }
            System.out.println("\n"+"HomemadeProduct Dosyasi Okundu!"+"\n");
            
            while(input4.hasNext()){
                String data4 = input4.nextLine();
                System.out.println(data4);
                String[] s4 = data4.split(" ");
                obj4 = new All(Integer.parseInt(s4[0]) ,s4[1] ,Integer.parseInt(s4[2]) ,s4[3] ,s4[4]);
                list_All.add(obj4);
            }
            System.out.println("\n"+"products Dosyasi Okundu!"+"\n");
            
            input1.close();
            input2.close();
            input3.close();
            input4.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Dosya Bulunamadi!");
        }
        
    }
    
    public static boolean searchId(String id){
        for (All all : list_All) {
            if(id.equalsIgnoreCase(String.valueOf(all.getId()))){
                return true;
            }
            searchCount++;
        }
        return false;
    }
    
    public static boolean addId(String id){
        
        for (All all : list_All) {
            if(id.equalsIgnoreCase(String.valueOf(all.getId()))){
                 return true;
            }
            addCount++;
        }
        return false;
    }
    
    public static void addPoint(){
        list_All.get(loginScreen.kullanici).point();
    }
    
    public static boolean deleteId(String id){
       for (All all : list_All) {
            if(id.equalsIgnoreCase(String.valueOf(all.getId()))){
                return true;
            }
        }
        return false; 
    }
    
    public static void clearCart(){
        total_bill = 0;
    }
    
    public static boolean compareId(int a ,int b){
        if(a >= b){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean payTheCart(int a ,int b){
        if(a >= b && b != 0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
