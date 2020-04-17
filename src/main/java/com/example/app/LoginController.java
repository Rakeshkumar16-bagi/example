package com.example.app;
public class LoginController
{
	public boolean login(String name,String password)
	{
		System.out.println("name :" + name + "mail:no"  + password);
		Login login=new Login();
		login.username=name;
		login.password=password;
		
		LoginService service=new LoginService();
		boolean result=service.log(login);
		System.out.println(result);
		return result;
		
		
	}
}
		