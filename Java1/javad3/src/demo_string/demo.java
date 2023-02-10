/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_string;

/**
 *
 * @author nguyenthuyduong
 */
public class demo {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "acb";
        //Compare to ignore case la so sanh khong phan biet hoa thuong
        int n = s1.compareTo(s2);
        if(n<0)
        {
            System.out.println("s1 nho hon s2");
        }
        else if(n == 0)
        {
            System.out.println("s1 bang s2");
        }
        else
        {
            System.out.println("s1 > s2");
        }
        //so sanh chuoi bang hoac khac
        boolean b =s1.equals(s2);
        if(b==true)
        {
            System.out.println("s1 bang s2");
        }
        else
        {
            System.out.println("s1 khac s2");
        }
    }
}
