package in.alagappan.sportshub.validation;

import in.alagappan.sportshub.exception.ValidationException;
import in.alagappan.sportshub.model.User;
import in.alagappan.sportshub.util.StringUtil;

public class UserValidator {

	public static void validate(User user) throws ValidationException {
		
		if(user == null) {
			throw new ValidationException("Invalid task input");
		}
		
		StringUtil.rejectIfInvalidString(user.getEmail(), "Email");
		StringUtil.rejectIfInvalidString(user.getPassword(), "Password");
		StringUtil.rejectIfInvalidString(user.getFirstName(), "FirstName");
//		if(user.getEmail() == null || "".equals(user.getEmail().trim())) {
//			throw new ValidationException("Email can't be null or empty");
//		}
//		if(user.getPassword() == null || "".equals(user.getPassword().trim())) {
//			throw new ValidationException("Password can't be null or empty");
//		}
//		if(user.getFirstName() == null || "".equals(user.getFirstName().trim())) {
//			throw new ValidationException("Firstname can't be null or empty");
//		}
	
	}
	
}
