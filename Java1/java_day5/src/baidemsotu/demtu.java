/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baidemsotu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author nguyenthuyduong
 */
public class demtu {
    
    ArrayList<String> al;//lưu các chuỗi nhập từ bàn phím
    TreeMap<String,Integer> tm;//lưu các từ tác ra vào key, số lần vào value
    //cấu tử khởi tạo
    public demtu()
    {
        al = new ArrayList<String>();
        tm = new TreeMap<String,Integer>();
    }
    //Nhap chuoi
    public void Input(){
        if(!al.isEmpty())
        {
            al.clear();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi (nhan Enter de thoat");
        while(true){
            String s = sc.nextLine();
            if(s.equals(""))
                break;
            else{
                al.add(s);
            }
        }
    }
    //
    public void Count(){
        if(!tm.isEmpty())
        {
            tm.clear();
        }
        for(int i=0;i<al.size();i++)
        {
            String[] str = al.get(i).split(" ");
            for(int j=0; j<str.length;j++)
            {
                if(!tm.containsKey(str[j]))
                {
                    tm.put(str[j],1);
                }
                else
                {
                    //lay value cua key j
                    int n = tm.get(str[j]).intValue();
                    tm.put(str[j], n+1);
                }
            }
        }
    }
    //
    public void Display()
    {
        System.out.println("Ket qua");
        for(String ht : tm.keySet())
        {
           int dem = tm.get(ht);
           System.out.println(ht + dem);
        }
    }
    
}
