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
public class numericQuestion extends Question {

    private double numAnswer;
    private double numResponse;

    @Override
    public void setAnswer(String correctResponse) {
        super.setAnswer(correctResponse);
        numAnswer = Double.parseDouble(correctResponse);
    }

    @Override
    public boolean checkAnswer(String response) {
        //Response omzetten naar Double
        numResponse = Double.parseDouble(response);
        if ((numResponse == numAnswer) || numResponse == numAnswer + 0.01 || numResponse == numAnswer - 0.01) {
            return true;
        } else {
            return false;
        }
    }
}
