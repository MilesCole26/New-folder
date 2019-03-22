package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> userNameList = new ArrayList<>(); //creates a list for usernames
        ArrayList<String> passwordList = new ArrayList<>(); //creates a list for passwords
            while (true) {
                System.out.println("Would you like to (Create) an account or (Login) into an old one?"); //asks user if they would like to create a new account or login into one
                String userInput = console.nextLine();
                if (userInput.equalsIgnoreCase("Create")||userInput.equalsIgnoreCase("Create account")||userInput.equalsIgnoreCase("Create an account")) {
                    System.out.println("Enter username: ");//asks the user to enter a new username
                    String username = console.nextLine();
                    System.out.println("Enter password: ");//asks the user to enter a password
                    String password = console.nextLine();
                    for (int i = userNameList.size() - 1; i >= 0; i--) { //Checks the list to see if the username the user entered already exists
                        if (userNameList.get(i).equals(username) && userNameList.size() > 0) {
                            System.out.println("Username exists please try again");
                            break;
                        } else { //The username hasn't been used so a new account is created
                            userNameList.add(username); //adds the username to the list
                            passwordList.add(password); //adds the password to the list
                            System.out.println("Account created!");
                        }
                    }
                    if(userNameList.size() == 0){ // This is the first account being created
                        userNameList.add(username); //adds the username to the list
                        passwordList.add(password); //adds the password to the list
                        System.out.println("Account created!");
                    }
                } else if (userInput.equalsIgnoreCase("Login")) {
                    System.out.println("Enter username: "); //asks the user to enter a new username
                    String username = console.nextLine();
                    System.out.println("Enter password: "); //asks the user to enter a password
                    String password = console.nextLine();
                    for (int i = userNameList.size() - 1; i >= 0; i--) { //Checks the list to see if the login credentials exist
                        if (userNameList.get(i).equalsIgnoreCase(username) && passwordList.get(i).equalsIgnoreCase(password)) {
                            System.out.println("Welcome, " + username);
                            System.exit(0);
                        }
                    }
                    System.out.println("Sorry, the account does not exist in our records");
                } else {
                    System.out.println("Unable to perform action please try again"); //If the first input doesn't match "login" or "Create an account"
                }
            }
        }
    }


