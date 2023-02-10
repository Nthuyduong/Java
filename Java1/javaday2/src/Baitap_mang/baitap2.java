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
public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n;
        
        do{
            System.out.println("Nhap so luong phan tu:");
            n=sc.nextInt();
        }
        while(n<1||n>100);
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap phan tu i =" + i + ":");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Phan tu da nhap:");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i] + "\t");
        }
        
        int dem = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] <0)
            {
                dem++;
            }
        }
        System.out.println("Day co tat ca" + dem + "so am");
        
    }
}
