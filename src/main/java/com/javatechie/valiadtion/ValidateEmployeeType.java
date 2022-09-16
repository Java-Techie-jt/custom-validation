package com.javatechie.valiadtion;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeTypeValidator.class)
public @interface ValidateEmployeeType {

    public String message() default "Invalid employeeType: It should be either Permanent Or vendor";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
