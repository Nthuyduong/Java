/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class Triangle {
    public int a,b,c;
    
    public Triangle(){
        
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
    //Nhap 3 canh tam giac
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of 3 edges:");
        System.out.println("a:");
        this.a=sc.nextInt();
        System.out.println("b:");
        this.b=sc.nextInt();
        System.out.println("c:");
        this.c=sc.nextInt();
    }

    public int Perimeter(){
        return (this.a+this.b+this.c);
    }
    
    public Double Area(){
    //Cong thuc Heron
        double p = this.Perimeter() / 2.0;
        double edg01 = this.getA();
        double edg02 = this.getB();
        double edg03 = this.getC();
        double S = Math.sqrt(p * (p - edg01) * (p - edg02) * (p - edg03));
        return S;
    }
    
    //Check xem co phai tam giac hay khong
    public boolean Check(){
        if(a + b < c || a + c < b || c + b < a){
            return false;
        }
        else{
            return true;
        }
    }
    
    //hien thi
    public void Display() {
        System.out.println("3 canh cua tam giac la: " + this.getA() + " - " + this.getB() + " - " + this.getC());
        if (this.Check()) {
            System.out.println("Chu vi la : " + this.Perimeter());
            System.out.println("Dien tich la : " + this.Area());
        } else {
            System.out.println("Khong phai 3 canh cua mot tam giac");
        }

    }
    
}


