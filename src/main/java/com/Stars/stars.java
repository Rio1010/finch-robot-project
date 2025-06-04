package com.Stars;

import com.birdbrain.Finch;

public class FinchDemo {
    public static void main(String[] args) {
        Finch star = new Finch();

        stars.setMove("F", 50, 50);
        stars.setMove("F", 30, 50);
        stars.setMove("F", 20, 50);
        stars.setMove("F", 5, 20);
        stars.stop();
        stars.setTurn("L", 90, 50);


        stars.stop();
        stars.setMove("F", 40, 40);
        stars.stop();
        stars.setTurn("L", 90, 50);
        stars.setMove("F", 30, 50);


        stars.stop();


        stars.setTurn("R", 90, 50);
        stars.setMove("F", 30, 50);
        stars.setMove("F", 15, 50);


        stars.setTurn("R", 90, 50);
        stars.setMove("F", 100, 50);


        stars.stop();


        stars.setMove("F", 15, 50);


        stars.setTurn("R", 90, 50);
        // stars.setTurn("R", 10, 50);


        stars.setMove("F", 15, 50);
        stars.setTurn("L", 90, 50);
        stars.setMove("F", 15, 50);
        stars.setMove("F", 10, 50);


        stars.setTurn("L", 90, 50);
        stars.setMove("F", 15, 90);

        // star.stopAll();
        // star.disconnect();
    }
}