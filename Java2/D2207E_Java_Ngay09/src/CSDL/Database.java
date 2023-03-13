/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenthuyduong
 */
public class Database {
    public static String user = "root";
    public static String pass = "root";
    public static String url = "jdbc:mysql://localhost:3306/Java_T2207E?useUnicode=true&characterEncoding=utf8";
    public static Connection KetnoiCSDL(){
        Connection cnn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//tải thư viện com.mysql.jdbc.Driver
            cnn = DriverManager.getConnection(url,user,pass);//kết nối đến CSDL với thông tin trong url
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnn;//trả về kết nối CSDL
    }
}
