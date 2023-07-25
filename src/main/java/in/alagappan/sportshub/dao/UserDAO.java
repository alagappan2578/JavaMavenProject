package in.alagappan.sportshub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import in.alagappan.sportshub.Interface.UserInterface;
import in.alagappan.sportshub.model.User;
import in.alagappan.sportshub.util.ConnectionUtil;

public class UserDAO implements UserInterface{

	public Set<User> findAll() throws RuntimeException{
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Set<User> userList= new HashSet<>(); 
		try {
			String query = "SELECT * FROM users where is_active=1";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();// we get object here 
			while(rs.next()) {// here we iterate data and get those data
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setActive(rs.getBoolean("is_active"));
				userList.add(user);// push data in set 
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}finally {
			ConnectionUtil.close(con, ps, rs);
		}
		return userList; 
	}
	
	/**
	 * 
	 * @param newUser
	 */
	@Override
	public void create(User newUser) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			String query = "Insert into users (email, first_name, last_name, password) Values (?,?,?,?)";
			
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, newUser.getEmail());
			ps.setString(2, newUser.getFirstName());
			ps.setString(3, newUser.getLastName());
			ps.setString(4, newUser.getPassword());
			
			ps.executeUpdate();
			System.out.println("User has been successfullly created.");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}finally {
			ConnectionUtil.close(con, ps);
		}
				
	}
	@Override
	public void update(int id,User updateUser) {
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			String query = "UPDATE users SET first_name =?, last_name=? WHERE is_active=1 AND id =?";
			
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, updateUser.getFirstName());
			ps.setString(2, updateUser.getLastName());
			ps.setInt(3, id);
			
			ps.executeUpdate();
			System.out.println("User has been successfullly updated.");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}finally {
			ConnectionUtil.close(con, ps);
		}
			
		
		}
		
		public void delete(int id) {
			
			Set<User> arr = UserList.listOfUser;
			
	        for (User name : arr) {
	        	
	        	User user = name;
						
						if(user.getId() == id) {
							user.setActive(false);
							break;
						}	
					}	
		}
		
		@Override
		public User findById(int id) {
			
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			User newUser = null;
			try {
				String query = "SELECT * FROM users WHERE is_active=1 AND id = ?";
				con = ConnectionUtil.getConnection();
				ps = con.prepareStatement(query);
				ps.setInt(1, id);
				
				rs = ps.executeQuery();// we get object here
				if(rs.next()) {
					newUser = new User();
					newUser.setId(rs.getInt(id));
					newUser.setFirstName(rs.getString("first_name"));
					newUser.setLastName(rs.getString("last_name"));
					newUser.setEmail(rs.getString("email"));
					newUser.setPassword(rs.getString("password"));
					newUser.setActive(rs.getBoolean("is_active"));
				}
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				throw new RuntimeException(e);
			}finally {
				ConnectionUtil.close(con, ps, rs);
			}
			return newUser;
			
			}


		@Override
		public User findByEmailId(String email) {
			
			Set<User> arr = UserList.listOfUser;
			User userMatch = null;				
					for (User name : arr) {  	
		        	User user = name;					
							if(user.getEmail() == email) {
								userMatch = user;
								break;
							}	
						}	
				return userMatch;
		}

		@Override
		public int count() {
			Set<User>  userList = UserList.listOfUser;
			return userList.size();
		}
	
	
}
