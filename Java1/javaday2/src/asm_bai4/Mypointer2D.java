/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_bai4;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class Mypointer2D {
    public Double x;
    public Double y;
    
    public Mypointer2D(Double x, Double y){
        this.x = x;
        this.y = y;
    }
    
    public void Inputpoint()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your point (x,y)");
        System.out.println("x:");
        x=sc.nextDouble();
        System.out.println("y:");
        y=sc.nextDouble();

    }
    
    public void Display()
    {
       System.out.println("x" + x + "y" + y);
    }
    
    public double distance(Mypointer2D other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }
    
    public static void main(String[] args) {
        
        Double a = 0.0;
        Double c = 0.0;
        Double b = 0.0;
        Double d = 0.0;
        
        Mypointer2D A = new Mypointer2D(a, b);
        A.Inputpoint();
        Mypointer2D B = new Mypointer2D(c, d);
        B.Inputpoint();
        
        A.Display();
        B.Display();
        
        System.out.println("Distance between MyPointer2D to another pointer is:" + A.distance(B));
    }
}
