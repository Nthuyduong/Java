/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap_quanlysv;

/**
 *
 * @author nguyenthuyduong
 */
public class demo1 {
    public static void main(String[] args) {
        //public
     
        //reference data type
        //khai bao bien sv kieu du lieu la class
        sinhvien sv; //sv = null
        //lenh duoi se error do chua khoi tao doi tuong cho sv
        //can khoi tao doi tuong (Object/Instance) truoc
        //new de goi Constructor cua lop Sinhvien
        sv = new sinhvien();
      
        sv.Code = "NV0";
        sv.setName("Nguyen Van A");
        sv.setMark(9.5);
        sv = new sinhvien("NV2","Le Thi A",8.5);
        sv.Display(); //hien thi sinh vien moi
        
        //thong thuong khai bao va khoi tao doi tuong cung mot dong nhu sau
        sinhvien sv2 = new sinhvien();
        
        System.out.println("Nhap sv2");
        sv2.Nhap();
        
        //gan doi tuong cua sv2 dang tham chieu vao sv3
        sinhvien sv3 = sv2;
        System.out.println("Thong tin sv2");
        //tuong duong sv2 hien thi: sv2.Diplay();
        sv3.Display();
        
        
        //private
        
        //doi voi mang thi phai khoi tao gia tri dau tien 
        //lenh nay chi tao ra 3 con tro, nhung gia tri van la null!
        //sinhvien[] svarr = new sinhvien[3];
        //khoi tao 3 doi tuong
        //for(int i=0; i<svarr.length;i++){
            //svarr[i] = new sinhvien();
        //}
        //Nhap 3 doi tuong
        //for(int i=0; i<svarr.length;i++){
            //svarr[i].Nhap();
        //}
        //Hien thi 3 doi tuong
        //for(int i=0; i<svarr.length;i++){
           // svarr[i].Display();
        //}
                
        
    }
}
