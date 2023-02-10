/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap_emploee;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class main {
    static ArrayList<employee> listnv = new ArrayList<employee>();
    
    public static void Doituong(){
        System.out.println("----MOI CHON DOI TUONG----");
        System.out.println("1: Manager");
        System.out.println("2: Scientist");
        System.out.println("3: Laborer");
    }
    
    public static void Menu(){
        System.out.println("----MENU HERE----");
        System.out.println("1: Nhap danh sach sinh vien");
        System.out.println("2: Hien thi danh sach sinh vien");
        System.out.println("3: Tim kiem nhan vien theo ten");
        System.out.println("4: Sap xep theo thu nhap giam dan");
        System.out.println("5:Thoat");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MenuID;
        do{
            Menu();
            System.out.println("Moi chon chuc nang:");
            MenuID = sc.nextInt();
            switch(MenuID){
                case 1:
                    Nhap();
                    break;
                case 2:
                    Hienthi();
                    break;
                case 3:
                    Timkiem();
                    break;
                case 4:
                    Sapxep();
                    break;
                case 5:
                    Thoat();
                    break;
                default:
                    System.out.println("Please choose a number");
            }
        }while(MenuID != 5);
    }
    
    public static void Nhap(){
        Scanner sc = new Scanner(System.in);
        int Type;
        do{
            Doituong();
            System.out.println("Moi chon doi tuong:");
            Type = sc.nextInt();
            switch(Type){
                case 1:
                    scientist a = new scientist();
                    a.Input();
                    listnv.add(a);
                    break;
                case 2:
                    scientist b = new scientist();
                    b.Input();
                    listnv.add(b);
                    break;
                case 3:
                    laborer c = new laborer();
                    c.Input();
                    listnv.add(c);
                    break;
                default:
                    System.out.println("Please choose a number");
            } 
        }while(Type != 3 && Type != 1 && Type != 2);
    }
    //tim kiem sinh vien
    public static void Timkiem(){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can tim kiem:");
        str = sc.nextLine();
        if(listnv.isEmpty()){
            System.out.println("Chua co nhan vien");
        }
        else{
            for(int i=0; i<listnv.size();i++){
               if(listnv.get(i).getName().equalsIgnoreCase(str)){
                   System.out.println("Co nhan vien");
               }else{
                   System.out.println("Khong co nhan vien nao");
               }
            }
            
        }
    }
    
    //hien thi
    public static void Hienthi(){
        for(int i=0; i<listnv.size();i++){
            listnv.get(i).display();
        }
    }
    
    //sap xep theo thu nhap giam dan
    public static void Sapxep(){
        employee temp;
        for(int i =0; i<listnv.size();i++){
            for(int j=i+1; j<listnv.size();j++){
                if(listnv.get(i).calculatepay() < listnv.get(j).calculatepay()){
                    temp = listnv.get(i);
                    listnv.set(i, listnv.get(j));
                    listnv.set(j, temp);
                }
            }
        }
        Hienthi();
    }
    
    //thoat chuong trinh
    public static void Thoat(){
        System.out.println("Hen gap lai");
    }
    
}
