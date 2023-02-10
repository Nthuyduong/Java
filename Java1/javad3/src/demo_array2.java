
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguyenthuyduong
 */
public class demo_array2 {
    public static void main(String[] args) {
        //khai bao jmang chi chuwa doi tuong sinh vien
        ArrayList<students> arr = new ArrayList();
        arr.add(new students("SV1", "Sinh vien 1", 8));
        arr.add(new students("SV2", "Sinh vien 2", 6));
        arr.add(new students("SV3", "Sinh vien 3", 9));
        //hien thi cac sinnh vien
        for(int i=0;i<arr.size();i++)
        {
            arr.get(i).Hient();
        }
        System.out.println("Su dung for...each");
        for(students sv : arr){
            sv.Hient();
        }
     }
}
