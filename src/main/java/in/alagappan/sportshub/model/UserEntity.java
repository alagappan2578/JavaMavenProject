package in.alagappan.sportshub.model;

public abstract class UserEntity implements Comparable<User>{
	int id ;
	String lastName;
	String email;
	String Password;
	boolean isActive = true;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	String firstName;
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", Password=" + Password + ", isActive=" + isActive + "]";
	}
	
	public String fullName() {
		return firstName.concat(" ").concat(lastName);
	}
	
	@Override
	public int compareTo(User o) {

		if (this.getId() == o.getId()) {
			return 0;
		} else {
			if (this.getId() > o.getId()) {
				return 1;
			} else {
				return -1;
			}
			// return ( this.getId() > o.getId()) ? 1: -1;
		}
	}
}
