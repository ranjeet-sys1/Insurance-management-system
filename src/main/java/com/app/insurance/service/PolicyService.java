package com.app.insurance.service;

import com.app.insurance.entity.HealthPolicy;

public interface PolicyService {
    HealthPolicy takeHealthPolicy(HealthPolicy healthPolicy);
    HealthPolicy getPolicy(String policyId);
}
