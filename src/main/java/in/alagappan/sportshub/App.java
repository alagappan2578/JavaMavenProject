package in.alagappan.sportshub;

import in.alagappan.sportshub.service.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import in.alagappan.sportshub.model.*;
public class App {
 public static void main(String[] args) {
	 
	 try {
		 
		UserService userService = new UserService();
		 
//		 	User newUser1 = new User();
//			newUser1.setId(001);
//			newUser1.setFirstName("Alagappan");
//			newUser1.setLastName("Kumaravel");
//			newUser1.setEmail("alagappan@gmail.com");
//			newUser1.setPassword("Aa!a2aa");
//			newUser1.setActive(true);
//			
//			User newUser2 = new User();
//			newUser2.setId(002);
//			newUser2.setFirstName("Alagappan");
//			newUser2.setLastName("Kumaravel");
//			newUser2.setEmail("alagappan12@gmail.com");
//			newUser2.setPassword("Aa!a2aa");
//			newUser2.setActive(true);
//			
//			userService.create(newUser1);
//			userService.create(newUser2);
//		 
//			User updateUser = new User();
//			updateUser.setId(001);
//			updateUser.setFirstName("Alagu");
//			updateUser.setLastName("Kumaravel");
//			updateUser.setEmail("alagappan@gmail.com");
//			updateUser.setPassword("Aa!a2aa");
//			updateUser.setActive(true);
//			
//			userService.update(002,updateUser);
//			
//			userService.delete(001);
//		 
			Set<User> arr = userService.getAll();
			
			List<User> list = new ArrayList<>(arr);
			Collections.sort(list);
			System.out.println(list);
			
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
			
			// adding elements to ArrayList object
	        ArrayList<String> gfg = new ArrayList<>();
	        
	 
	        gfg.add("data structure");
	        gfg.add("competitive programming");
	        gfg.add("Interviews");
	        gfg.add("FANG");
	        gfg.add("FANG");
	 
	        // pass ArrayList object into the HashSet object
	        // constructor
	        HashSet<String> hashSet = new HashSet<>(gfg);
	 
	        // printing every element in Set
	 
	        for (String value : hashSet) {
	            System.out.println(value);
	        }

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
