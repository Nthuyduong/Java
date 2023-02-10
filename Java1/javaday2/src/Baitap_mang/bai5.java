/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap_mang;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class bai5 {
    //ham kiem tra so chinh phuong
    public static boolean check(int b) {
         
        int a = (int)Math.sqrt(b);
        if(a*a == b) {
            return true;
        }
        else {
            return false;
        }
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        int[] arr = new int[100];
        
        do
        {
            System.out.println("Nhap so luong so phan tu n:");
            n=sc.nextInt();
        }
        while(n<1 || n>100);
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhap phan tu thu i = " + (i+1));
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Day so phan tu da nhap:");
        
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i] + "\t");
        }
        
        System.out.println("So chinh phuong gom");
        for(int i=0; i<n; i++)
        {
            if(check(arr[i])==true)
            {
                System.out.println(arr[i]);
            }
        }
    }
   
}
