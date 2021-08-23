package com.simple.rest.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Base64Validator  implements ConstraintValidator<Base64, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return org.apache.tomcat.util.codec.binary.Base64.isBase64(value);
    }

}
