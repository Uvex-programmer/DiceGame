package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice(5);
        DiceCup diceCup = new DiceCup(5, 6);

        Player[] players = new Player[3];


        Logic logic = new Logic(players);
        players[0] = new Player("Robin", diceCup);
        players[1] = new Player("Alexander", diceCup);
        players[2] = new Player("Martin", diceCup);

        logic.doRound();

        Player winner = logic.highestScore();
        System.out.println("Vinnaren är " + winner.getName() + " " + winner.getTotalPoints());


    }
}
