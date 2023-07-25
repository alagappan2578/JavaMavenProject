package in.alagappan.sportshub.Interface;

import in.alagappan.sportshub.model.User;

public interface UserInterface extends Base<User> {
	public abstract User findByEmailId(String email);
	public abstract int count();
}
