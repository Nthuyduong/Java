/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysv_mangdong;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class Quanlysv {
    
        //khai báo mảng chỉ chứa đối tượng Sinhvien
        ArrayList<Students> arr = new ArrayList<Students>();
        public Quanlysv()
        {

        }
        
        //Nhap sinh vien
        public void InputSV()
        {
            Scanner sc = new Scanner(System.in);
            int n=0;
            String s;
            
            do
            {   n++;
                //Tao 1 sinh vien moi
                Students sv = new Students();
                //Nhap thong tin sinh vien thu i
                System.out.println("Nhap sinh vien thu" + n);
                sv.NhapSV();
                //Dua sv vao chuoi ArrayList
                arr.add(sv);
                //Nhap tiep hay khong?
                System.out.println("Co muon nhap them sinh vien hay khong? (C/K)");
                s=sc.nextLine();
                
            }
            while(s.equalsIgnoreCase("c"));//K -> False -> ket thuc nhap sv
        }
  
        public void HienThiSV()
        {
            System.out.println("Danh sach sinh vien da nhap");
            for(int i=0; i<arr.size(); i++)
            {
                arr.get(i).HienSV();
            }
        }
        
        public void SapxepSV()
        {
            for(int i=0;i<arr.size()-1;i++)
            {
                for(int j=i+1;j<arr.size();j++)
                {
                    Students temp;
                    //sap xep sinh vien theo chieu giam dan diem so
                    if(arr.get(i).DiemsoSV < arr.get(j).DiemsoSV)
                    {
                        temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                }
            }
        }
}
