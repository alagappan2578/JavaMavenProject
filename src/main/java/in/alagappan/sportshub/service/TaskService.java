package in.alagappan.sportshub.service;

import java.time.format.DateTimeParseException;

import in.alagappan.sportshub.dao.TaskDAO;
import in.alagappan.sportshub.exception.ValidationException;
import in.alagappan.sportshub.model.Task;
import in.alagappan.sportshub.validation.TaskValidator;

public class TaskService {
	
	public Task[] getAll(){
		 TaskDAO taskDAO = new TaskDAO();
		 
		 Task[] taskList = taskDAO.findAll();
		 
		 for(int i=0;i<taskList.length;i++) {
		 System.out.println(taskList[i]);
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
	 
	 public Task findById(int id) {
		 	TaskDAO taskDAO = new TaskDAO();
			Task task = taskDAO.findById(id);
			return task;
		}

}
