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
public class questionChoice extends Question {

    private ArrayList<String> choices;

    public questionChoice() {
        choices = new ArrayList<String>();
    }
    
    public ArrayList<String> setChoices(){
        return this.choices;
    }

    public void setChoice(String choice){
        this.choices.add(choice);
    }
    
    public void addChoice(String choice, boolean correct) {
        setChoice(choice);
        if (correct == true) {
            String choiceString = "" + setChoices().get(0);
            setAnswer(choiceString); //In de andere vraag zet je de answer vast in de main, hier doe je dat al in de subclass zelf. Hier zet je goede antwoord vast.
        }
    }

    @Override
    public void display() { //This method overrides a method from the superclass, omdat dit een ander soort vraag/antwoord is(multichoice).
        //This method needs to display the question text and the answer choices.

        super.display(); //You can't acces the text variable from superclass, because it is private, so you can just call superclass instead.
        for (int i = 0; i < choices.size(); i++) {
            int numberOfChoice = i + 1;
            System.out.println(numberOfChoice + ": " + choices.get(i));
        }
    }
}
