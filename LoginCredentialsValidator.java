/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author gee
 */
public class LoginCredentialsValidator {
    
    private final String enteredPasswrd;
    private final String enteredUsrname;
    private final String password;
    private final String username;
    private final String errorMsg;

    public LoginCredentialsValidator(String enteredPassword, String enteredUsername, String usrname, String passwrd, String errorMsg) {
        this.enteredPasswrd= enteredPassword;
        this.enteredUsrname= enteredUsername;
        this.password = passwrd;
        this.username = usrname;
        this.errorMsg = errorMsg;
    }
    
    // This method generates a welcome message for the client
    public String generateResponse() throws InvalidLoginException{
        String response="";
        
        if(this.username.equalsIgnoreCase(this.enteredUsrname) && this.password.equalsIgnoreCase(this.enteredPasswrd)){ 
            response = "Welcome user " + this.username;     
        }
        else{
            throw new InvalidLoginException(this.errorMsg);
        } 
        return response;
    }
    
    
    
}
