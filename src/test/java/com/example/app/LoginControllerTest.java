package com.example.app;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class LoginControllerTest 
{
    /**
     * Rigorous Test :-)
	  
     */
	 @BeforeClass
	 public void beforeClassSetup() {
		 System.out.println("Before class");
	 }
	 
    @Test
    public void loginTest()
    {
		//mocking
		//when(service.login).return(true);
        LoginController loginController = new LoginController();
		boolean result = loginController.login("yes", "yes");
		assertFalse(result);
    }
	@Test
    public void loginTest2()
    {
		//mocking
		//when(service.login).return(true);
        LoginController loginController = new LoginController();
		boolean result = loginController.login("yes", "12301455");
		assertFalse(result);
    }
	
	@Test
    public void loginTest3()
    {
		//mocking
		//when(service.login).return(true);
        LoginController loginController = new LoginController();
		boolean result = loginController.login("yes", "yes");
		assertFalse(result);
    }
	
	 @AfterClass
	 public void afterClassSetup() {
		 System.out.println("After class");
	 }
}
