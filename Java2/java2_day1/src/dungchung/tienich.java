/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungchung;

/**
 *
 * @author nguyenthuyduong
 */
public class tienich {
    public static boolean isNumeric(String str){
        if(str == null){
            return false;
        }
        try{
            Double.parseDouble(str);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
