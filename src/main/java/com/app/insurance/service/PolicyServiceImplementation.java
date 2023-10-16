package com.app.insurance.service;

import com.app.insurance.entity.HealthPolicy;
import com.app.insurance.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolicyServiceImplementation implements PolicyService{
    @Autowired
    private PolicyRepository policyRepository;
    @Override
    public HealthPolicy takeHealthPolicy(HealthPolicy healthPolicy) {
        return policyRepository.save(healthPolicy);
    }

    @Override
    public HealthPolicy getPolicy(String policyId) {
        Optional<HealthPolicy> byId = policyRepository.findById(policyId);
        HealthPolicy policy =new HealthPolicy();
        if(byId.isPresent()){
            policy=byId.get();
        }

        return policy;
    }
}
