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
public class quanlysv {
    
        //khoi tao mang doi tuong
        students[] arrsv;
        int n;
        
        public quanlysv()
        {
            n=0;
            //tao mang 30 tham chieu sinh vien
            arrsv = new students[30];
        }
        
        //Khoi tao 30 sinh vien
        public int Nhapsinhvien()
        {
            Scanner sc = new Scanner(System.in);
            do{
                //Nhap so luong sinh vien (N)
                System.out.println("Nhap so luong sinh vien");
                n = sc.nextInt();
            }
            while(n<1 || n>30);
            
            //Ham nhap cho phep nhap N sinh vien va thong tin N sinh vien
            for(int i=0; i<n; i++)
            {
                System.out.println("Sinh vien thu" + (i+1) + ":");
                //tao doi tuong sinh vien cho phan tu thu i
                arrsv[i] = new students();
                arrsv[i].Nhaptt();
            }
        }
        
        public void Hienthisinhvien()
        {
            //Ham hien thi thong tin N sinh vien
            for(int i=0; i<n; i++)
            {
                arrsv[i].Hient();
            }
        }
        
        public void Sapxepsinhvien()
        {
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<i;j++){
                    students temp;
                    if(arrsv[i].Diemso < arrsv[j].Diemso)
                    {
                        temp = arrsv[i];
                        arrsv[i] = arrsv[j];
                        arrsv[j] = temp;
                        
                    }
                }
            }
        }
    
}
