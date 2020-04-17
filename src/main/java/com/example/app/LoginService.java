package com.example.app;

public class LoginService
{
	public boolean log(Login log1)
		{
			System.out.println("name" + log1.username + "password" + log1.password);
			LoginDao logindao=new LoginDao();
			boolean result=logindao.login(log1);
			System.out.println(result);
			return result;
		}
}		
		