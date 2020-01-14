package com.company;

public class Apple extends Phone {


    public Apple(int price, String name, int model, String color, int dateOfRelease, Made_in made_in) {
        super(price, name, model, color, dateOfRelease, made_in);
    }
    public void setPrice  (String Color){
        System.out.println("Space Grey");

    }

    public final void setPrice() {
        System.out.println("Price depends on ...");




    }


    @Override
    public String getInfo() {
        return super.getInfo();
    }
};





