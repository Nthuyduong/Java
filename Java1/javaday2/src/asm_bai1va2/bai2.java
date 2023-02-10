/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_bai1va2;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class bai2 {
    public static void main(String[] args) {
        float a,b,c;
        float x1,x2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap gia tri a:");
        a=sc.nextFloat();
        System.out.println("Nhap gia tri b:");
        b=sc.nextFloat();
        System.out.println("Nhap gia tri c:");
        c=sc.nextFloat();
        
        if(a==0)
        {
            if(b==0)
            {
                System.out.println("Phuong trinh vo nghiem");
            }
            System.out.println("Phuong trinh co mot nghiem" + "x = " + (-c/b));
        }
        float delta = b*b - 4*a*c;
        if(delta>0)
        {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        }
        else if(delta==0)
        {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        }
        System.out.println("Phương trình vô nghiệm!");
    }
}
