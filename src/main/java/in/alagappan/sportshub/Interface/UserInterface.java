package in.alagappan.sportshub.Interface;

import in.alagappan.sportshub.model.UserEntity;

public interface UserInterface extends Base<UserEntity> {
	public abstract UserEntity findByEmailId(String email);
	public abstract int count();
}
