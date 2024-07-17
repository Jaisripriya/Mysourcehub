package TestNG;

import org.testng.annotations.Test;

public class testNGmethods {
	
	//priority
	@Test(priority=2)
	public void createContact() {
		System.out.println("created");
		
	}
//@Test(priority=1)
//@Test(invocationCount=2)
@Test(dependsOnMethods="createContact")
	public void modifyContact() {
		System.out.println("modify");
	}
}
