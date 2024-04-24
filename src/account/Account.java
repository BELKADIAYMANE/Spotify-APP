package account;
import java.util.Scanner;

public class Account {
    // Fields
    private String username;
    private String password;
    private User user;
    
    // Constructor
    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    // Overload
    public Account(String username, String password, User user) {
        this.username = username;
        this.password = password;
        this.user = user;
    }
    
    
    // Getters and Setters
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public User getUser(){
        return this.user;
    }
    
    public void setUser(User user){
        this.user = user;
    }

    public void resetPass(){
    	Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your new password: ");
        String new_pass = sc.nextLine();
        this.setPassword(new_pass);
        sc.close();
    }
    
    public boolean changePass(String oldpass, String newpass){
        if(this.password.equals(oldpass)){
            this.password = newpass;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean authenticate(String username, String password){
        if(this.password.equals(password) && this.username.equals(username)){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean equals(Object obj){
        Account m = (Account) obj;
        return m.username.equals(this.username);
    }
    
    // Behaviors
    @Override
    public String toString(){
        // Returns the state of this object
        
        return "This account has username: "+username+", has password: "+password ;
        
    }
}