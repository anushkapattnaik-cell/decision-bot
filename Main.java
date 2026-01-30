package com.decisionbot.app;

public class Main {
    public static void main(String[] args){
        System.out.println("----your decision bot----");
        System.out.println("What are you thinking of doing?");

        //creating a new object named "bot" for the class "DecisionBot". In this object only the working of the code will execute.
        DecisionController bot = new DecisionController();
        bot.start();
    }
}
