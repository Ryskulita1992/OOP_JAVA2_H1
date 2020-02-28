package com.company;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


	Apple apple = new Apple (1400, 11, "space gray", 2019, Made_in.china);
     apple.setColor();
	System.lineSeparator();
	System.out.println(apple.getInfo());
	System.out.println("______________________________________________");
	Samsung samsung = new Samsung(1000, 10, "gold", 2018, Made_in.korea);
	System.out.println(samsung.getInfo());
	System.out.println("______________________________________________");
	Phillips phillips=new Phillips(800, 9," pink ", 2019 , Made_in.netherlands);
	phillips.getInfo();
	System.out.println();






    }
}
