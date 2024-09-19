package com.system;

import com.interfaces.*;

public class Ios extends Phone implements Ipod, InternetBrowser {

    public void pause() {
        System.out.println("music paused");
    }

    public void play() {
        System.out.println("playing music");

    }

    public void selectMusic(String music) {
        System.out.println("Playng: " + music);
    }

    public void callTo(String number) {
        System.out.println("Calling to: " + number);
    }

    public void acceptCall() {
        System.out.println("call accepted");
    }

    public void startVoiceMail() {
        System.out.println("Listening Voice Mail");
    }

    public void openPage(String url) {
        System.out.println("Opening page:" + url);
    }

    public void newTab() {
        System.out.println("Opening new tab");
    }

    public void refreshPage() {
        System.out.println("refreshing page");
    }

}
