/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qldb;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author nguyenthuyduong
 */
public class main {
    //Thêm danh bạ. Yêu cầu kiểm tra nếu số điện thoại đã tồn tại thì không cho thêm vào.
    //Hiển thị toàn bộ danh bạ.
    //Tìm kiếm: Nhập vào từ khóa và hiện chi tiết các phần tử trong danh bạ có chứa tên đó
    //Xóa: nhập vào tên hoặc số điện thoại, xóa các phần tử có tên hoặc số điện thoại đó
    //Sửa: nhập vào tên, cho phép sửa số điện thoại nếu tìm thấy tên đó
    
    static ArrayList<PhoneNumber> danhba = new ArrayList<PhoneNumber>();

    public static void Menu(){
        System.out.println("---DANH BA---");
        System.out.println("1: Them danh ba");
        System.out.println("2. Hien thi danh ba");
        System.out.println("3: Tim kiem");
        System.out.println("4: Xoa");
        System.out.println("5: Sua");
        System.out.println("6: Thoat");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ID;
        
        do{
            Menu();
            System.out.println("Moi chon so:");
            ID = sc.nextInt();
            switch(ID){
                case 1:
                    Nhap();
                    break;
                case 2:
                    Hien();
                    break;
                case 3:
                    Timkiem();
                    break;
                case 4:
                    Xoa();
                    break;
                case 5:
                    Sua();
                    break;
                case 6:
                    Thoat();
                    break;
                default:
                    System.out.println("Please choose a number");
            }
        }while(ID!=6);
    }
    
    //Nhap
    public static void Nhap(){
        PhoneNumber a = new PhoneNumber();
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap sdt");
        str = sc.nextLine();
        boolean check =false;
        for(int i=0; i<danhba.size();i++){
            if(danhba.get(i).getPhone().equalsIgnoreCase(str)){
                check = true;
            }
        }
        if(check){
            System.out.println("So dien thoai da ton tai");
        }
        else{
            a.Input(str);
            danhba.add(a);
        }
        
    }
    //Hien thi
    public static void Hien(){
        if(danhba.isEmpty()){
            System.out.println("Danh ba trong");
        }
        for(int i =0; i<danhba.size();i++){
            danhba.get(i).Display();
        }
    }
    //Tim kiem ten trong danh ba
    public static void Timkiem(){
        ArrayList temphone = new ArrayList();
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can tim kiem");
        str= sc.nextLine();
        for(int i=0; i<danhba.size();i++){
            if(danhba.get(i).getName().equalsIgnoreCase(str)){
                temphone.add(danhba.get(i));
            }
        }
    }
    
    //Xoa
    public static void Xoa(){
        boolean timthay = false;
        String st;
        System.out.println("Nhap sdt");
        Scanner sc = new Scanner(System.in);
        st = sc.nextLine();
        for(int i =0; i<danhba.size();i++){
            if(danhba.get(i).getName().equalsIgnoreCase(st)
                    && danhba.get(i).getPhone().equalsIgnoreCase(st))
            {
                danhba.remove(i);
                timthay = true;
            }
        }
        if(timthay){
            System.out.println("Xoa thanh cong");
        }
        else{
            System.out.println("Khong tim thay");
        }
    }
    
    //Sua
    public static void Sua(){
        Name st = new Name();
        Scanner sc = new Scanner(System.in);
        st.Input();
        for(int i =0; i<danhba.size();i++){
            if(danhba.get(i).getName().equalsIgnoreCase(st.getName())){
                System.out.println("Nhap sdt moi");
                String str;
                str = sc.nextLine();
                danhba.get(i).setPhone(str);
            }
        }
    }
    
    //Thoat
    public static void Thoat(){
        System.out.println("Thoat chuong trinh");
    }
}
