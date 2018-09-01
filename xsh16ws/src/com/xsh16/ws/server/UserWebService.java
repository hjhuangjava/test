package com.xsh16.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class UserWebService {
	@WebMethod
	public boolean save(String user, String password){
		if("admin".equals(user) && "123123".equals(password))
			return true;
		return false;
	}
	
	@WebMethod
	public int add(int num1, int num2){
		return num1 + num2;
	}
}
