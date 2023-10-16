package com.app.insurance.repository;

import com.app.insurance.entity.HealthPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<HealthPolicy,String> {
}
