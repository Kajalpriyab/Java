/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceoefeningles;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simra
 */
public class QuestionTest {
    
    public QuestionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setText method, of class Question.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String questionText = "";
        Question instance = new Question();
        instance.setText(questionText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnswer method, of class Question.
     */
    @Test
    public void testSetAnswer() {
        System.out.println("setAnswer");
        String correctResponse = "";
        Question instance = new Question();
        instance.setAnswer(correctResponse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnswer method, of class Question.
     */
    @Test
    public void testGetAnswer() {
        System.out.println("getAnswer");
        Question instance = new Question();
        String expResult = "";
        String result = instance.getAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAnswer method, of class Question.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswer");
        String response = "";
        Question instance = new Question();
        boolean expResult = false;
        boolean result = instance.checkAnswer(response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Question.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Question instance = new Question();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class Question.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Question instance = new Question();
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of presentQuestion method, of class Question.
     */
    @Test
    public void testPresentQuestion() {
        System.out.println("presentQuestion");
        Question q = null;
        Question.presentQuestion(q);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
