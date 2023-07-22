package in.alagappan.sportshub.service;

import java.time.format.DateTimeParseException;
import java.util.Set;

import in.alagappan.sportshub.dao.TaskDAO;
import in.alagappan.sportshub.exception.ValidationException;
import in.alagappan.sportshub.model.Task;
import in.alagappan.sportshub.model.TaskEntity;
import in.alagappan.sportshub.model.UserEntity;
import in.alagappan.sportshub.validation.TaskValidator;

public class TaskService {
	
	public Set<TaskEntity> getAll(){
		 TaskDAO taskDAO = new TaskDAO();
		 
		 Set<TaskEntity> taskList = taskDAO.findAll();
		 for (TaskEntity name : taskList) {
	    	 System.out.println(name);		
					}
		 
		 return taskList;
	 }
	 
	 public void create(Task newTask) throws Exception{
		 	try {
				TaskValidator.validate(newTask);
				
			}catch(DateTimeParseException e) {
				throw new ValidationException("Invalid date format (or) Invalid date");
			}catch (ValidationException e) {
				
				throw new ValidationException(e.getMessage());	
			}
		 	
			TaskDAO userDAO = new TaskDAO();
			userDAO.create(newTask);
	 }
	 
	 public void update(int id, Task updateTask){
		 	TaskDAO userDAO = new TaskDAO();
			userDAO.update(id, updateTask);
	}
	 
	 public void delete(int id){
		 	TaskDAO userDAO = new TaskDAO();
			userDAO.delete(id);
	}
	 
	 public TaskEntity findById(int id) {
		 	TaskDAO taskDAO = new TaskDAO();
		 	return taskDAO.findById(id);
		}

}
