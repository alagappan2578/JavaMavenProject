package in.alagappan.sportshub;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import in.alagappan.sportshub.model.User;
import in.alagappan.sportshub.service.UserService;

public class TestCreateUser {
	
	@Test
	public void testCreateUserWithValidationInput() {
		UserService userService = new UserService();
		 
	 	User newUser1 = new User();
		newUser1.setId(001);
		newUser1.setFirstName("Alagappan");
		newUser1.setLastName("Kumaravel");
		newUser1.setEmail("alagappan@gmail.com");
		newUser1.setPassword("Aa!a2aa");
		newUser1.setActive(true);
		assertDoesNotThrow(()->{
			userService.create(newUser1);
		});
			
	}
	
	@Test
	public void testCreateUserWithInvalidInput() {
		UserService userService = new UserService();
		Exception exception = assertThrows(Exception.class, ()->{
			userService.create(null);
		});
		String exceptedMessage = "Invalid user input";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserEmailWithNull() {
		UserService userService = new UserService();
		 
	 	User newUser1 = new User();
		newUser1.setId(001);
		newUser1.setFirstName("Alagappan");
		newUser1.setLastName("Kumaravel");
		newUser1.setEmail(null);
		newUser1.setPassword("Aa!a2aa");
		newUser1.setActive(true);
		
		Exception exception = assertThrows(Exception.class, ()->{
			userService.create(newUser1);
		});
		String exceptedMessage = "Email can't be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserEmailWithEmpty() {
		UserService userService = new UserService();
		 
	 	User newUser1 = new User();
		newUser1.setId(001);
		newUser1.setFirstName("Alagappan");
		newUser1.setLastName("Kumaravel");
		newUser1.setEmail(" ");
		newUser1.setPassword("Aa!a2aa");
		newUser1.setActive(true);
		
		Exception exception = assertThrows(Exception.class, ()->{
			userService.create(newUser1);
		});
		String exceptedMessage = "Email can't be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
}
