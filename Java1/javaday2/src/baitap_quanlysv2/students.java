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
public class students {
    public String Masv;
    public String Hoten;
    public double Diemso;
    
    //xay dung cac ham tao
    //ham tao truoc khi nap du lieu
    public students() {
        this.Masv = "";
        this.Hoten = "";
        this.Diemso = 0;
    }
    
    //overload
    public students(String Masv, String Hoten, double Diemso) {
        this.Masv = Masv;
        this.Hoten = Hoten;
        this.Diemso = Diemso;
    }
    
    //getter setter
    public String getMasv(){
        return Masv;
       
   }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public double getDiemso() {
        return Diemso;
    }

   
    public void setDiemso(double Diemso) {
        this.Diemso = Diemso;
    }
    
    //xay dung phuong thuc nhap
    public void Nhaptt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        this.Masv = sc.nextLine();
        System.out.println("Nhap ho va ten");
        this.Hoten = sc.nextLine();
        System.out.println("Nhap diem so");
        this.Diemso = sc.nextDouble();
    }
    
    //xay dung phuong thuc hien thi
    public void Hient()
    {
        System.out.println("Ma sinh vien: " + this.Masv + "Ho ten: " + this.Hoten + "Diem so: " +this.Diemso);
    }
    
    //Sap xep theo diem giam dan
    
    //Arrays.sort(arrsv, Comparator.comparing(students::getDiemso));
    //System.out.println(arrsv);
    
}
