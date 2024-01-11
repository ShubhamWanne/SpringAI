package com.self.SpringAI.exception.handler;

import com.theokanning.openai.OpenAiHttpException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class OpenAIExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(OpenAiHttpException.class)
    ProblemDetail handleOpenAiHttpException(OpenAiHttpException ex){
        HttpStatus status = HttpStatus.resolve(ex.statusCode);
        return ProblemDetail.forStatusAndDetail(status, ex.getMessage());
    }
}
