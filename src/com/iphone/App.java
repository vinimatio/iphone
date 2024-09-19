package com.iphone;

import com.system.Ios;

public class App extends Ios {

    public static void main(String[] args) {
        
        App iphone = new App();

        iphone.selectMusic("Program Boy");

        iphone.callTo("7199999999");

        iphone.cancelCall();
    }

}
