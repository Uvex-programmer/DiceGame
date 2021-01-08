package com.company;

public class Player {

    private DiceCup diceCup;
    private String name;
    private int totalPoints;

    public Player(String name, DiceCup diceCup) {
        this.name = name;
        this.diceCup = diceCup;

    }

    public String getName() {
        return name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void rollDice(){
        this.diceCup.rollDice();
        this.totalPoints = this.totalPoints + this.diceCup.getTotalPoints();


    }

}
