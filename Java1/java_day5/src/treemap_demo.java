
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguyenthuyduong
 */
public class treemap_demo {
    public static void main(String[] args) {
        TreeMap tudien  = new TreeMap();
        tudien.put("Cat", "Con meo");
        tudien.put("Dog", "Con cho");
        tudien.put("Pig", "Con heo");
        //neu co mot phan tu trung key thi se ghi de 
        tudien.put("Cat", "Meo");
        int n = tudien.size();
        System.out.println("So luong phan tu + " + n);
        //lay value cua mot phan tu bang key
        String v = (String)tudien.get("Cat");
        System.out.println("Nghia cua tu Cat:" + v);
        
        //duyet tat ca cac key, value trong treemap
        //lay tap hop key
        Set taphopkey = tudien.keySet();
        
    }
}
