package EX1_hw1.EX1_hw1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Unit test for simple App.
 */
public class AppTest {
  Q4 tester= new Q4 ();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test_1() {
    	String Expected_result="A";
    	int a= 28,b=24;
    	String mod="regular";
    	String actual_result= tester.Comapre(a, b, mod);
    	assertEquals(Expected_result,actual_result);
    	
    }
    @Test
    public void Test_2() {
    	String Expected_result="A";
    	int a= -32,b=-40;
    	String mod="regular";
    	String actual_result= tester.Comapre(a, b, mod);
    	assertEquals(Expected_result,actual_result);
    	
    }

    @Test
public void Test_4() {
	String Expected_result="B";
	int a= 5,b=-2;
	String mod="negatives";
	String actual_result= tester.Comapre(a, b, mod);
	assertEquals(Expected_result,actual_result);
	
}
    @Test
public void Test_5() {
	String Expected_result="B";
	int a= 3,b=-4;
	String mod="negatives";
	String actual_result= tester.Comapre(a, b, mod);
	assertEquals(Expected_result,actual_result);
	
}
    @Test
public void Test_6() {
	String Expected_result="A";
	int a=1/2,b=10;
	String mod="reciprocals";
	String actual_result= tester.Comapre(a, b, mod);
	assertEquals(Expected_result,actual_result);
	
} 
    @Test
public void Test_7() {
	String Expected_result="A";
	int a=1/3,b=12;
	String mod="reciprocals";
	String actual_result= tester.Comapre(a, b, mod);
	assertEquals(Expected_result,actual_result);
	
}  
 
    @Test
    public void testDivideByZero_Test_8() {
    	String Expected_result="error";
    	int a=5, b=0;
    	String mod="reciprocals";
    	String actual_result= tester.Comapre(a, b, mod);
  
    	 /**ssertEquals("Divide by zero gives infinity as result", true, Double.isInfinite(actual_result));**/
    	    assertEquals("error", Expected_result, actual_result);

    }
    



    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
