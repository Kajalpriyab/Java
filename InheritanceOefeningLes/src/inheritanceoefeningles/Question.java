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
public class Question {

    private String text;
    String Answer;

    public Question() {
        text = "";
        Answer = "";
    }

    public void setText(String questionText) {
        text = questionText;
    }

    public void setAnswer(String correctResponse) {
        Answer = correctResponse;
    }

    public String getAnswer() {
        return Answer;
    }

    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(Answer); //Hierdoor word er niet op gelet dat de hoofdletters en normale letters gelijk zijn, als het antwoord maar klopt.
    }

    public void display() {
        System.out.println(text);
    }

    public String getText() {
        return text;
    }

    public void presentQuestion() {
        this.display();
        System.out.print("Your answer: ");
        Scanner keyboard = new Scanner(System.in);
        String response = keyboard.nextLine();
        System.out.println(this.checkAnswer(response));
    }
}
