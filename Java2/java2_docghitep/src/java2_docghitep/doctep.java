/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2_docghitep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenthuyduong
 */
public class doctep {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String tentep;
        System.out.println("Moi nhap duong dan ten tep");
        tentep = sc.nextLine();
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            fr = new FileReader(tentep);
            br = new BufferedReader(fr);
            
            String str;
            System.out.println("Noi dung tep");
            while((str = br.readLine())!=null){
                System.out.println(str);
            }
        }
        catch(FileNotFoundException e){
            Logger.getLogger(doctep.class.getName()).log(Level.SEVERE,null,e);
        }
        catch(IOException e){
            Logger.getLogger(doctep.class.getName()).log(Level.SEVERE,null,e);
        }
        finally{
            try{
                if(br!=null){
                    br.close();
                }
                if(fr!=null){
                    fr.close();
                }
            }catch(IOException e){
            Logger.getLogger(doctep.class.getName()).log(Level.SEVERE,null,e);
            }
        }
    }
}
