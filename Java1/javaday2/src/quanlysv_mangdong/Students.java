/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysv_mangdong;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class Students {
    String MaSV;
    String HotenSV;
    double DiemsoSV;
    
    public void NhapSV() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ma so sinh vien");
        this.MaSV=sc.nextLine();
        System.out.println("Nhap ho ten sinh vien");
        this.HotenSV=sc.nextLine();
        System.out.println("Nhap diem so sinh vien");
        this.DiemsoSV=sc.nextDouble();
    }
    
    public void HienSV() {
        System.out.println("Mã SV: " + this.MaSV
            + ", Họ tên:" + this.HotenSV + ", Điểm;" + this.DiemsoSV);
    }
    

}
