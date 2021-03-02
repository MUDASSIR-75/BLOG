
package project.pkg1;

import java.util.Scanner;
import java.util.*;

public class Project1 {

    
    public static void main(String[] args) {
        
        user u1 = new user();
        user u2 = new user();
        
        Scanner s = new Scanner (System.in );
        System.out.println("Blog");
        
        
     
        System.out.println("Do you want to create blog  1 = Yes  2 = No");
        int a = s.nextInt();
        if ( a==1 )
        {
            System.out.println(" Enter username ");
            String usr=s.next();
            
            System.out.println(" Enter password ");
            String pwd = s.next();
            u1.validate(usr, pwd);
            
        }
        else {
            System.out.println(" thanks ");
        }
    }
    
}

class Blog
{
            Scanner s = new Scanner (System.in );

    // this is for the path of database
    String image;
    String video;
    String text;
    String title;
    String visibility;
     public void  visibility(){
         System.out.println("\n Visitor View ");
         
if( visibility == "visible"){
           System.out.println("BLOG POSTS");
            System.out.println(title);
            System.out.println(text); 
          
           
    
        }
else{
    System.out.println("Access Denied");
}
}
     
    
}

class user extends Blog
{    
    String Username = "abc";
    String Password = "abc123";
     
    public void validate (String usr, String pwd )
    {
        if (pwd.equals(Password) && usr.equals(Username))
        {
            
            System.out.println("Valid Username/Password!");
            System.out.println("\n\n User view");
            Blog b1 = new Blog();
            System.out.println("\n\n");
            System.out.println("Enter blog title: ");
            String title = s.next();
            System.out.println("Enter blog text: ");
            String text = s.next();
            System.out.println("Enter the visibility of your post(visible/invisible):");
            String visibility = s.next();
            System.out.println("\n\n");
           
            System.out.println("Do you want to use visitor view blog  1 = Yes  2 = No");
        int a = s.nextInt();
        if ( a==1 )
        {
           visibility();
        
        }
        else{
             System.out.println("\n\n User view");
             System.out.println("BLOG POSTS");
            System.out.println(title);
            System.out.println(text); 
            
        }
       
    }
         else
        {
            System.out.println("Invalid Username/Password!");
        }
}
}

class visitor extends Blog
{

    @Override
    public void visibility() {
        super.visibility(); //To change body of generated methods, choose Tools | Templates.
     
        visibility();
    }

}