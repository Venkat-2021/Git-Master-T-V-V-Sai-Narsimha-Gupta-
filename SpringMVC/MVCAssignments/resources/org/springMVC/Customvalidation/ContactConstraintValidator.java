package org.springMVC.Customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactConstraintValidator implements ConstraintValidator<Contact, String> {

	@Override
	public boolean isValid(String contactField, ConstraintValidatorContext context) {
		return contactField != null && contactField.matches("[0-9]+")
		          && (contactField.length() > 8) && (contactField.length() < 14);
	}


}
