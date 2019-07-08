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
public class numericQuestionTest {
    
    public numericQuestionTest() {
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
     * Test of setAnswer method, of class numericQuestion.
     */
    @Test
    public void testSetAnswer() {
        System.out.println("setAnswer");
        String correctResponse = "";
        numericQuestion instance = new numericQuestion();
        instance.setAnswer(correctResponse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAnswer method, of class numericQuestion.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswer");
        String response = "";
        numericQuestion instance = new numericQuestion();
        boolean expResult = false;
        boolean result = instance.checkAnswer(response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
