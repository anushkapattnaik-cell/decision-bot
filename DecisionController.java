package com.decisionbot.app;

import java.util.Scanner;

public class DecisionController {

    //taking the user input (Here taking the user input basically means answers of the questions like yes/no).
    Scanner in = new Scanner(System.in);

    //here we are creating an array for the constructor "Question" and storing the value in the "Questions".
    Question[] Questions = {

            //syntax : {new array_name(value which were initialised in the Question class in the parameterized constructor will be filled here.)
            // new Question(String,int)
            new Question("Is this important for your life choices?", 3),
            new Question("Will this help you in future?",3),
            new Question("Is it risky?",-2),
            new Question("Are you feel lazy or confused?",-3),
            new Question("will you regret doing it?",4)
    };

    public void start(){
        //initially the score would be 0
        int score = 0;
        //using the for-each loop
        for(Question q : Questions){
            System.out.println(q.text + " (yes/no)");
            String ans = in.nextLine().toLowerCase();

            if(ans.equals("yes")) {
                score += q.weight;
            } else if(ans.equals("no")){
                score-=q.weight;
            }
        }

        //calling the function to show the result
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
