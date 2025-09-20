import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
       
        System.out.println("Do you want to adopt a dog?");
           System.out.println("Options: yes/no");
            Scanner sc=new Scanner(System.in);
            String a = sc.next();
      
         if (a.equals("yes")) {
                    {System.out.println("What size of dog do you prefer?");}
                     {System.out.println("Options: small/medium/large");}
         String size = sc.next();        
                     {System.out.println("Do you live in a cold place?");}
                      {System.out.println("yes/no");}
        
         String temp = sc.next();
         if (size.equals("small") && temp.equals("yes")){
             System.out.println("Shih Tzu");}
         else if (size.equals("small") && temp.equals("no")){
             System.out.println("Beagle");}
         else if (size.equals("medium") && temp.equals("yes")){
             System.out.println("Border Collie");}
         else if (size.equals("medium") && temp.equals("no")){
             System.out.println("Cocker Spaniel");}
         else if (size.equals("large") && temp.equals("yes")){
             System.out.println("Siberian Husky");}
         else if (size.equals("large") && temp.equals("no")){
             System.out.println("Labrador Retriever");}
         
         else{System.out.println("no dogesh bhai found");}
         }
            else if (a.equals("no")){System.out.println("No worries! Have a great day.");}
            else{System.out.println("Invalid input.Try again!");}
    }
}