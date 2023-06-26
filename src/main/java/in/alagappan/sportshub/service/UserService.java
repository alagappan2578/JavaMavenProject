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

 
}
