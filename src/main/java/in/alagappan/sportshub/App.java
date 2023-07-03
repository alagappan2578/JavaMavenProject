package in.alagappan.sportshub;

import in.alagappan.sportshub.service.UserService;

import in.alagappan.sportshub.model.User;
public class App {
 public static void main(String[] args) {
	 try {
		UserService userService = new UserService();
		 
		 	User newUser1 = new User();
			newUser1.setId(001);
			newUser1.setFirstName("Alagappan");
			newUser1.setLastName("Kumaravel");
			newUser1.setEmail("alagappan@gmail.com");
			newUser1.setPassword("Aa!a2aa");
			newUser1.setActive(true);
			
			User newUser2 = new User();
			newUser2.setId(002);
			newUser2.setFirstName("Alagappan");
			newUser2.setLastName("Kumaravel");
			newUser2.setEmail("alagappan12@gmail.com");
			newUser2.setPassword("Aa!a2aa");
			newUser2.setActive(true);
			
			userService.create(newUser1);
			userService.create(newUser2);
		 
			User updateUser = new User();
			updateUser.setId(001);
			updateUser.setFirstName("Alagu");
			updateUser.setLastName("Kumaravel");
			updateUser.setEmail("alagappan@gmail.com");
			updateUser.setPassword("Aa!a2aa");
			updateUser.setActive(true);
			
			userService.update(001,updateUser);
			
			userService.delete(001);
		 
			userService.getAll();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
