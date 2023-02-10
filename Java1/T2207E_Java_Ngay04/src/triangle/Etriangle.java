/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class Etriangle extends Triangle{
      
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao canh cua tam giac deu: ");
        int canh = sc.nextInt();
        this.setA(canh);
        this.setB(canh);
        this.setC(canh);
    }
    
}