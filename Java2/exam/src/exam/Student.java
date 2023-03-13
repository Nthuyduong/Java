/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class Student implements Serializable{

    public String EnrollID;
    public String FirstName;
    public String LastName;
    public int Age;

    public Student() {
    }

    public Student(String EnrollID, String FirstName, String LastName, int Age) {
        this.EnrollID = EnrollID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
    }

    public String getEnrollID() {
        return EnrollID;
    }

    public void setEnrollID(String EnrollID) {
        this.EnrollID = EnrollID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Enroll ID");
        this.EnrollID = sc.nextLine();
        System.out.println("Enter First Name");
        this.FirstName = sc.nextLine();
        System.out.println("Enter Last Name");
        this.LastName = sc.nextLine();
        System.out.println("Enter Age");
        this.Age = sc.nextInt();
    }
    
    public void Display(){
        System.out.format("% -10s       % -25s  %-7d", this.EnrollID,
                this.FirstName + " " + this.LastName, this.Age);
    }
    
//    @Override
//    public String toString() {
//        return "Student{" + "EnrollID=" + EnrollID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + '}';
//    }
    
}
