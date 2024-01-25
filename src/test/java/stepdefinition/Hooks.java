package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

/*Hooks are nothing but @testNg annotations
 * */
public class Hooks {
	@BeforeAll
	public static void beforeAll() {
		System.out.println("DB connections .. ***before any ***");
	}

	@Before(order=0)
	public void setUp() {
		System.out.println("@before hook started --browser initialised ***before every scenario***");
	}
	
	@Before(order=1)
	public void setUp1() {
		System.out.println("@before hook started --browser initialised ***before every scenario***");
	}
	
	@Before("@staging")
	public void setUp2() {
		System.out.println("@before hook started --browser initialised ***before every scenario*** only for staging");
	}

	@BeforeStep
	public void beforeStep() {
		System.out.println("Before every step logs");
	}

	@AfterStep
	public void afterStep() {
		System.out.println("After every step logs");
	}

	@After(order=0)
	public void tearDown() {
		System.out.println("@After hook started -- browser quit ***after every scenario***1");
	}
	
	@After(order=1)
	public void tearDown1() {
		System.out.println("@After hook started -- browser quit ***after every scenario***2");
	}

	@After("@staging")
	public void tearDown3() {
		System.out.println("@After hook started -- browser quit ***after every scenario*** for staging only");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("DB connections down .. ***before any ***");
	}
}
