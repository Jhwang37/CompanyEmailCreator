package com.CreateFile;

import java.util.Scanner;


public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private final int mailboxCapacity = 500;
    private int passwordLength = 10;
    private final String companySuffix = "company.com";

    //Create constructor
    public Email(){
        Scanner scan = new Scanner(System.in);
        System.out.println("First name: ");
        this.firstName = scan.nextLine();
        System.out.println("Last name: ");
        this.lastName = scan.nextLine();
        System.out.println("Enter department ID");
        this.department = setDepartment();
        System.out.println(this.email = firstName + "." + lastName + "@" + department + "" + companySuffix);
        this.password = setPassword(passwordLength);
        System.out.println("Email Password: " + password);
        System.out.println(showInfo());
    }
    //create department ID
    public String setDepartment(){
        System.out.println("Department: ");
        System.out.println("Sales = 1\nAccounting = 2\nDevelopment = 3\nNone = 0");
        Scanner scan = new Scanner(System.in);
        int chooseDepartment = scan.nextInt();
        if(chooseDepartment == 1){ return "Sales"; }
        else if(chooseDepartment == 2){return "Accounting"; }
        else if(chooseDepartment == 3){return "Development"; }
        else{return ""; }
    }
    //create password
    public String setPassword(int length){
        String emailGen = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random() * emailGen.length());
                password[i] = emailGen.charAt(rand);
        }
        return new String(password);
    }
    public String showInfo(){
        return  "Final Email Information\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Email: " + email + "\n" + "Password: " + password + "\n" +
                "Mailbox Capacity: " + mailboxCapacity + "MB";
    }
}
