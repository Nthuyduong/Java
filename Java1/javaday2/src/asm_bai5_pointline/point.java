/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_bai5_pointline;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class point {
    public int x;
    public int y;
    
    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your point (x,y)");
        System.out.println("x:");
        x=sc.nextInt();
        System.out.println("y:");
        y=sc.nextInt();
    }
    
}
