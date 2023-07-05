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
		newTask1.setDueDate("22/07/2023");
		newTask1.setActive(true);
		assertDoesNotThrow(()->{
			userService.create(newTask1);
		});
			
	}
	
	@Test
	public void testCreateTestWithInvalidInput() {
		TaskService testService = new TaskService();
		Exception exception = assertThrows(ValidationException.class, ()->{
			testService.create(null);
		});
		String exceptedMessage = "Invalid task input";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserNameWithNull() {
		TaskService taskService = new TaskService();
		 
	 	Task newTask1 = new Task();
		newTask1.setId(001);
		newTask1.setName(null);
		newTask1.setDueDate("22/07/2023");
		newTask1.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class, ()->{
			taskService.create(newTask1);
		});
		String exceptedMessage = "Name can't be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserNameWithEmpty() {
		TaskService taskService = new TaskService();
		 
	 	Task newTask1 = new Task();
		newTask1.setId(001);
		newTask1.setName(" ");
		newTask1.setDueDate("22/07/2023");
		newTask1.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class, ()->{
			taskService.create(newTask1);
		});
		String exceptedMessage = "Name can't be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserDueDateWithNull() {
		TaskService taskService = new TaskService();
		 
	 	Task newTask1 = new Task();
		newTask1.setId(001);
		newTask1.setName("swim");
		newTask1.setDueDate(null);
		newTask1.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class, ()->{
			taskService.create(newTask1);
		});
		String exceptedMessage = "DueDate can't be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserDueDateWithEmpty() {
		TaskService taskService = new TaskService();
		 
	 	Task newTask1 = new Task();
		newTask1.setId(001);
		newTask1.setName("swim");
		newTask1.setDueDate(" ");
		newTask1.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class, ()->{
			taskService.create(newTask1);
		});
		String exceptedMessage = "DueDate can't be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserDueDateWithPastDate() {
		TaskService taskService = new TaskService();
		 
	 	Task newTask1 = new Task();
		newTask1.setId(001);
		newTask1.setName("swim");
		newTask1.setDueDate("03/07/2023");
		newTask1.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class, ()->{
			taskService.create(newTask1);
		});
		String exceptedMessage = "Due date should be in future";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserDueDateWithInvaildFormat() {
		TaskService taskService = new TaskService();
		 
	 	Task newTask1 = new Task();
		newTask1.setId(001);
		newTask1.setName("swim");
		newTask1.setDueDate("3/07/2023");
		newTask1.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class, ()->{
			taskService.create(newTask1);
		});
		String exceptedMessage = "Invalid date format (or) Invalid date";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testUserDueDateWithInvalidDate() {
		TaskService taskService = new TaskService();
		 
	 	Task newTask1 = new Task();
		newTask1.setId(001);
		newTask1.setName("swim");
		newTask1.setDueDate("30/02/2023");
		newTask1.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class, ()->{
			taskService.create(newTask1);
		});
		String exceptedMessage = "Invalid date format (or) Invalid date";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}

}
