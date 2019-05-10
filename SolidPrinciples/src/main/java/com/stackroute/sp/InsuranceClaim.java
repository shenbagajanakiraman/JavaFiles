package com.stackroute.sp;

class Customer {
    private String name;
    private int age;
    private String customerID;
    private long mobileNumber;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public Customer(String name, int age, String customerID, long mobileNumber) {
        this.name = name;
        this.age = age;
        this.customerID = customerID;
        this.mobileNumber = mobileNumber;
    }
}

class HealthValidator extends Customer{

    public HealthValidator(String name, int age, String customerID, long mobileNumber) {
        super(name, age, customerID, mobileNumber);
    }

     String validateHealth(ClaimManager customer1){

         if(customer1.isStatus()) {
             return "claiming valid";

         }
         else
             return "claiming invalid";
    }
}

class ClaimManager extends HealthValidator {

    public ClaimManager(String name, int age, String customerID, long mobileNumber) {
        super(name, age, customerID, mobileNumber);
    }


    void validateClaim(ClaimManager customer1) {

        String validateStatus = validateHealth(customer1);
        System.out.println("Health Status...." + validateStatus);
        if (validateStatus.equals("claiming valid"))
            System.out.println("Approves the Claim");
        else
            System.out.println("Rejects the Claim");
    }
}

public class InsuranceClaim {
    public static void main(String[] args) {

        ClaimManager customer1 = new ClaimManager("Khuchbu",23,"123",9776656456L);

            customer1.setStatus(true);
        customer1.validateClaim(customer1);


        customer1.setStatus(false);
        customer1.validateClaim(customer1);

    }

}

