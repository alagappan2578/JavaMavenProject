package in.alagappan.sportshub.service;

import java.util.Set;

import in.alagappan.sportshub.dao.UserDAO;
import in.alagappan.sportshub.model.User;
import in.alagappan.sportshub.model.User;
import in.alagappan.sportshub.validation.UserValidator;

public class UserService {
	
 public Set<User> getAll(){
	 UserDAO userDao = new UserDAO();
	 
	 Set<User> userList = userDao.findAll();
		
     for (User name : userList) {
     	
    	 System.out.println(name);
						
		}
	 return userList;
 }
 
 public void create(User newUser) throws Exception{
	 	UserValidator.validate(newUser);
	 	
		UserDAO userDAO = new UserDAO();
		userDAO.create(newUser);
 }
 
 public void update(int id, User updateUser){
	 	UserDAO userDAO = new UserDAO();
		userDAO.update(id, updateUser);
}
 
 public void delete(int id){
	 	UserDAO userDAO = new UserDAO();
		userDAO.delete(id);
}
 
 public User findById(int id) {
		UserDAO userDao = new UserDAO();
		return userDao.findById(id);
	}

 
}
