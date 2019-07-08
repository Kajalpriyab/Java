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
public class InheritanceOefeningLes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Question q = new Question();
        q.setText("Who was the inventor of Java?"); //setText komt van de superklasse
        q.setAnswer("James Gosling");
        System.out.println("");

        questionChoice multi = new questionChoice();
        multi.setText("How many fingers does one hand have?");
        multi.addChoice("5", true);
        multi.addChoice("8", false);
        multi.addChoice("2", false);
        multi.addChoice("9", false);

        q.presentQuestion();
        multi.presentQuestion(); //Je kan ipv de object multi, ook gewoon q gebruiken, omdat die in de superclass zit.
        System.out.println("");

        numericQuestion numQ = new numericQuestion();
        numQ.setText("What is 5 + 5?");
        numQ.setAnswer("10");
        numQ.presentQuestion();
        System.out.println("");

        FillInQuestion fillQ = new FillInQuestion();
        fillQ.setText("The inventor of Java is___");
        fillQ.setAnswer("The inventor of Java is _James Gosling_"); //Als wat tussen _ _ zit goed is..
        fillQ.presentQuestion();
        System.out.println("");
        
        AnyCorrectChoiceQuestion corChoice = new AnyCorrectChoiceQuestion();
        corChoice.setText("Which colours does the rainbow contain?: ");
        corChoice.addChoice("Violet", true);
        corChoice.addChoice("Blue", true);
        corChoice.addChoice("black", false);
        corChoice.presentQuestion();
        
    }
}
