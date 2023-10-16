package com.app.insurance.controller;

import com.app.insurance.entity.HealthPolicy;
import com.app.insurance.response.ResponseHandler;
import com.app.insurance.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    @PostMapping("/policy/health")
    public ResponseEntity<Object> takeHealthPolicy(@RequestBody HealthPolicy healthPolicy){

        return ResponseHandler.ResponseHandler("Health policy created",
                HttpStatus.OK,
                policyService.takeHealthPolicy(healthPolicy));

    }
    @GetMapping("/policy/{policyId}")
    public ResponseEntity<Object> getPolicy(@PathVariable String policyId){
        return ResponseHandler.ResponseHandler("Health policy details",
                HttpStatus.OK,
                policyService.getPolicy(policyId));
    }
}
