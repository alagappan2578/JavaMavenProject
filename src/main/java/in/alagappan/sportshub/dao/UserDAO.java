package in.alagappan.sportshub.dao;

import in.alagappan.sportshub.model.User;

public class UserDAO {

	public User [] findAll() {
		
		User[] userList = UserList.listOfUser;
		return userList; 
	}
	
	/**
	 * 
	 * @param newUser
	 */
	public void create(User newUser) {
		
		User[] arr = UserList.listOfUser;
		
		for(int i=0;i<arr.length;i++) {
			
			User user = arr[i];
			
			if(user == null) {
				arr[i] = newUser;
				break;
			}	
		}	
	}
		public void update(int id,User updateUser) {
				
				User[] arr = UserList.listOfUser;
				
				for(int i=0;i<arr.length;i++) {
					
					User user = arr[i];
					
					if(user == null) {
						continue;
					}
					
					if(user.getId() == id) {
						arr[i].setFirstName(updateUser.getFirstName());
						arr[i].setLastName(updateUser.getLastName());
						arr[i].setPassword(updateUser.getPassword());
						break;
					}	
				}	
			}
		
		public void delete(int id) {
			
			User[] arr = UserList.listOfUser;
			
			for(int i=0;i<arr.length;i++) {
				
				User user = arr[i];
				
				if(user == null) {
					continue;
				}
				
				if(user.getId() == id) {
					arr[i].setActive(false);
					break;
				}	
			}	
		}
		
		public User findById(int id) {
					
					User[] arr = UserList.listOfUser;
					User userMatch = null;
					
					for(int i=0;i<arr.length;i++) {
						
						User user = arr[i];
						
						if(user == null) {
							continue;
						}
						
						if(user.getId() == id) {
							arr[i].setActive(false);
							userMatch = user;
							break;
						}	
					}	
				return userMatch;
				}
	
	
}
