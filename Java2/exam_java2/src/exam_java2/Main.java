/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam_java2;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class Main {
    public static int inputInt()
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        while(true)
        {
            try{
                String str = sc.nextLine();
                n = Integer.parseInt(str);
                //n = sc.nextInt();
                return n;  
            }
            catch(NumberFormatException e)
            {
                System.out.println("Mời nhập số nguyên");
            }
        }
    }
    
    public static int Menu()
    {
        int choice;
        System.out.println("\n-----  MENU  -----");
        System.out.println("1. Add new contact");
        System.out.println("2. Find a contact by name");
        System.out.println("3. Display contacts");
        System.out.println("4. Exit");
        choice = inputInt();
        return choice;
                
    }
    
    public static void main(String[] args) {
        HashMap stm = new HashMap();
        int choice;
        do{
            choice = Menu();
            //xử lý chọn
            switch(choice)
            {
                case 1:
                    System.out.println("Add new contact");
                    stm.AddContact();
                    System.out.println("Input Completed");
                    break;
                case 2:
                    System.out.println("Find contact by name");
                    break;
                case 3:
                    System.out.println("Display contacts");
                    stm.DisplayContact();
                    break;
                case 4:
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Pls, Input 1-4");
            }
        }while(choice!=4);
    }
}
