/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceoefeningles;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author simra
 */
public class AnyCorrectChoiceQuestion extends questionChoice {

    private ArrayList<String> goodAnswers;

    public AnyCorrectChoiceQuestion() {
        goodAnswers = new ArrayList<String>();

    }

    @Override
    public void addChoice(String choice, boolean correct) {

        setChoice(choice); // Is gewoon choices.add(choice);
        int i = 0;
        while (i < setChoices().size()) {

            if (correct) {
                String choiceString = "" + setChoices().get(i); //Gewoon choices.get(i);
                goodAnswers.add(choiceString); //Hier voeg je een goed antwoord toe aan de ArrayList van goede antwoorden.
            }
            i++;
        }
    }

    @Override
    public void display() {
        //This method needs to display the question text and the answer choices.
        super.display();
        System.out.println("You can choose one of the correct answers!");
    }

    @Override
    public boolean checkAnswer(String response) {

        for (int i = 0; i < goodAnswers.size(); i++) {

            if (response.equals(goodAnswers.get(i))) {
                return true;
            }
        }
        return false;
    }
}
