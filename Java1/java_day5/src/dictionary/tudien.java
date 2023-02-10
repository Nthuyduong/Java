/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dictionary;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author nguyenthuyduong
 */
public class tudien {
    TreeMap<String, String> td;
    public tudien()
    {
        td = new TreeMap<String, String>();
    }
    //Khoi tao ham them tu moi
    public boolean Themtu(String ta, String tv)
    {
        //Neu tu tieng anh hoac tieng viet rong thi false
        if(ta.equals("") || tv.equals(""))
        {
            return false;
        }
        //Neu tu tieng anh da co thi false
        if(td.containsKey(ta))
        {
            return false;
        }
        //nhap tu td
        td.put(ta,tv);
        return true;
    }
    //Khoi tao ham hien thi
    public void Hienthi()
    {
        for(String ta:td.keySet())
        {
            String tv = td.get(ta);
            System.out.println(ta + ":" + tv);
        }
    }
    //Tra tu dien
    public String Tratu(String ta)
    {
        if(td.containsKey(ta)==false || td.isEmpty())
        {
            return "";
        }
        return td.get(ta);
    }
    //Khoi tao ham sua tu
    public boolean Suatu(String ta, String tv)
    {
        if(td.containsKey(ta))
        {
            td.put(ta,tv);
            return true;
        }
        return false;
    }
    //Khoi tao ham xoa tu
    public boolean Xoatu(String ta)
    {
        if(td.containsKey(ta))
        {
            td.remove(ta);
            return true;
        }
        return false;
    }
    
}
