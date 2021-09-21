package com.company;

import java.util.Random;

public class Dice {
 /*   Opret en klasse der hedder Dice.
    En terning har en integer attribut kaldet faceValue, der repræsenterer terningens værdi,
    dvs. den side på terningen, som ”vender opad”.
    Lav en metode, der hedder roll, der assigner en værdi ml. 1 -6 til attributten faceValue.
    Lav en get metode, der returnerer terningens værdi.
    Lav en testklasse med en main metode, hvor du instantierer en terning og tester om den virker, som den skal. */

    private int faceValue;

    public Dice(){
        this.faceValue = faceValue;
    }

    public void roll(){
        Random rn = new Random();
        faceValue = rn.nextInt(6) +1;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public String toString(){
        return "Terningen viser: " + getFaceValue();
    }
}
