package in.alagappan.sportshub.service;

import in.alagappan.sportshub.dao.UserDAO;
import in.alagappan.sportshub.model.User;
import in.alagappan.sportshub.validation.UserValidator;

public class UserService {
 public User[] getAll(){
	 UserDAO userDao = new UserDAO();
	 
	 User[] userList = userDao.findAll();
	 
	 for(int i=0;i<userList.length;i++) {
	 System.out.println(userList[i]);
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

 
}
