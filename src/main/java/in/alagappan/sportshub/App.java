package in.alagappan.sportshub;

import in.alagappan.sportshub.service.*;

import in.alagappan.sportshub.model.*;
public class App {
 public static void main(String[] args) {
	 
	 try {
		 
		UserService userService = new UserService();
		 
		 	UserEntity newUser1 = new User();
			newUser1.setId(001);
			newUser1.setFirstName("Alagappan");
			newUser1.setLastName("Kumaravel");
			newUser1.setEmail("alagappan@gmail.com");
			newUser1.setPassword("Aa!a2aa");
			newUser1.setActive(true);
			
			UserEntity newUser2 = new User();
			newUser2.setId(002);
			newUser2.setFirstName("Alagappan");
			newUser2.setLastName("Kumaravel");
			newUser2.setEmail("alagappan12@gmail.com");
			newUser2.setPassword("Aa!a2aa");
			newUser2.setActive(true);
			
			userService.create(newUser1);
			userService.create(newUser2);
		 
			UserEntity updateUser = new User();
			updateUser.setId(001);
			updateUser.setFirstName("Alagu");
			updateUser.setLastName("Kumaravel");
			updateUser.setEmail("alagappan@gmail.com");
			updateUser.setPassword("Aa!a2aa");
			updateUser.setActive(true);
			
			userService.update(002,updateUser);
			
			userService.delete(001);
		 
			userService.getAll();
			
//			task 
			TaskService taskService = new TaskService();
			
			Task newTask1 = new Task();
			newTask1.setId(001);
			newTask1.setName("Run");
			newTask1.setDueDate("30/07/2023");
			newTask1.setActive(true);
			
			taskService.create(newTask1);
			
			Task newTask2 = new Task();
			newTask2.setId(002);
			newTask2.setName("Swim");
			newTask2.setDueDate("30/07/2023");
			newTask2.setActive(true);
			
			taskService.create(newTask2);
			
			Task updateTask = new Task();
			updateTask.setId(001);
			updateTask.setName("Run");
			updateTask.setDueDate("30/07/2023");
			updateTask.setActive(true);
			
			taskService.update(001,updateTask);
			
			taskService.delete(001);
		 
			taskService.getAll();
			
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
