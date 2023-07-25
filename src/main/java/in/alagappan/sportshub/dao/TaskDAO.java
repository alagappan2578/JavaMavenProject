package in.alagappan.sportshub.dao;

import java.util.Set;

import in.alagappan.sportshub.Interface.TaskInterface;
import in.alagappan.sportshub.model.Task;

public class TaskDAO implements TaskInterface {

	public Set<Task> findAll() {
		
		return TaskList.listOfTask; 
	}
	@Override
	public void create(Task newTask) {

		Set<Task> arr = TaskList.listOfTask;
		
		arr.add(newTask);
	}
	
	@Override
	public void update(int id, Task updateTask) {

		Set<Task> arr = TaskList.listOfTask;
		
        for (Task name : arr) {
        	
        	Task task = name;
				

			if (task.getId() == id) {
				task.setName(updateTask.getName());
				task.setDueDate(updateTask.getDueDate());
				break;
			}
		}
	}

	public void delete(int id) {

		Set<Task> arr = TaskList.listOfTask;
		
        for (Task name : arr) {
        	
        	Task task = name;
				

			if (task.getId() == id) {
				task.setActive(false);
				break;
			}
		}
	}

	public Task findById(int id) {

		Set<Task> arr = TaskList.listOfTask;
		Task userMatch = null;				
				for (Task name : arr) {
	        	
	        	Task task = name;
						
						if(task.getId() == id) {
							userMatch = task;
							break;
						}	
					}	
			return userMatch;
	}


}
