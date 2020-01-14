package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	Apple apple = new Apple(2000 , "Apple", 11, "Space_grey", 2019_12_12,Made_in.china);
	System.out.println("Apple phone");
	apple.setPrice();

        System.out.println(apple.getInfo());

  Samsung samsung = new Samsung(1000, "Samsung", 9, "White", 2019,Made_in.korea);
        System.out.println("Samsung phone");

        System.out.println(samsung.getInfo());





    }
}
