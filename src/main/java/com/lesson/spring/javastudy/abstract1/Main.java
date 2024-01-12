package com.lesson.spring.javastudy.abstract1;

public class Main {

    public static void main(String[] args) {
        Weapon bow = new Bow(5);
        bow.attack();

        Weapon cane= new Cane(2);
        cane.attack();

        Weapon sward = new Sward(3);
        sward.attack();



    }

}
