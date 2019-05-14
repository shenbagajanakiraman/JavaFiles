package com.stackroute.sp.insurance;

import com.stackroute.sp.insurance.Customer;

public class CarInsuranceSurveyor {

    String validate(Customer customer){

        if(customer.isStatus()) {
            return "claiming valid";

        }
        else
            return "claiming invalid";
    }
}
