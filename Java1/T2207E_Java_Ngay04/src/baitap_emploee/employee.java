/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap_emploee;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public abstract class employee {
    public String name;
    public Double salary;
    
    public employee(){
        
    }

    public employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public abstract double calculatepay();  
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        this.name = sc.nextLine();
        System.out.println("Enter salary:");
        this.salary = sc.nextDouble();
    }
    
    public void display(){
        System.out.println("Name:" + this.name);
        System.out.println("Salary:" + this.salary);
    }
}
