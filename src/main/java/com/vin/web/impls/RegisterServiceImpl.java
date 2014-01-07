package com.vin.web.impls;

import com.vin.web.beans.User;
import com.vin.web.services.RegisterService;

public class RegisterServiceImpl implements RegisterService {

	private RegisterServiceDAO registerServiceDAO;
	
	public void setRegisterServiceDAO(RegisterServiceDAO registerServiceDAO) {
		this.registerServiceDAO = registerServiceDAO;
	}

	@Override
	public void createUser(User user) {
		
		UserEntity entity = new UserEntity();
		entity.setFirstName(user.getFirstName());
		entity.setLastName(user.getLastName());
	
		System.out.println(" ******************************************************** ");
		
		registerServiceDAO.createUser(entity);
		
		System.out.println("FirstName: " + user.getFirstName() + " LastName: " + user.getLastName());
		
	}
	
	
	

}
