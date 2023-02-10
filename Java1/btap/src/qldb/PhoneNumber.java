/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qldb;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class PhoneNumber extends Name{
    public String phone;
    
    public PhoneNumber(){
        super();
    }

    public PhoneNumber(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void Input(String sdt){
        super.Input();
        this.phone = sdt;
    }
    
    public void Display(){
        super.Display();
        System.out.println("SDT:" + this.phone);
    }
}
