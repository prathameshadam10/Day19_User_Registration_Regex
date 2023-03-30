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
//        UC7
//        Rule3: minimum 8 characters with atleast one upper case letter with atlest one numerical number
        Pattern pattern7 = Pattern.compile("^(?=.*[a-z]*[A-Z])(?=.*[0-9]).{8,}$");
        Matcher matcher7 = pattern7.matcher("MyPassword1");
        if (matcher7.matches())
            System.out.println("valid Password Rule3");
        else
            System.out.println("Invalid Password Rule3");
//        UC8
//        Rule3: minimum 8 characters with atleast one upper case letter with atlest one numerical number
//        and one special character
        Pattern pattern8 = Pattern.compile("^(?=.*[a-z]*[A-Z])(?=.*[0-9])(?=.*[\\W_]).{8,}$");
        Matcher matcher8 = pattern8.matcher("MyPassword@1");
        if (matcher8.matches())
            System.out.println("valid Password Rule4");
        else
            System.out.println("Invalid Password Rule4");
        //uc9
        //  1. abc@yahoo.com,
        //• 2. abc-100@yahoo.com,
        //• 3. abc.100@yahoo.com
        //• 2. abc111@abc.com,
        //• 4. abc-100@abc.net,
        //• 5. abc.100@abc.com.au
        //• 6. abc@1.com,
        //• 7. abc@gmail.com.com
        //• 8. abc+100@gmail.com
        String text = "Here are some sample email addresses:"+
                "        //  1. abc@yahoo.com,\n" +
                "        //• 2. abc-100@yahoo.com,\n" +
                "        //• 3. abc.100@yahoo.com\n" +
                "        //• 4. abc111@abc.com,\n" +
                "        //• 5. abc-100@abc.net,\n" +
                "        //• 6. abc.100@abc.com.au\n" +
                "        //• 7. abc@1.com,\n" +
                "        //• 8. abc@gmail.com.com\n" +
                "        //• 9. abc+100@gmail.com";
//        Regular Expression to match email address
        String emailPatterns = "[A-Za-z0-9.+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
//        Create a Pattern object from the regular expression
        Pattern pattern9 = Pattern.compile(emailPatterns);
//        Use a Matcher object to find all occurrences of the pattern in the text
        Matcher matcher9 = pattern9.matcher(text);
//        Iterate over the matches and print each email address
        System.out.println("Valid email are.....");
        while (matcher9.find()){
            String email = matcher9.group();
            System.out.println(email);
        }
    }
}


