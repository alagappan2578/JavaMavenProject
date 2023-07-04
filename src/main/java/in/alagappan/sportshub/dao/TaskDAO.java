package in.alagappan.sportshub.dao;

import in.alagappan.sportshub.model.Task;

public class TaskDAO {

	public Task[] findAll() {

		Task[] userList = TaskList.listOfUser;
		return userList;
	}

	public void create(Task newTask) {

		Task[] arr = TaskList.listOfUser;

		for (int i = 0; i < arr.length; i++) {

			Task task = arr[i];

			if (task == null) {
				arr[i] = newTask;
				break;
			}
		}
	}

	public void update(int id, Task updateTask) {

		Task[] arr = TaskList.listOfUser;

		for (int i = 0; i < arr.length; i++) {

			Task task = arr[i];

			if (task == null) {
				continue;
			}

			if (task.getId() == id) {
				arr[i].setName(updateTask.getName());
				arr[i].setDueDate(updateTask.getDueDate());
				break;
			}
		}
	}

	public void delete(int id) {

		Task[] arr = TaskList.listOfUser;

		for (int i = 0; i < arr.length; i++) {

			Task user = arr[i];

			if (user == null) {
				continue;
			}

			if (user.getId() == id) {
				arr[i].setActive(false);
				break;
			}
		}
	}

	public Task findById(int id) {

		Task[] arr = TaskList.listOfUser;
		Task userMatch = null;

		for (int i = 0; i < arr.length; i++) {

			Task task = arr[i];

			if (task == null) {
				continue;
			}

			if (task.getId() == id) {
				arr[i].setActive(false);
				userMatch = task;
				break;
			}
		}
		return userMatch;
	}
}
