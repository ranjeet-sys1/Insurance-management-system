package com.app.insurance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
//@Table(name="healthPolicy")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class HealthPolicy extends Policy {
    @Id
    private String policyId= UUID.randomUUID().toString();
    private String policyName;
    private String companyName;
    private PolicyType policyType;
    private Double policyTotalCost;
    private Double costPerMonth;
    private Integer duration;
    private Integer personCount;


}
