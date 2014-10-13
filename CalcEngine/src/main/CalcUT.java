package main;

//JUnit Test
import junit.framework.TestCase;
import main.CalcGUI;

public class CalcUT extends TestCase {

	public void Test() {

		CalcEngine c = new CalcEngine();
		assertEquals(11007, c.Calculate(10000, 3, 3.25));
	}
}
