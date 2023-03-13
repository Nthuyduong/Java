/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java2_docghitep;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenthuyduong
 */
public class ghitep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tentep;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap duong dan ten tep moi");
        tentep = sc.nextLine();
        //tao file ghi tep van ban
        FileOutputStream fo = null;
        //dung de ghi tep
        PrintWriter pw = null;
        try{
            fo = new FileOutputStream(tentep, true);
            pw = new PrintWriter(fo);
            String str;
            while(true){
                System.out.println("Nhap chuoi (enter de ket thuc)");
                str = sc.nextLine();
                if(str.equals("")){
                    break;
                }
                else{
                    pw.println(str);
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Khong tao duoc tep");
            Logger.getLogger(doctep.class.getName()).log(Level.SEVERE, null, e);
        }
        finally{
            try{
                if(pw!=null){
                    pw.close();
                }
                if(fo!=null){
                    fo.close();
                }
            }catch(IOException e){
                Logger.getLogger(doctep.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
}
