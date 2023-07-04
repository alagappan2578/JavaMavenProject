package in.alagappan.sportshub;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.alagappan.sportshub.exception.ValidationException;
import in.alagappan.sportshub.model.Task;
import in.alagappan.sportshub.service.TaskService;
public class TestCreateTask {

	@Test
	public void testCreateTaskWithValidationInput() {
		TaskService userService = new TaskService();
		 
	 	Task newTask1 = new Task();
		newTask1.setId(001);
		newTask1.setName("Run");
		newTask1.setDueDate("22-07-2023");
		newTask1.setActive(true);
		assertDoesNotThrow(()->{
			userService.create(newTask1);
		});
			
	}
	
//	@Test
//	public void testCreateTestWithInvalidInput() {
//		TaskService userService = new TaskService();
//		Exception exception = assertThrows(ValidationException.class, ()->{
//			userService.create(null);
//		});
//		String exceptedMessage = "Invalid user input";
//		String actualMessage = exception.getMessage();
//		assertTrue(exceptedMessage.equals(actualMessage));
//	}
//	
//	@Test
//	public void testUserEmailWithNull() {
//		TaskService userService = new TaskService();
//		 
//	 	Task newUser1 = new Task();
//		newUser1.setId(001);
//		newUser1.setActive(true);
//		
//		Exception exception = assertThrows(ValidationException.class, ()->{
//			userService.create(newUser1);
//		});
//		String exceptedMessage = "Email can't be null or empty";
//		String actualMessage = exception.getMessage();
//		assertTrue(exceptedMessage.equals(actualMessage));
//	}
//	
//	@Test
//	public void testUserEmailWithEmpty() {
//		TaskService userService = new TaskService();
//		 
//	 	Task newUser1 = new Task();
//		newUser1.setId(001);
//		newUser1.setActive(true);
//		
//		Exception exception = assertThrows(ValidationException.class, ()->{
//			userService.create(newUser1);
//		});
//		String exceptedMessage = "Email can't be null or empty";
//		String actualMessage = exception.getMessage();
//		assertTrue(exceptedMessage.equals(actualMessage));
//	}
//	
	

}
