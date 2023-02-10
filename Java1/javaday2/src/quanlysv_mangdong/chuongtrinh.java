/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysv_mangdong;

/**
 *
 * @author nguyenthuyduong
 */
public class chuongtrinh {
    public static void main(String[] args) {
        Quanlysv sl = new Quanlysv();
        sl.InputSV();
        sl.HienThiSV();
        sl.SapxepSV();
        System.out.println("Danh sach sau khi sắp xếp:");
        sl.HienThiSV();
    }
}
