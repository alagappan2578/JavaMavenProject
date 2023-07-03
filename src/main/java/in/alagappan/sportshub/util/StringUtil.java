package in.alagappan.sportshub.util;

import in.alagappan.sportshub.exception.ValidationException;

public class StringUtil {
	public static void rejectIfInvalidString(String input, String inputName) throws ValidationException {
		if(input == null || "".equals(input.trim())) {
			throw new ValidationException(inputName.concat(" can't be null or empty"));
		}
	}
	
	public static boolean isValidString(String input){
		if(input == null || "".equals(input.trim())) {
			return true;
		}
			return false;
		
	}
	
	public static boolean isInValidString(String input){
		if(input == null || "".equals(input.trim())) {
			return false;
		}
			return true;
		
	}
}
