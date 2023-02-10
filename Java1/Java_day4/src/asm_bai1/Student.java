/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_bai1;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class Student {
    String rollNo;
    String name;
    int age;
    int score;
    
    Student[] arr = new Student[5];
    
    public void Input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student rollNo:");
        rollNo=sc.nextLine();
        System.out.println("Enter Student name:");
        name=sc.nextLine();
        System.out.println("Enter Student age:");
        age=sc.nextInt();
        System.out.println("Enter Student score:");
        score=sc.nextInt();
    }
    
    public void Display() {
        System.out.println("RollNo:" + rollNo + "Name:" + name + "Age:" + age + "Score:" + score);
    }
    
    public void Sortbyname() {
        
    }
    
    public void SortbyScore() {
        for(int i=0;i<arr.length-1;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    Student temp;
                    //sap xep sinh vien theo chieu giam dan diem so
                    if(arr[i].score < arr[j].score)
                    {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
    }
    
    public void EnterStudent(){

        for(int i=0;i<5;i++) {
            System.out.println("Enter information of student no:" + (i+1));
            arr[i] = new Student();
            arr[i].Input();
        }
    }
    
    public void DisplayStudent() {
        for(int i=0;i<5;i++) {
            arr[i].Display();
        }
    }
    
    public static void main(String[] args) {
        Student std = new Student();
        std.EnterStudent();
        System.out.println("Student list:");
        std.DisplayStudent();
        std.SortbyScore();
        System.out.println("List of students in Score descending order");
        std.DisplayStudent();
    }

}
