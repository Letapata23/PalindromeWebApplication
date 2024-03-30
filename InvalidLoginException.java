/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author gee
 */
public class InvalidLoginException extends RuntimeException{

    public InvalidLoginException(String message) {
        super(message);
    }
    
}
