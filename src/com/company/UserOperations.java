package com.company;

import java.util.ArrayList;
import java.util.List;

public class UserOperations {
    List<String> users = new ArrayList<>();
    public void register(String username, String password){
        if(!username.isEmpty() && !password.isEmpty() && !users.contains(username)) {
            users.add(username);
        }
        else{
            System.out.println("User already exists");
        }
    }
    public void login(String username, String password){
        if(users.contains(username)){
            System.out.println("Login Successfull");
        }
        else {
            System.out.println("Enter valid credentials");
        }
    }

    //Violating single responsibility
    public  void makePayment(String plan){
        if(plan.equals("premium")){
            System.out.println("Please pay 1000/-");
        }
        else if(plan.equals("standard")){
            System.out.println("Please pay 600/-");
        }
    }

    public void cardPayment(int amount){
        if(amount == 1000){
            System.out.println("Pay 1000 for premium");
        }else if(amount == 600){
            System.out.println("Pay 600 for standard");
        }
    }
    public void netBanking(int amount) {
        if(amount == 1000){
            System.out.println("Pay 1000 for premium");
        }else if(amount == 600){
            System.out.println("Pay 600 for standard");
        }
    }
    public void upiPayment(int amount) {
        if(amount == 1000){
            System.out.println("Pay 1000 for premium");
        }else if(amount == 600){
            System.out.println("Pay 600 for standard");
        }
    }
}
