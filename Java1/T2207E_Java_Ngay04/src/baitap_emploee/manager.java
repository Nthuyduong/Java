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
public class manager extends employee{
    public double business_amount;

    public manager(){
        super();
        business_amount = 0.0;
    }
    
    public manager(String name, Double salary, double ba) {
        super(name,salary);
        business_amount = ba;
    }
            
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter busniness amount:");
        this.business_amount = sc.nextDouble();
    }
    
    @Override
    public double calculatepay(){
        double commission;
        double total_pay;
        if(this.business_amount>50.000){
            commission = (10*this.business_amount)/100;
        }
        else{
            commission = (5*this.business_amount)/100;
        }
        return total_pay = super.getSalary() + commission;
    }
   
    public void display(){
        super.display();
        System.out.println("Business amout:" + this.business_amount);
    }
}
