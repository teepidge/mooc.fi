/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taylor Pigeon
 */


//this one is interesting
//It allows a string representation of the object by creating a "toString" method
//in the class file.  
public class Main {
    
    public static void main(String[] args){
        Agent a = new Agent("James", "Bond");
        a.toString();  //doesn't work because this is a default method that Java finds at runtime and overrides with System.out.println(<string rep>);
        System.out.println(a);
    }
}
