/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myonlineshop;

/**
 *
 * @author Chukwuemeka
 */
import java.sql.Driver;
import java.sql.*;
public class Databaseconnection {
     static String root;
    public static void makeDatabase()throws ClassNotFoundException{
  // public static void main(String args[])throws ClassNotFoundException {
      try{  Class.forName("com.mysql.cj.jdbc.Driver");
             System.out.println("java.class.path");
		String url = "jdbc:mysql://localhost:3306/onlineshop";
		String username = "root";
		String password = "chidinma01";
                 String database="CREATE DATABASE onlineshop";
                 String admin="CREATE TABLE adminInfo"+
                         "(AdminID INTEGER not null,"+"Name VARCHAR(255),"
                         +"Age INTEGER not null,"+"Email VARCHAR(255),"+
                         "Address VARCHAR(255),"+
                         "ContactNumber INTEGER not null)";
              String address="   ALTER TABLE custInfo  ADD COLUMN Address VARCHAR(20) NOT NULL AFTER ContactNumber"; 
               String customer ="CREATE TABLE  custInfo"+"(CustID INTEGER not null,"
                       +"Name VARCHAR(255),"
                       +"Age INTEGER not null,"
                       +"Email VARCHAR(255),"
                       +"ContactNumber INTEGER not null)";
           String user="CREATE TABLE loginInfo"+"(userID INTEGER not null,"
                   +"password VARCHAR(255),"
                   +"userType CHAR(5))";
         String products ="CREATE TABLE products"+"(productID INTEGER not null,"+"Name VARCHAR(255),"+"Type VARCHAR(255),"+"Quantity INTEGER not null,Price INTEGER not null)";
         String bill="CREATE TABLE bills"+"(bill_id INTEGER not null,"+"cust_name VARCHAR(255),"+"bill_addr VARCHAR(255),"+"total_amt INTEGER not null)";
		Connection con = DriverManager.getConnection(url, username, password);
                Statement stmt = con.createStatement();
               stmt.executeUpdate(address);
               // stmt.executeUpdate(admin);
                 // stmt.executeUpdate(customer);
              // stmt.executeUpdate(database);



                System.out.println("Database created successfully");
		if (con != null) {
			System.out.println("Database Connected successfully");
		} else {
			System.out.println("Database Connection failed");
		}
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

   
}
