/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_string;

/**
 *
 * @author nguyenthuyduong
 */
public class search_string {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bc";
        int i;
        i = s1.indexOf(s2); //tim thay s2 trong s2 tai vi tri i = 1
        
        s1 = "abcd";
        s2 = "ac";
        i = s1.indexOf(s2); //tim thay s2 trong s2 tai vi tri i = 0
        
        s1 = "abc";
        s2 = "xy";
        i = s1.indexOf(s2); //khong tim thay s2 trong s1
    }
}
