package com.app.insurance.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

public class ResponseHandler {
    public static  ResponseEntity<Object> ResponseHandler(String message, HttpStatus httpStatus, Object dbResponse){
        HashMap<String,Object> response=new HashMap<>();
        response.put("message",message);
        response.put("httpStatus",httpStatus);
        response.put("data",dbResponse);
        return new ResponseEntity<Object>(response,HttpStatus.OK);
    }
}
