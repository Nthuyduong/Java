
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguyenthuyduong
 */
public class treemap_giohang {
    public static void main(String[] args) {
        //xac dinh kieu du lieu cua key, value
        TreeMap<String,Integer> cart = new TreeMap<String,Integer>();
        cart.put("SP01",1);
        cart.put("SP02",3);
        cart.put("SP03",4);
        cart.put("SP04",2);
        //ghi de san pham SP01
        cart.put("SP01",4);
        System.out.println("Hien thi gio hang");
        //tu dong duyet tat ca key trong treemap
        for(String maps : cart.keySet()){
            int soluong = cart.get(maps);
            System.out.println(maps + ":" + soluong);
        }
        //tim kiem mot phan tu co hay khogn
        String st = "SP01";
        boolean b = cart.containsKey("st");
        if(b){
            System.out.println("Co ma san pham" + st);
        }
        else{
            System.out.println("Khong co san pham" + st);
        }
    }
}
