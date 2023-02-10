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
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n,sum;
        do{
            //nhap so luong phan tu n
            System.out.println("Nhap so luong phan tu n (1-100)");
            n = sc.nextInt();//dừng màn hình đợi nhập số nguyen
        }
        while(n<1 || n>100);
        //
        System.out.println("Moi nhap" + n + "phan tu");
        for(int i=0; i<n; i++){
            System.out.println("So nguyen thu nhat, i = " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Các phần tử đã nhập:");
        //for(int a : arr)
        for(int i=0;i<n; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        sum = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        System.out.println("Tong so le la:" + sum);
    }
}
