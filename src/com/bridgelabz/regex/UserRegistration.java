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
            System.out.println("valid First Name");
        else
            System.out.println("Invalid First Name");
//        UC2 Last Name
        Pattern pattern2 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher2 = pattern2.matcher("Adam");
        if (matcher2.matches())
            System.out.println("valid Last Name");
        else
            System.out.println("Invalid Last Name");
//        UC3 Email
        Pattern pattern3 = Pattern.compile("^[a-z]{3}[.][a-z]*@[a-z]{2}[.][a-z]{2}[.][a-z]*$");
        Matcher matcher3 = pattern3.matcher("abc.xyz@bl.co.in");
        if (matcher3.matches())
            System.out.println("valid email");
        else
            System.out.println("Invalid email");
//        UC4 Phone Number
        Pattern pattern4 = Pattern.compile("^(\\+?\\d{1,3})\\s\\d{10}$");
        Matcher matcher4 = pattern4.matcher("+91 8983930906");
        if (matcher4.matches())
            System.out.println("valid Phone Number");
        else
            System.out.println("Invalid Phone Number");
//        UC5
//        Rule1: minimum 8 characters
        Pattern pattern5 = Pattern.compile("^[A-za-z]{8,}$");
        Matcher matcher5 = pattern5.matcher("setMyPassword");
        if (matcher5.matches())
            System.out.println("valid Password Rule1");
        else
            System.out.println("Invalid Password Rule1");
//        UC6
//        Rule2: minimum 8 characters with atleast one upper case letter
        Pattern pattern6 = Pattern.compile("^(?=.*[a-z]*[A-Z]).{8,}$");
        Matcher matcher6 = pattern6.matcher("Mypassword");
        if (matcher6.matches())
            System.out.println("valid Password Rule2");
        else
            System.out.println("Invalid Password Rule2");
    }
}


