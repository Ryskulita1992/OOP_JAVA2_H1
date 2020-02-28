package com.company;

public class Phone {

    private int price;

    private int model;
    private String color;
    private int dateOfRelease;
    private Made_in made_in;

    public Made_in getMade_in() {
        return made_in;
    }



    public int getPrice() {
        return price;
    }


    public int getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDateOfRelease() {
        return dateOfRelease;
    }
    public  Phone(String name, int price,  int model, String color, int dateOfRelease){};

    public Phone(int price ,  int model, String color, int dateOfRelease, Made_in made_in) {
        this.price = price;
        this.model = model;
        this.color = color;
        this.dateOfRelease = dateOfRelease;
        this.made_in = made_in;

    }

    public String getInfo(){
        return    "Price: - " + getPrice() + "  Model - "+ getModel() + " Color: " + getColor()+  " Made in: " +getMade_in()+ " dateOfRelease: " + getDateOfRelease();
    };
}


