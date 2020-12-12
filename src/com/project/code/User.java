/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.code;

/**
 *
 * @author tintin
 */
public class User {
    private String fullName;
    private String username;//="Admin";
    private String password;//="123";
   // private String email;
    private String Phone;
    private String address;

    public User(String fullName, String username, String password , String Phone/*, String address*/) {
        this.fullName = fullName;
        //this.email = email;
        this.username = username;
        this.password = password;
//        this.address = address;
        this.Phone = Phone;
       // show();
        //System.err.println("Welcome +"+fullName);
  //  }

  //  public String getFullName() {
   //     return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

//    public String getEmail() {
//        return email;
//    }

    public String getPhone() {
        return Phone;
    }

    public String getAddress() {
        return address;
    }
    
    private void show(){
        System.out.println("Welcome "+fullName);
    //public String getFullName() {
      //  return fullName;
    }
    
    public boolean checkPassword(String password)
    {
        return this.password.equals(password);
    }
    
   public boolean CheckUser(String username,String password){
   if(username.equalsIgnoreCase(this.username) && password.equals(this.password)){
   //System.out.println("Success");
   return true;
       }
   else
   return false;
}

    public String getfullName() {
        return this.fullName; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void updateUser(String fullName, String username, String password , String Phone/*, String address*/) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
//        this.address = address;
        this.Phone = Phone;    
    }
    
}
