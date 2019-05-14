package com.stackroute.sp.insurance;

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





