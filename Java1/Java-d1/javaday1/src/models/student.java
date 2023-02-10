/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author nguyenthuyduong
 */

//khai bao lop student de chua cac thong tin va hanh dong cua sinh vien
public class student {
    //khai bao cac thuoc tinh
    public String hoten;
    public int Tuoi;
    //ham tao de khoi tao doi tuong, dung sau lenh new de khoi tao doi tuong 
    //constructor: cho phep dat cac lenh duoc tu dong chay khi 1 doi tuong
   
    public student() {
        hoten = "";
    }
    
    //overload (nạp trồng) thêm 1 hàm tạo nữa với 2 tham 
    public student(String hoten, int Tuoi) {
        //this là con tro dể truy cập tới các thàh phần nội bộ của l
        this.hoten = hoten;
        this.Tuoi = Tuoi;
    }
    
   //xay dựng các phương thức cho lớp
    public void Display(){
        System.out.println("Ho ten:" + hoten + "Tuoi:" + Tuoi);
    }
    
    
}
