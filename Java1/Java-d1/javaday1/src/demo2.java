
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguyenthuyduong
 */
public class demo2 {
    public static void main(String[] args) {
        String hoten; //khai bao kieu 
        int tuoi; //khai bao kieu so 
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nhap ho ten");
        hoten = sc.nextLine(); //dung man hinh doi nhap chuoi
        
        System.out.print("Nhap tuoi");
        tuoi = sc.nextInt(); //dung man hinh doi nhap tuoi
       
        System.out.println("Ho ten:" + hoten);
        System.out.println("Tuoi:" + tuoi);
    }
}
