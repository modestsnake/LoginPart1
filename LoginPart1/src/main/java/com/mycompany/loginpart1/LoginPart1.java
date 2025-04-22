/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginpart1;

/**
 * User registration and login system.
 * 
 * @author lab_services_student
 */
import java.util.regex.Pattern;

public class LoginPart1 {

    private String username;
    private String password;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public static void main(String[] args) {
        LoginPart1 loginSystem = new LoginPart1();
        
        // Example registration
        String registrationMessage = loginSystem.registerUser("ky_1", "Ch&&sec@ke99!", "+27838968976", "John", "Doe");
        System.out.println(registrationMessage);
        
        // Example login
        boolean loginSuccess = loginSystem.loginUser("ky_1", "Ch&&sec@ke99!");
        String loginMessage = loginSystem.returnLoginStatus(loginSuccess);
        System.out.println(loginMessage);
    }
    
 public String registerUser(String username, String password, String phoneNumber, String firstName, String lastName) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber(phoneNumber)) {
            return "Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.";
        }
        
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        
        return "User registered successfully.";
    }

  public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String returnLoginStatus(boolean loginSuccess) {
        if (loginSuccess) {
            return "Welcome " + firstName + ", it is great to see you.";
        } else {
            return "Username or password incorrect.";
        }
    }

    public boolean checkUserName(String username) {
        return username.length() <= 5 && username.contains("_");
    }

    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 && 
               Pattern.compile("[A-Z]").matcher(password).find() && 
               Pattern.compile("[0-9]").matcher(password).find() && 
               Pattern.compile("[^a-zA-Z0-9]").matcher(password).find();
    }

    public boolean checkCellPhoneNumber(String phone) {
        return Pattern.matches("^\\+27[0-9]{9}$", phone);
    }
}