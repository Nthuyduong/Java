/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap_quanlysv;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
//kieu class laf kieu tham chieu
//lop object la lop co san, moi class deu ke thua tu file nay
public class sinhvien {
    //truong hop voi public
    public String Code;
    public String Name;
    public double Mark;
    
    //xay dung ham tao, trung voi ten class
    //ham tao chay truoc khi nap du lieu
    public sinhvien() {
        this.Code = "";
        this.Name = "";
        this.Mark = 0;
    }
    //nap trong: viet nhieu ham giong ten nhung khac tham so, kieu du lieu
    //overload: nap trong hai ham tao 0 tham so
    public sinhvien(String Code, String Name, double Point) {
        this.Code = Code;
        this.Name = Name;
        this.Mark = Point;
    }
    
    //getter, setter, co hay khong phan nay deu duoc
    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double Point) {
        this.Mark = Point;
    }
    
    
   //xay dung phuong thuc nhap vaf hien thi cho student class
    //nhap thong tin cua sinh vien tu ban phim
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma SV:");
        this.Code = sc.nextLine();
        System.out.println("Ho ten SV:");
        this.Name = sc.nextLine();
        System.out.println("Diem SV:");
        this.Mark = sc.nextDouble();
        
    }
    public void Display()
    {
       System.out.println("Ma SV:" + this.Code + "Ho Ten:" + this.Name + "Diem thi:" + this.Mark);
    }
    
    
    

    //truong hop voi private
    //private string Masv;
    //private string Hoten;
    //private double Diem;
    
    //public void setMasv(string masv)
    //{
        //equal kiem tra rong hay khong
        //if(!Masv.equals(""))
            //this.Masv = masv;
        //else
            //System.out.println("Ma sinh vien khong duoc de rong");
    //}
    
    //public void Hienthi()
    //{
        //if(this.Masv.equal(""))
            //System.out.println("Ma sinh vien khong duoc de rong");
        //else
            //System.out.println("Ma SV:" + Masv);
    //}
}
