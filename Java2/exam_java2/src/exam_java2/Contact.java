/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam_java2;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class Contact {
    public String Name;
    public String Phone;

    public Contact() {
    }

    public Contact(String Name, String Phone) {
        this.Name = Name;
        this.Phone = Phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    public void InputContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        this.Name = sc.nextLine();
        System.out.println("Enter Phone Number");
        this.Phone = sc.nextLine();

    }
    
    public void Display(){
        System.out.println(this.Name + "          " + this.Phone);
    }
}
