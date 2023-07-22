package in.alagappan.sportshub.dao;

import java.util.Set;

import in.alagappan.sportshub.Interface.TaskInterface;
import in.alagappan.sportshub.model.TaskEntity;

public class TaskDAO implements TaskInterface {

	public Set<TaskEntity> findAll() {
		
		return TaskList.listOfTask; 
	}
	@Override
	public void create(TaskEntity newTask) {

		Set<TaskEntity> arr = TaskList.listOfTask;
		
		arr.add(newTask);
	}
	
	@Override
	public void update(int id, TaskEntity updateTask) {

		Set<TaskEntity> arr = TaskList.listOfTask;
		
        for (TaskEntity name : arr) {
        	
        	TaskEntity task = name;
				

			if (task.getId() == id) {
				task.setName(updateTask.getName());
				task.setDueDate(updateTask.getDueDate());
				break;
			}
		}
	}

	public void delete(int id) {

		Set<TaskEntity> arr = TaskList.listOfTask;
		
        for (TaskEntity name : arr) {
        	
        	TaskEntity task = name;
				

			if (task.getId() == id) {
				task.setActive(false);
				break;
			}
		}
	}

	public TaskEntity findById(int id) {

		Set<TaskEntity> arr = TaskList.listOfTask;
		TaskEntity userMatch = null;				
				for (TaskEntity name : arr) {
	        	
	        	TaskEntity task = name;
						
						if(task.getId() == id) {
							userMatch = task;
							break;
						}	
					}	
			return userMatch;
	}


}
