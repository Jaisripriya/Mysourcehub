package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hoos {
	@BeforeStep
	
	public void beoreStep(Scenario scenario) {
		
	}
	@AfterStep
	public void afetrStep(Scenario scenario) {
		
	}
	
	@Before
	public void beforescenario(Scenario scenario) {
		String name=Scenario.getName();
		System.out.println("Scenario name:"+ name);
	
		}
	
	@After
	public void afetrscenario(Scenario scenario) {
		
	}
}
