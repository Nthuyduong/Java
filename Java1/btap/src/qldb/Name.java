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
public class Name {
    public String name;

    public Name(){
        
    }
    
    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = sc.nextLine();
    }
    
    public void Display(){
        System.out.println("Ten:" + this.name);
    }
}
