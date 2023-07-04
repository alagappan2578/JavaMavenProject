package in.alagappan.sportshub.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import in.alagappan.sportshub.exception.ValidationException;
import in.alagappan.sportshub.model.Task;
import in.alagappan.sportshub.util.StringUtil;

public class TaskValidator {
public static void validate(Task task) throws ValidationException {
		
		if(task == null) {
			throw new ValidationException("Invalid user input");
		}
		
		StringUtil.rejectIfInvalidString(task.getName(), "Name");
		StringUtil.rejectIfInvalidString(task.getDueDate(), "DueDate");
		
		String date = task.getDueDate();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dueDate = LocalDate.parse(date, formatter);
        
        LocalDate currentDate = LocalDate.now();  
        
		if(dueDate.equals(currentDate) || dueDate.isBefore(currentDate)) {
			throw new ValidationException("Due date should be in future");
		}
		}
}
