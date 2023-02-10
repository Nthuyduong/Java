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
public class bai1 {
    public static void main(String[] args) {
        Float a;
        Float b;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap gia tri a:");
        a=sc.nextFloat();
        System.out.println("Nhap gia tri b:");
        b=sc.nextFloat();
        
        if(a != 0) {
            System.out.println("result is " +(-b/a));
        } else {
            System.out.println("result is infinity");
        }
    }
}
