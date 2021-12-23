/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bmxfr
 */
public class Bird {
    protected String type, name;
    protected int age = 18;
    
    public Bird(String type, String name){
        type = "mockingJay";
        name = "Lena";
    }
    
 public void sing(){
     System.out.println("Tweet Tweet Tweet");
 }
    
 
}
