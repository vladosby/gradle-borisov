package com.test;

/**
 * Created by vlados on 6/5/2016.
 */
public class HelloMessage {
    public static void main(String[] args) {
        System.out.println(new HelloMessage().getMessage());
    }

    public String getMessage() {
        return "I am project";
    }
}
