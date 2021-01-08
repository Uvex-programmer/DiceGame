package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Logic {

    private Player[] players;

    public Logic(Player[] players) {
        this.players = players;
    }

    public void doRound(){
        while(!checkIfWinner()){
        for(Player player : players) {
            player.rollDice();
            System.out.println(player.getName() + " total poäng: " + player.getTotalPoints());
            }
        }



    }

    public boolean checkIfWinner(){

        for(Player player : players){
            if(player.getTotalPoints() >= 100 && !samePoints()){
                return true;
            }
        }
        return false;
    }

    public boolean samePoints(){
        ArrayList<Integer> points = new ArrayList<>();

        for(Player player : players){
            points.add(player.getTotalPoints());
        }
        Collections.sort(points);

        if(points.get(points.size() - 1).equals(points.get(points.size() - 2))){
            System.out.println("Det blev oavgjort!");
            return true;
        }
        return false;
    }
    public Player highestScore() {
        int bestScore = 0;
        int bestIndex = 0;
        for (int i = 0; i < players.length; i++) {
            if(players[i].getTotalPoints() > bestScore ){
                bestScore = players[i].getTotalPoints();
                bestIndex = i;
            }
        }
        return players[bestIndex];
    }

}
