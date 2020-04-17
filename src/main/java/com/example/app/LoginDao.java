package com.example.app;
public class LoginDao
	{
		public boolean login(Login log2)
			{
				System.out.println("name" + log2.username + "password" + log2.password);
				String name="apps";
				String password="1234";
				
				//String name = null; // bringing this value from DB
				//String password = null; // bringing this value from DB
				
				
				if(name.equals(log2.username)&& password.equals(log2.password))
					{
						System.out.println("valid");
						return true;
						
					}
					else
					{
						System.out.println("invalid");
						return false;
						
					}
					
			}
	}

	