package com.Stars;

import com.birdbrain.Finch;

public class FinchDemo {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        myFinch.playNote(60,0.5);

        Myfinch.setMove("F", 10,50);

        

        myFinch.stopAll();
        myFinch.disconnect();
    }
}