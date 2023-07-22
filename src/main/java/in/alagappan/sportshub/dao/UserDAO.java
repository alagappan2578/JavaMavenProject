package in.alagappan.sportshub.dao;

import java.util.Set;

import in.alagappan.sportshub.Interface.UserInterface;
import in.alagappan.sportshub.model.UserEntity;

public class UserDAO implements UserInterface{

	public Set<UserEntity> findAll() {
		
		Set<UserEntity>  userList = UserList.listOfUser;
		return userList; 
	}
	
	/**
	 * 
	 * @param newUser
	 */
	@Override
	public void create(UserEntity newUser) {
		
		Set<UserEntity> arr = UserList.listOfUser;
		
		arr.add(newUser);
			
	}
	@Override
	public void update(int id,UserEntity updateUser) {
			
		Set<UserEntity> arr = UserList.listOfUser;
			
        for (UserEntity name : arr) {
        	
        	UserEntity user = name;
					
					if(user.getId() == id) {
						user.setFirstName(updateUser.getFirstName());
						user.setLastName(updateUser.getLastName());
						user.setPassword(updateUser.getPassword());
						break;
					}	
				}	
			}
		
		public void delete(int id) {
			
			Set<UserEntity> arr = UserList.listOfUser;
			
	        for (UserEntity name : arr) {
	        	
	        	UserEntity user = name;
						
						if(user.getId() == id) {
							user.setActive(false);
							break;
						}	
					}	
		}
		
		@Override
		public UserEntity findById(int id) {
					
			Set<UserEntity> arr = UserList.listOfUser;
			UserEntity userMatch = null;				
					for (UserEntity name : arr) {
		        	
		        	UserEntity user = name;
							
							if(user.getId() == id) {
								userMatch = user;
								break;
							}	
						}	
				return userMatch;
				}


		@Override
		public UserEntity findByEmailId(String email) {
			
			Set<UserEntity> arr = UserList.listOfUser;
			UserEntity userMatch = null;				
					for (UserEntity name : arr) {  	
		        	UserEntity user = name;					
							if(user.getEmail() == email) {
								userMatch = user;
								break;
							}	
						}	
				return userMatch;
		}

		@Override
		public int count() {
			Set<UserEntity>  userList = UserList.listOfUser;
			return userList.size();
		}
	
	
}
