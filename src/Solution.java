//import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 interface Animal{
     public void eat();
     public void makeSound();
 }
 interface Bird{
     public static final int leg=2;
     public void fly();
 }
 class Parrot implements Animal,Bird
 {
  public void eat(){
      System.out.println("Parrots can eat up to 100 gms in a Day");
  }  
  public void makeSound(){
      System.out.println("Parrots make sound of screech");
  } 
  public void fly(){
      System.out.println("Parrots can fly up to 50 miles in a day");
  }
 }

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String name = sc.nextLine();
            Parrot p = new Parrot();
            if(name.equals("eat")){
                p.eat();
            }
            if(name.equals("makeSound")){
                p.makeSound();
            }
            if(name.equals("fly")){
                p.fly();
            }
        }
    }
}