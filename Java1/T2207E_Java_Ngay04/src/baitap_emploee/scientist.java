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
public class scientist extends employee{
    public int publication;
       
    public scientist(){
        super();
        publication = 0;
    }
    
    public scientist(String name, Double salary, int pc){
        super(name,salary);
        publication = pc;
    }
    
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Publication:");
        this.publication = sc.nextInt();
    }
    

    @Override
    public double calculatepay() {
        double commission;
        double total_pay;
        if(this.publication<25){
            commission = (20*salary)/100;
        }
        else{
            commission = (10*salary)/100;
        }
        return total_pay = salary + commission;
    }
    
    public void display(){
        super.display();
        System.out.println("Publication:" + this.publication);
    }
}
