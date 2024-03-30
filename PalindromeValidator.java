/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author gee
 */
public class PalindromeValidator {
    private String message;
    private int numPalindromes;
    private int numNonPalindromes;
    
    public PalindromeValidator(int numOfPalindromes, int numOfNonPalindromes) {
        this.message = "";
        this.numPalindromes = numOfPalindromes;
        this.numNonPalindromes = numOfNonPalindromes;
    }
    
    // This method checks if the number provided by the user is a palindrome
    public boolean analyseNumber(String number,String reversedNum){
        boolean isPalindrome = false;
        
        if(number.equalsIgnoreCase(reversedNum)){
            isPalindrome = true;
        }
         return isPalindrome;
    }
    
    // This method updates the palindrome count of the current session
    public void updatePalindromeCount(boolean isPalindrome){
        if(isPalindrome){
            this.numPalindromes++;
        }
        else{
            this.numNonPalindromes++;
        }
    }
    
    // Generate a message that informs user whether the number is a palindrome or not
    public void generateMessage(String number,boolean isPalindrome){
        if(isPalindrome){
            this.message = number.concat(" is a palindrome");
        }
        else{
            this.message = number.concat(" is not a palindrome");
        }
    }

    public String getMessage() {
        return message;
    }

    public int getNumPalindromes() {
        return numPalindromes;
    }

    public int getNumNonPalindromes() {
        return numNonPalindromes;
    }

    
    

    
    
}
