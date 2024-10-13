/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mayurshiroya
 */
public class Product {

    private String name;
    private int price;
    private int id;
    private ArrayList<Feature> features;
//    private ImageIcon logoImage;


    private static int count = 0;

    public Product() {
        count++;
        id = count;
        features = new ArrayList<Feature>();

    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }

    public static boolean isValidName(String str) {
        String expression = "^[a-zA-Z\\s]+";
        return str.trim().matches(expression);
    }

    public static boolean isValidNumber(String str) {
        String expression = "^[0-9]*$";
        return str.trim().matches(expression);
    }

    public Feature addNewFeature() {
    Feature newFeature = new Feature(); 
    if (this.features == null) {
        this.features = new ArrayList<>();
    }
    
    this.features.add(newFeature);
    return newFeature;
    }

}


