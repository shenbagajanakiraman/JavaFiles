package com.stackroute.sp.insurance;

public class MainInsurance {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Khushbu", 23, "123", 9776656456L);
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimManager claimManager = new ClaimManager(healthInsuranceSurveyor);

        customer1.setStatus(true);
        healthInsuranceSurveyor.validateHealth(customer1);
        claimManager.validateClaim(customer1);


        customer1.setStatus(false);
        healthInsuranceSurveyor.validateHealth(customer1);
        claimManager.validateClaim(customer1);


        CarInsuranceSurveyor carInsuranceSurveyor = new CarInsuranceSurveyor();


    }
}
