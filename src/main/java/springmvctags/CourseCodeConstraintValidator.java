package springmvctags;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import customannotations.CourseCode;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result=true;
		if(theCode!=null) {
			result = theCode.startsWith(coursePrefix);
			
		}else {
			result=true;
		}
		
		// TODO Auto-generated method stub
		return result;
	}

}
