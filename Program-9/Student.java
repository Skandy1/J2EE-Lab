/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SKANDA
 */

import com.sun.xml.internal.stream.Entity;
import java.sql.*;
import java.util.Scanner;
public class Student {
    Connection con;
    
    public static void main(String[] args) {
//        main funciton
        Student sdb=new Student();
        String n,p,u;
        while(true){
            System.out.println("1--- Insert Data");
            System.out.println("2--- Select Data");
            System.out.println("3--- update Data");
            System.out.println("4--- Delete Data");
            System.out.println("5--- View all");
            Scanner s = new Scanner(System.in);
            switch(s.nextInt()){
                case 1:
                    System.out.println("Enter Name");
                    n=s.next();
                    System.out.println("Enter USN");
                    u=s.next();
                    System.out.println("Pass/Fail");
                    p=s.next();
                    sdb.insert(n,u,p);
                    break;
                case 2:
                    System.out.println("Enter USN to search");
                    u=s.next();
                    sdb.select(u);
                    break;
                case 3:
                    System.out.println("Enter Name");
                    n=s.next();
                    System.out.println("Enter USN");
                    u=s.next();
                    System.out.println("Pass/Fail");
                    p=s.next();
                    sdb.update(n,u,p);
                    break;
                case 4:
                    System.out.println("Enter USN to delete");
                    u=s.next();
                    sdb.delete(u);
                    break;
                case 5:
                    System.out.println("**********FILE CONTENT**********");
                    sdb.viewall();
                    break;
                default:
                    System.exit(0);
            }
        }
    }


    private void select(String u) {
//        used to select data using USN 
        try {
            connectdb();
            PreparedStatement pre=con.prepareStatement("select * from student where usn=?");
            pre.setString(1, u);
            ResultSet rs=pre.executeQuery();
            if (rs.next()){
                System.out.println("Name = "+rs.getString(1));
                System.out.println("USN = "+rs.getString(2));
                System.out.println("Result = "+rs.getString(3));
                con.close();
            }else {
                System.out.println("No record found!");
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insert(String n, String u, String p) {
//        insert data into the database
        try {
            connectdb();
            PreparedStatement pre=con.prepareStatement("insert into student(name,usn,result) values(?,?,?)");
            pre.setString(1, n);
            pre.setString(2, u);
            pre.setString(3, p);
            int rs=pre.executeUpdate();
            if (rs==1){
                System.out.println("Result Updated");
                con.close();
            }else {
                System.out.println("Updation Failed");
                con.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void update(String n, String u, String p) {
//        used to update the data
        try {
            connectdb();
            PreparedStatement pre=con.prepareStatement("update student set name=?, result=? where usn=?");
            pre.setString(1, n);
            pre.setString(2, p);
            pre.setString(3, u);
            int rs=pre.executeUpdate();
            if (rs==1){
                System.out.println("Result Updated");
                con.close();
            }else {
                System.out.println("Record Not Found!");
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void delete(String u) {
//        used to delete a particular record in the database
        try {
            connectdb();
            PreparedStatement pre=con.prepareStatement("delete from student where usn=?");
            pre.setString(1, u);
            int rs=pre.executeUpdate();
            if (rs==1){
                System.out.println("Record Deleted");
                con.close();
            }else{
                System.out.println("Record not found!");
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void viewall() {
//        used to view all the data in the database
        try {
            connectdb();
            PreparedStatement pre=con.prepareStatement("select * from student");
            ResultSet rs=pre.executeQuery();
            while(rs.next()){
//                System.out.println("----------------------------------");
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void connectdb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
