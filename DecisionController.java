package com.decisionbot.app;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DecisionController {

    Scanner in = new Scanner(System.in);

    Question[] Questions = {
            new Question("Is this important for your life choices?", 3),
            new Question("Will this help you in future?",3),
            new Question("Is it risky?",-2),
            new Question("Are you feel lazy or confused?",-3),
            new Question("will you regret doing it?",4)
    };

    public void start(){
        int score = 0;
        for(Question q : Questions){
            System.out.println(q.text + " (yes/no)");
            String ans = in.nextLine().toLowerCase();

            if(ans.equals("yes")) {
                score += q.weight;
            } else if(ans.equals("no")){
                score-=q.weight;
            }
        }

        showResult(score);
    }
    private void showResult(int score){
        System.out.println("-----Decision-----");

        if(score>=5){
            System.out.println("yes you should do it");
        } else if (score<=5){
            System.out.println("no you shouldn't do it");
        } else {
            System.out.println("maybe");
        }

        System.out.println("Confidence score :" + Math.abs(score)*10 + "%");

    }
}
