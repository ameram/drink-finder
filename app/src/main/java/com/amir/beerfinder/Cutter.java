package com.amir.beerfinder;

import java.util.ArrayList;
import java.util.List;

public class Cutter {
    public static List<String> getBeerType(String beerType){
        List<String> beerlist =  new ArrayList<>();
        if (beerType.equals("Beer")){
            beerlist.add("Malt");
            beerlist.add("German");
            beerlist.add("Russian");
        }
        else if (beerType.equals("Beverage")){
            beerlist.add("Coca");
            beerlist.add("Fanta");
            beerlist.add("Sprite");
            beerlist.add("Pepsi");
        }
        else if (beerType.equals("Juice")){
            beerlist.add("Orange");
            beerlist.add("Cherry");
            beerlist.add("Apple");
            beerlist.add("Grape");
        }
        else if (beerType.equals("Hot")){
            beerlist.add("Coffee");
            beerlist.add("Milk");
            beerlist.add("Hot Chocolate");
            beerlist.add("Tea");
        }
        else {
            beerlist.add("Red Bull");
            beerlist.add("Monster");
            beerlist.add("Big Bear");
            beerlist.add("Vitamin C");
        }
        return beerlist;
    }
}
//Beer
//Beverage
// Juice
//Hot
//Energy
