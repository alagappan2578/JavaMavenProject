package in.alagappan.sportshub.dao;

import in.alagappan.sportshub.model.User;

public class UserDAO {

	public User [] findAll() {
		
		User[] userList = UserList.listOfUser;
		return userList; 
	}
	public void create() {
		User newUser = new User();
		newUser.setId(001);
		newUser.setFirstName("Alagappan");
		newUser.setLastName("Kumaravel");
		newUser.setEmail("alagappan@gmail.com");
		newUser.setPassword("Aa!a2aa");
		newUser.setActive(true);
		
		UserList.listOfUser[0] = newUser;
	}

	
}
