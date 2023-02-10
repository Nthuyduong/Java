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
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[100];
        
        do
        {
            System.out.println("Nhap so luong phan tu:");
            n=sc.nextInt();
        }
        while(n<1 || n>100);
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap phan tu thu i =" + i);
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Nhung so da nhap la:");
        for(int i=0;i<n;i++)
        {
           System.out.println(arr[i] + "\t");
        }
        
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Max =" + max);
    }
}
