
import models.student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguyenthuyduong
 */
public class demo3 {
    public static void main(String[] args) {
        //khi su dung lop o package khac thi phai chi ro duong dan
        models.student sv1 = new models.student(); //ham tao 0 tham so
        //hoac dung cac import package chua class
        student sv2 = new student("Sinh vien 2",23); //ham tao 2 tham so
        //gan du lieu cho sv1
        sv1.hoten = "Sinh vien 1";
        sv1.Tuoi = 20;
        
        System.out.println("Sinh vien 1:");
        sv1.Display();
        System.out.println("Sinh vien 2:");
        sv2.Display();
    }
}
