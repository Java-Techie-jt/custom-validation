package com.javatechie.valiadtion;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class EmployeeTypeValidator implements ConstraintValidator<ValidateEmployeeType, String> {
    @Override
    public boolean isValid(String employeeType, ConstraintValidatorContext constraintValidatorContext) {
        List<String> employeeTypes = Arrays.asList("Permanent", "vendor");
        return employeeTypes.contains(employeeType);
    }
}
