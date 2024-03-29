package yurchenko.service.validator.impl;

import yurchenko.service.validator.AbstractValidator;

public class PhoneValidatorImpl extends AbstractValidator {
    private static final String PHONE_REGEX = "\\+?375\\d{6,11}$";

    @Override
    protected String getRegex() {
        return PHONE_REGEX;
    }
}