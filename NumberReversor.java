/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author gee
 */
public class NumberReversor {
    
    private String number;
    
    // Reverse the number received from the user
    public NumberReversor(String number) {
        this.number = number;
    }
    
    public String reverseNumber(){
        String reversedNum = "";
        
        for(int i=number.length()-1;i>=0;i--){
            reversedNum += number.charAt(i);
        }
        return reversedNum;
    }
    
}
