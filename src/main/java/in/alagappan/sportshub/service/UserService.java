package in.alagappan.sportshub.service;

import java.util.Set;

import in.alagappan.sportshub.dao.UserDAO;
import in.alagappan.sportshub.model.UserEntity;
import in.alagappan.sportshub.validation.UserValidator;

public class UserService {
	
 public Set<UserEntity> getAll(){
	 UserDAO userDao = new UserDAO();
	 
	 Set<UserEntity> userList = userDao.findAll();
		
     for (UserEntity name : userList) {
     	
    	 System.out.println(name);
						
				}
	 return userList;
 }
 
 public void create(UserEntity newUser) throws Exception{
	 	UserValidator.validate(newUser);
	 	
		UserDAO userDAO = new UserDAO();
		userDAO.create(newUser);
 }
 
 public void update(int id, UserEntity updateUser){
	 	UserDAO userDAO = new UserDAO();
		userDAO.update(id, updateUser);
}
 
 public void delete(int id){
	 	UserDAO userDAO = new UserDAO();
		userDAO.delete(id);
}
 
 public UserEntity findById(int id) {
		UserDAO userDao = new UserDAO();
		return userDao.findById(id);
	}

 
}
