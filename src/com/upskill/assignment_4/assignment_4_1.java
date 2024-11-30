package com.upskill.assignment_4;

/*Write a user program using encapsulation that contains the username,
password, email, first and last names of a user of our application. 
Display the user information in console output?*/


public class assignment_4_1  {
  
    // Private fields
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;

    // Constructor without using 'this' keyword
    public assignment_4_1(String uName, String pwd, String mail, String fName, String lName) {
        username = uName;
        password = pwd;
        email = mail;
        firstName = fName;
        lastName = lName;
    }

    // Method to display user information
    public void displayUserInfo() {
        System.out.println("User Information:");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }

    // Main method to test the User class
    public static void main(String[] args) {
    	assignment_4_1 user = new assignment_4_1("john_doe", "securePassword123", "john.doe@example.com", "John", "Doe");
        user.displayUserInfo();
    }
}
