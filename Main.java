package com.decisionbot.app;

public class Main {
    public static void main(String[] args){
        System.out.println("----your decision bot----");
        System.out.println("What are you thinking of doing?");

        DecisionController bot = new DecisionController();
        bot.start();
    }
}
