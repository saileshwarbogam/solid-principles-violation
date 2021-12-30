package com.company;

//Violating open-closed
public class Payment {
    public void cardPayment(){
        System.out.println("Pay through card");
    }
    public void upiPayment(){
        System.out.println("Pay through UPI");
    }
    public void netBanking(){
        System.out.println("Pay through Net Banking");
    }
}
