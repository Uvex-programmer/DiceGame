package com.company;

public class DiceCup {

    private Dice[] diceCup;
    private int totalPoints;

    public DiceCup(int dices, int sides){
        this.diceCup = new Dice[dices];
        for(int i = 0; i < dices; i++){
            this.diceCup[i] = new Dice(sides);
        }
    }

    public void rollDice(){
        totalPoints = 0;
        for (Dice dice : diceCup){
            dice.rollDice();
            this.totalPoints = this.totalPoints + dice.getLastValue();
        }
        System.out.println("Totala poängen: " + this.totalPoints);
    }

    public int getTotalPoints() {
        return this.totalPoints;
    }
}

