package com.stackroute.sp.insurance;



public class HealthInsuranceSurveyor {

        String validateHealth(Customer customer){

        if(customer.isStatus()) {
            return "claiming valid";

        }
        else
            return "claiming invalid";
    }

}
