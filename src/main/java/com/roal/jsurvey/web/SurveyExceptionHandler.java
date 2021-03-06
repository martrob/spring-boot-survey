package com.roal.jsurvey.web;

import com.roal.jsurvey.exception.NonExistingSurveyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SurveyExceptionHandler {

    @ExceptionHandler(NonExistingSurveyException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleNonExistingSurvey() {

    }
}
