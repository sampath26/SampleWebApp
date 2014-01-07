package com.vin.web.action;

import com.vin.web.beans.User;
import com.vin.web.impls.RegisterServiceImpl;
import com.vin.web.services.RegisterService;

public class SampleAction {
	
	private String firstName;
	
	private String lastName;
	
	private RegisterService registerService;
	
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String execute() throws Exception
	{
		User user = new User();
		user.setFirstName(this.firstName);
		user.setLastName(this.lastName);
		
//		registerService = new RegisterServiceImpl();
		
		System.out.println(registerService.toString());
		
		registerService.createUser(user);
		
		
		
		return "success";
		
	}

}
