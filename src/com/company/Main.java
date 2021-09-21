package com.company;


public class Main {

    public static void main(String[] args) {
        Dice dice = new Dice();

        //test
        dice.roll();
        System.out.println(dice.getFaceValue());

        dice.roll();
        System.out.println(dice);
        System.out.println(dice);

        dice.roll();
        System.out.println(dice);


    }


}
