package com.example.app;
public class Client_Browser 
	{
		public static void  main(String[] args) 
			{
				LoginController logincontroller = new LoginController();
				boolean result = logincontroller.login("u", "p");
				System.out.println(result);
			}
	}
