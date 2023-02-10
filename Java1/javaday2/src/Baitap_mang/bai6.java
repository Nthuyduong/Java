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
public class bai6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        int[] arr = new int[100];
        
        do
        {
            System.out.println("Nhap so luong so phan tu (1-100):");
            n = sc.nextInt();
        }
        while(n<1||n>100);
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap phan tu thu i =" + (i+1));
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Phan tu da nhap:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Day so sau khi sap xep giam dan");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
