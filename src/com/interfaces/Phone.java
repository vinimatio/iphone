package com.interfaces;

public abstract class Phone {

    protected void callTo(String number){
        
    };

    protected void acceptCall(){

    };

    protected void startVoiceMail(){

    };

    protected void cancelCall(){
        System.out.println("rejected");
    }
}
