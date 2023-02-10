/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap_zoo;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class main {
    static zoo Zoo = new zoo();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MenuID;
        do{
            menu();
            System.out.println("Moi chon:");
            MenuID = sc.nextInt();
            switch(MenuID){
                case 1:
                    them();
                    break;
                case 2:
                    xoa();
                    break;
                case 3:
                    sayhello();
                    break;
                case 4:
                    thoat();
                    break;
            }
        }while(MenuID != 4);
    }
    //menu
    public static void menu(){
        System.out.println("---MENU HERE---");
        System.out.println("1. Them mot con vat");
        System.out.println("1. Xoa mot con vat");
        System.out.println("1. Say hello");
        System.out.println("4. Thoat chuong trinh");
    }
    //them
    public static void them(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten con vat: ");
        Animal a = new Animal(sc.nextLine());
        Zoo.add(a);
    }
    //xoa
    public static void xoa(){
        if(Zoo.listAnimal.isEmpty()){
            System.out.print("Chua co con vat nao");
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ten con vat muon xoa: ");
            Zoo.remove(sc.nextLine());
        }
    }
    //say
    public static void sayhello(){
        if(Zoo.listAnimal.isEmpty()){
            System.out.print("Chua co con vat nao");
        }
        else{
            Zoo.SayHello();
        }
    }
    //thoat
    public static void thoat(){
        System.out.println("Ket thuc chuong trinh");
    }
}
