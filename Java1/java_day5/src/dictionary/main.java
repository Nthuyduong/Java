/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dictionary;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class main {
    //xay dung menu
    public static int Menu()
    {
        int nhap;
        while(true)
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Tu Dien Anh Viet"
                        + "\n1.Them tu moi"
                        + "\n2.Hien thi toan bo"
                        + "\n3.Tra tu"
                        + "\n4.Sua tu"
                        + "\n5.Xoa tu"
                        + "\n6.Thoat");
                nhap = sc.nextInt();
                return nhap;
            }
            catch(java.util.InputMismatchException e)
            {
                System.out.println("Nhap sai");
                continue;
            }
        }
    }
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        tudien td = new tudien();
        String ta,tv;
        boolean b;
        do
        {
            chon = Menu();
            switch(chon)
            {
                //them tu moi
                case 1:
                    System.out.println("Tieng anh");
                    ta=sc.nextLine();
                    System.out.println("Tieng viet");
                    tv=sc.nextLine();
                    b = td.Themtu(ta, tv);
                    if(!b)
                    {
                        System.out.println("Error");
                    }
                    break;
                //hien thi tat ca
                case 2:
                    System.out.println("Danh sach tu trong tu dien:");
                    td.Hienthi();
                    break;
                //tra tu tieng anh
                case 3:
                    System.out.println("Nhap tu can tra");
                    ta=sc.nextLine();
                    tv = td.Tratu(ta);
                    if(tv.equals(""))
                    {
                        System.out.println("Khong tim thay tu trong tu dien");
                    }
                    else
                    {
                        System.out.println(ta + "nghia la:" + tv);
                    }
                    break;
                //Sua tu
                case 4:
                    System.out.println("Nhap tu can sua");
                    System.out.println("Tieng anh:");
                    ta=sc.nextLine();
                    System.out.println("Tieng viet:");
                    tv=sc.nextLine();
                    b = td.Suatu(ta,tv);
                    if(!b)
                    {
                        System.out.println("Tu chua co trong tu dien");
                    }
                    break;
                //Xoa tu
                case 5:
                    System.out.println("Tieng anh");
                    ta=sc.nextLine();
                    b= td.Xoatu(ta);
                    if(!b)
                    {
                        System.out.println("Tu chua co trong tu dien");
                    }
                    break;
                //Thoat
                case 6:
                    System.out.println("Hen gap lai");
                default:
                    System.out.println("Moi chon lai");
            }
        }while(chon!=6);
    }
}
