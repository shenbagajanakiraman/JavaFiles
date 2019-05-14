package com.stackroute.sp.insurance;

import com.stackroute.sp.insurance.Customer;
import com.stackroute.sp.insurance.HealthInsuranceSurveyor;

public class ClaimManager {

    private HealthInsuranceSurveyor healthInsuranceSurveyor;

    public ClaimManager(HealthInsuranceSurveyor healthInsuranceSurveyor) {
        this.healthInsuranceSurveyor = healthInsuranceSurveyor;
    }

    String validateClaim(Customer customer1) {

        String validateStatus = healthInsuranceSurveyor.validateHealth(customer1);

        System.out.println("Health Status...." + validateStatus);
        String str;

        if (validateStatus.equals("claiming valid")) {
            str = "Approves the Claim";
            System.out.println(str);
        }
        else {
            str = "Rejects the Claim";
            System.out.println(str);
        }

        return str;
    }
}