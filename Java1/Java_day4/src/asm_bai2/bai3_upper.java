/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_bai2;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class bai3_upper {
    
 public static void main(String[] args) {
        
        String st;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can chuyen doi:");
        st = sc.nextLine();
        
        //chuyen chuoi sang dang chu hoa
        String str = new String(st.toUpperCase());
                
        //tach string ra thanh tung tu
        String strarr[] = str.split(" ");
        
        //bo qua ky tu dau tien va viet thuong bat dau tu ki tu thu 2
        for(int i=0;i<strarr.length;i++) {
            strarr[i] = strarr[i].charAt(0) + strarr[i].substring(1).toLowerCase();
        }
        
        String newstr = String.join(" ",strarr);
        System.out.println("Chuoi sau khi bien doi:" + newstr);
        
    }
    
//    public static void main(String[] args) {
//        String str1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi nhap chuoi bat ki");
//        str1 = sc.nextLine();
//        //Chuyen doi chuoi sang chu hoa
//        StringBuilder str2 = new StringBuilder(str1.toUpperCase());
//        
//        System.out.println("Chuoi da nhap sau khi chuyen thanh chu hoa");
//        System.out.println("");
//        //Xu chuoi dang
//        for(int i=1;i<str2.length();i++){
//            char c = str2.charAt(i);
//            char before = str2.charAt(i-1);
//            if(c!=' '&& before!=' '){
//                char c_low = Character.toLowerCase(c);
//                str2.setCharAt(i, c_low);
//            }
//        }
//        System.out.println("Chuoi sau khi bien doi hoan thien:");
//        System.out.println(str2);
//    }
    
}
