package in.alagappan.sportshub;

import in.alagappan.sportshub.service.UserService;

public class App {
 public static void main(String[] args) {
	 UserService userService = new UserService();
	 
	 userService.getAll();
 }
}
