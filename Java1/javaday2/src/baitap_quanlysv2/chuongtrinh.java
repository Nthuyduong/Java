/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap_quanlysv2;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class chuongtrinh {
    public static int Menu()
    {
        int select;
        Scanner sc = new Scanner(System.in);
        System.out.println("--MENU--");
        System.out.println("1: Hien thi danh sach sinh vien");
        System.out.println("2: Nhap danh sach sinh vien");
        System.out.println("3: Sap xep danh sach sinh vien");
        System.out.println("4: Thoat chuong trinh");
        select=sc.nextInt();
        return select;
    }
    
    public static void main(String[] args) {
        quanlysv list = new quanlysv();
        int select;
        do
        {
            select = Menu();
            switch(select)
            {
                case 1:
                   System.out.println("Danh sach sinh vien");
                   list.Hienthisinhvien();
                   break;
                case 2:
                   System.out.println("Nhap danh sach sinh vien");
                   list.Nhapsinhvien();
                   break;
                case 3:
                   System.out.println("Sap xep danh sach");
                   list.Sapxepsinhvien();
                   break;
                case 4:
                   System.out.println("Ket thuc");
            }
        }
        while(select != 4);
    }
}
