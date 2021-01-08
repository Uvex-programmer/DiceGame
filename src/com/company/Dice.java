package com.company;

import java.util.Random;

public class Dice {

    private int sides;
    private int lastValue;

    public Dice(int sides) {
        this.sides = sides;

    }

    public int getSides() {
        return sides;
    }

    public int getLastValue() {
        return lastValue;
    }

    public void rollDice(){

        Random rand = new Random();
        lastValue = rand.nextInt(6) + 1;

        System.out.println("Throw: " + lastValue);

    }

}
