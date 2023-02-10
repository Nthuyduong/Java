/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_bai34;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class bai3_symmetric {

    
    public static void main(String[] args) {
        String str;
        //nhap chuoi bat ki
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        str=sc.nextLine();
        //tao chuoi thay doi chuoi str
        StringBuilder strbuilder = new StringBuilder(str);
        //dao nguoc chuoi
        strbuilder.reverse();
        String streverse = new String(strbuilder);
        
        if (str.equals(streverse)) {
            System.out.println("The string is symmetric.");
        } else {
            System.out.println("The string is not symmetric.");
        }
        
    }
}
