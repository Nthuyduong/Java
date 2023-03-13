package Buoc1;



import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class StudentManager {
    private ArrayList<Student> list;

    public StudentManager() {
        list = new ArrayList();
    }
    public void InputList()
    {
        Scanner sc = new Scanner(System.in);
        String res;
        while(true)
        {
            Student st = new Student();
            System.out.println("Nhập sinh viên mới:");
            st.Input();
            list.add(st);
            System.out.print("Tiếp tục? (c/k):");
            res = sc.nextLine();
            if(res.equalsIgnoreCase("k"))
                break;
        }
    }
    public void DisplayList()
    {
        if(list.isEmpty())
        { 
            System.out.println("List is empty");
            return;
        }   
        System.out.format("\n%-11s       %-25s  %-7s",
                "  EnrolID","Full Name", "Age");
        System.out.format("\n-----------  ------------------------------  -------");
        for(Student st : list)
        {
            st.Display();
        }
        
    }
}
