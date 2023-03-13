/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;

import java.util.Vector;
import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class StudentManager {
    
    Vector<Student> list;
    
    public StudentManager(){
        this.list = new Vector<Student>();
    }
    
    //Them moi mot sinh vien
    public void AddStudent(){
        Scanner sc = new Scanner(System.in);
        String res;
        while(true){
            Student st = new Student();
            st.Input();
            list.add(st);
            System.out.print("Continue? (Y/N)");
            res = sc.nextLine();
            if(res.equalsIgnoreCase("n"))
            {
                break;
            }
        }
    }
    
    //Hien thi ra man hinh
    public void DisplayStudent()
    {
        if(list.isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
        System.out.format("\n% -10s    % -25s  %-7d", "  EnrollID", "Full Name", "Age");
        System.out.format("\n----------   -----------------------------  ----------");
        
        for(Student st : list)
        {
            st.Display();
        }
    }
}
