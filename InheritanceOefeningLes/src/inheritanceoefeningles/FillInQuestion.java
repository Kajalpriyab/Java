/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceoefeningles;

import java.util.Scanner;

/**
 *
 * @author simra
 */
public class FillInQuestion extends Question {

    private String valueInBetween;

    public void anotherAnswer() {

        int start = 0;
        int end = 0;
        //Loops through: setAnswer("The inventor of Java is _James Gosling_");
        //CorrectResponse = "The inventor of Java is _James Gosling_";
        String n = super.getAnswer();   //!!!!!

        int i = 0;
        while (i < n.length()) {
            if (n.charAt(i) == '_') {
                start = i;
                int j = start;
                while (j < n.length()) {
                    if (n.charAt(j) == '_') {
                        end = j;
                        valueInBetween = n.substring(start + 1, end); //Value between _ and _
                    }
                    j++;
                }
            }
            i++;
        }

//        for (i = 0; i < n.length(); i++) {
//            if (n.charAt(i) == '_') {
//                start = i;
//                for (j = start + 1; j < n.length(); j++) {
//                    if (n.charAt(j) == '_') {
//                        end = j;
//                    }
//                }
//            }
        //valueInBetween = n.substring(start + 1, end); //Value between _ and _
        //setAnswer(valueInBetween);
    }

    // @Override
    // public void setAnswer(String correctResponse) { //The inventor of Java is _James Gosling_
    //setAnswer(correctResponse); //Hier zeg je alleen dat correctResponse de variable Answer is.
    //Loop through the text and find the first _, then put the correctResponse there.
//        int start = 0;
//        int end = 0;
    //Loops through: setAnswer("The inventor of Java is _James Gosling_");
    //CorrectResponse = "The inventor of Java is _James Gosling_";
//        String n = correctResponse;
//        for (int i = 0; i < n.length(); i++) {
//            if (n.charAt(i) == '_') {
//                start = i;
//                start++;
//                if (n.charAt(i) == '_') {
//                    end = i;
//                }
//            }
    //valueInBetween = n.substring(start + 1, end); //Value between _ and _
//            correctResponse = valueInBetween; //ValueInBetween is null/ "" and that's why Answer is also ""
//        }
    @Override
    public boolean checkAnswer(String response) {
        int start = 0;
        int end = 0;
        String n = super.getAnswer();   //!!!!!

        int i = 0;
        while (i < n.length()) {
            if (n.charAt(i) == '_') {
                start = i;
                int j = start;
                while (j < n.length()) {
                    if (n.charAt(j) == '_') {
                        end = j;
                        valueInBetween = n.substring(start, end); //Value between _ and _
                    }
                    j++;
                }
            }
            i++;
        }
        return response.equals(valueInBetween);//Wat het doet: response.equals("");
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void presentQuestion() {
        this.display(); //Showt alleen de vraag: Question only displayed as: The inventor of Java is ___
//In de response moet gecheckt worden of wat er tussen _ _ zit bij setAnswer in main goed is.
//Start + 1 && End == '_' //Value between start and end, sp between _ and _.
        Scanner keyboard = new Scanner(System.in);
        String response = keyboard.nextLine();
        System.out.println(this.checkAnswer(response)); //This is a reference to an object of the class you called.
        //Deze komen van de superClass Question, maar de methodes checkAnswer enzo moeten uit deze klas komen.
    }
}
