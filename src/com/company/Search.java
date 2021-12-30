package com.company;


//Violating Liskov substitution
public class Search {

    public void typeToSearch(){
        System.out.println("Enter text to search");
    }
    public void speakToSearch(){
        System.out.println("Speak to search");
    }
}
