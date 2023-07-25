package in.alagappan.sportshub;

import java.util.Set;

import org.junit.jupiter.api.Test;

import in.alagappan.sportshub.model.User;
import in.alagappan.sportshub.service.UserService;

public class TestCreateAllUser {
	
	@Test
	public void getAllUser() {
		UserService userService = new UserService();
		
		Set<User> aaa = userService.getAll();
		System.out.println(aaa);
	}
	
	@Test
	public void getFindAll() {
		UserService userService = new UserService();
		
		User aaa = userService.findById(1);
		System.out.println(aaa);
	}
	
	@Test
	public void createUser() throws Exception {
		UserService userService = new UserService();
		
		User newUser1 = new User();
		newUser1.setFirstName("Alagappan");
		newUser1.setLastName("Kumaravel");
		newUser1.setEmail("alagappan@gmail.com");
		newUser1.setPassword("Aa!a2aa");
		userService.create(newUser1);
	}
	
	@Test
	public void updateUser() throws Exception {
		UserService userService = new UserService();
		
		User newUser1 = new User();
		newUser1.setFirstName("Alen");
		newUser1.setLastName("k");
		newUser1.setPassword("Aa!a2aa");
		userService.update(1,newUser1);
	}

}
