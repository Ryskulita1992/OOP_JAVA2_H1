package com.company;

public class Phone {

    private int price;
    private String name;
    private int model;
    private String color;
    private int dateOfRelease;
    private Made_in made_in;

    public Made_in getMade_in() {
        return made_in;
    }

    public void setMade_in(Made_in made_in) {
        this.made_in = made_in;
    }




    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
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
    public  Phone(int price, String name, int model, String color, int dateOfRelease){};

    public Phone(int price, String name, int model, String color, int dateOfRelease, Made_in made_in) {
        this.price = price;
        this.name = name;
        this.model = model;
        this.color = color;
        this.dateOfRelease = dateOfRelease;
        this.made_in = made_in;

    }

    public String getInfo(){
        return "Name: " + getName() + "\n"+
                "Price:" + getPrice() +"\n"+
                "Model"+ getModel() +"\n"+
                "Color:" + getColor()+"\n"+
                " Made in: " +getMade_in()+"\n"+
                "dateOfRelease:" + getDateOfRelease();
    };
}


