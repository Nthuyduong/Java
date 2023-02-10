/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_bai34;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author nguyenthuyduong
 */
public class bai4_string {
    //dem va hien thi so luong so le va so chan
//    public static void main(String[] args) {
//        String str;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap mang chuoi:");
//        str=sc.nextLine();
//        //String str = "15;11;19;98";
//        
//        int odd[] = new int[4];
//        int even[] = new int[4];
//        
//        int a = 0;
//        int b = 0;
//        
//        int demodd = 0;
//        int demeven = 0;
//        
//        String strarr[] = str.split(";");
//        
//        for(int i = 0; i<strarr.length;i++) {
//            if(Integer.parseInt(strarr[i])%2==0) {
//                even[a] = Integer.parseInt(strarr[i]);
//                a++;
//                demodd++;
//            }
//            else {
//                odd[b] = Integer.parseInt(strarr[i]);
//                b++;
//                demeven++;
//            }
//        }
//        //Dem va hien thi nhung so le trong day
//        System.out.println("Day co tat ca" + " " + demodd + " " + "so le");
//        System.out.println("Các số lẻ bao gồm:");
//        for(a=0;a<odd.length;a++) {
//           System.out.println(odd[a] + ";"); 
//        }
//        //Dem va hien thi nhung so chan trong day
//        System.out.println("Day co tat ca" + " " + demeven + " " + "so chan");
//        System.out.println("Các số lẻ bao gồm:");
//        for(b=0;b<even.length;b++) {
//           System.out.println(even[b] + ";"); 
//        } 
//    }
    
    
    //tinh tong so le va so chan
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang chuoi cach nhau boi dau ; :");
        str=sc.nextLine();
        //tach chuoi
        StringTokenizer st = new StringTokenizer(str,";");
        //kiem tra
        int tongchan = 0;
        int tongle = 0;
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            int n = Integer.parseInt(s);
            if(n%2==0){
                tongchan+=n;
            }
            else{
                tongle+=n;
            }
        }
        System.out.println("Tong chan =" + tongchan);
        System.out.println("Tong le =" + tongle);
    }
}
