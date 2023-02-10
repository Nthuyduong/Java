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
public class laborer extends employee{
    public int hrsworked;
    
    public laborer(){
        super();
        hrsworked = 0;
    }
    
    public laborer(String name, Double salary, int hr){
        super(name,salary);
        hrsworked = hr;
    }
    
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of hrsworked:");
        this.hrsworked = sc.nextInt();
    }
    
    @Override
    public double calculatepay(){
        double commission;
        double total_pay;
        if(hrsworked>50){
            commission = (15*salary)/100;
        }
        else{
            commission = (8*salary)/100;
        }
        return total_pay = salary + commission;
    }
    
    public void display(){
        super.display();
        System.out.println("hrsworked:" + this.hrsworked);
    }
}
