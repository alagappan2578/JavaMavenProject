package in.alagappan.sportshub.service;

import in.alagappan.sportshub.dao.UserDAO;
import in.alagappan.sportshub.model.User;

public class UserService {
 public User[] getAll(){
	 UserDAO userDao = new UserDAO();
	 
	 User[] userList = userDao.findAll();
	 
	 for(int i=0;i<userList.length;i++) {
	 System.out.println(userList[i]);
	 }
	 return userList;
 }
 
 public void create(){
	 
	 User newUser = new User();
		newUser.setId(001);
		newUser.setFirstName("Alagappan");
		newUser.setLastName("Kumaravel");
		newUser.setEmail("alagappan@gmail.com");
		newUser.setPassword("Aa!a2aa");
		newUser.setActive(true);
		
		UserDAO userDAO = new UserDAO();
		userDAO.create(newUser);
 }

 
}
