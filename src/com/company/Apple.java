package com.company;

import java.awt.*;

public class Apple extends Phone {
    String  string;


    public Apple(int price,  int model, String color, int dateOfRelease, Made_in made_in) {
        super(price, model, color, dateOfRelease, made_in); }
    public void setColor  (String color){
        System.out.print("Space Grey"); }
    public void setColor() {
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
};





