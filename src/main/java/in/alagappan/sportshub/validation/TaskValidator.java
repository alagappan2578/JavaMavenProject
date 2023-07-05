package in.alagappan.sportshub.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import in.alagappan.sportshub.exception.ValidationException;
import in.alagappan.sportshub.model.Task;
import in.alagappan.sportshub.util.StringUtil;

public class TaskValidator {
public static void validate(Task task) throws ValidationException {
		
		if(task == null) {
			throw new ValidationException("Invalid task input");
		}
		
		StringUtil.rejectIfInvalidString(task.getName(), "Name");
		StringUtil.rejectIfInvalidString(task.getDueDate(), "DueDate");
		
		String date = task.getDueDate();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dueDate = LocalDate.parse(date, formatter);
        
        LocalDate.parse(date,
                DateTimeFormatter.ofPattern("d/M/uuuu").withResolverStyle(ResolverStyle.STRICT)
        );
        
        LocalDate currentDate = LocalDate.now();  
        
		if(dueDate.equals(currentDate) || dueDate.isBefore(currentDate)) {
			throw new ValidationException("Due date should be in future");
		}
		}
}
