package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("!!!!!!USER REGISTRATION!!!!!!!");
//        UC1 First Name
        Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher1 = pattern1.matcher("Prathamesh");
        if (matcher1.matches())
            System.out.println("valid");
        else
            System.out.println("Invalid");
//        UC2 Last Name
        Pattern pattern2 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher2 = pattern2.matcher("Adam");
        if (matcher2.matches())
            System.out.println("valid");
        else
            System.out.println("Invalid");
    }
}
