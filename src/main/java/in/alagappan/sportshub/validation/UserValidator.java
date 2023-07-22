package in.alagappan.sportshub.validation;

import in.alagappan.sportshub.exception.ValidationException;
import in.alagappan.sportshub.model.User;
import in.alagappan.sportshub.model.UserEntity;
import in.alagappan.sportshub.util.StringUtil;

public class UserValidator {

	public static void validate(UserEntity user) throws ValidationException {
		
		if(user == null) {
			throw new ValidationException("Invalid task input");
		}
		
		StringUtil.rejectIfInvalidString(user.getEmail(), "Email");
		StringUtil.rejectIfInvalidString(user.getPassword(), "Password");
		StringUtil.rejectIfInvalidString(user.getFirstName(), "FirstName");
	
	}
	
}
