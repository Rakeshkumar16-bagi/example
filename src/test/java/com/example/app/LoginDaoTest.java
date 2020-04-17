package com.example.app;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LoginDaoTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void loginTest()
    {
        LoginDao loginDao = new LoginDao();
		Login login = new Login();
		login.username="apps";
		login.password="1234";
		boolean result = loginDao.login(login);
		assertTrue(result);
    }
	
	@Test
    public void loginFailureTest()
    {
        LoginDao loginDao = new LoginDao();
		Login login = new Login();
		login.username="app";
		login.password="12";
		boolean result = loginDao.login(login);
		assertFalse(result);
    }
}
