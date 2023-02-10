
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguyenthuyduong
 */
public class demo_array {
    public static void main(String[] args) {
        //khai bao va khoi tao doi tuong Arraylist
        //la doi tuong dung de quan ly mang dong
        ArrayList arr = new ArrayList();
        Integer i = 10;
        Double d = 5.5;
        String str = "Java";
        students sv = new students("SV01", "Sinh vien A", 9);
        //add(object) them doi tuong vao cuoi mang
        //add thu hai la them doi vao mot vi tri bat ki
        //contains: kiem tra, tim kiem doi tuong trong mang
        //size tra ve so phan tu cua mang
        arr.add(i); //them 1 doi tuong integer vao vi tri 0;
        arr.add(d); //them 1 doi tuong Double vao vi tri 1;
        arr.add(str); // them mot chuoi vao vi tri 2
        //them doi tuong sinh vien vao vi tri 2:
        arr.add(2,sv);
        //so phan tu mang
        int n = arr.size();
        System.out.println("So phan tu:" + n);
        //lay phan tu o vi tri thu 3
        //Truoc khi lay phai ep kieu ve kieu ban dau
        String s = (String)arr.get(3);
        System.out.println("Phan tu thu 3 arr[3] la = " + s);
        
        //new array 2
        students sv2 = (students)arr.get(2);
        sv2.Hient();
    }
}
