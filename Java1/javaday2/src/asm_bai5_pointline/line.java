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
public class line {
    public point start;
    public point end;
    
    public line(point start, point end){
        this.start = start;
        this.end = end;
    }
    
    public double Length(){
        int xCor = start.x-end.x;
        int yCor = start.y-end.y;
        return Math.sqrt(xCor*xCor + yCor*yCor); 
    }
    
    public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
        
            System.out.println("------Let's create the first line -----");
            System.out.println("Enter point 1 (a,b)");
            System.out.println("a:");
            int pa1 = sc.nextInt();
            System.out.println("b:");
            int pb1 = sc.nextInt();
            point pn1 = new point(pa1,pb1);

            System.out.println("Enter point 2 (a,b");
            System.out.println("a:");
            int pa2 = sc.nextInt();
            System.out.println("b:");
            int pb2 = sc.nextInt();
            point pn2 = new point(pa2,pb2);
            //create a new line"
            line ln1 = new line(pn1, pn2);
            
            System.out.println("------Let's create the seacond line -----");
            System.out.println("Enter point 1 (a,b)");
            System.out.println("a:");
            int pa3 = sc.nextInt();
            System.out.println("b:");
            int pb3 = sc.nextInt();
            point pn3 = new point(pa3,pb3);

            System.out.println("Enter point 2 (a,b)");
            System.out.println("a:");
            int pa4 = sc.nextInt();
            System.out.println("b:");
            int pb4 = sc.nextInt();
            point pn4 = new point(pa4,pb4);
            //create a new line"
            line ln2 = new line(pn3, pn4);
            
            System.out.println("The first line's length is:" + ln1.Length());
            System.out.println("The first line's length is:" + ln2.Length());
            
            if(ln1.Length()>ln2.Length()){
                System.out.println("Line 1 is longer than Line 2");
            }
            else if(ln1.Length()<ln2.Length()){
                System.out.println("Line 1 is shoter than Line 2");
            }
            else{
                System.out.println("Line 1 and Lin 2 have the same length");
            }
    }       
         
}
