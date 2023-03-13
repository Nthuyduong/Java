/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam_java2;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author nguyenthuyduong
 */
public class HashMap {
    Vector<Contact> list;
    
    public HashMap(){
        this.list = new Vector<Contact>();
    }
    
    //Add new contact
    public void AddContact(){
        Scanner sc = new Scanner(System.in);
        String res;
        while(true){
            Contact st = new Contact();
            st.InputContact();
            list.add(st);
            System.out.print("Continue? (Y/N)");
            res = sc.nextLine();
            if(res.equalsIgnoreCase("n"))
            {
                break;
            }
        }
    }
    
    //Find contact by name
    public void FindContact(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean found = false;
        for (Contact contact : list) {
            if (contact.getName().equals(name)) {
                System.out.println("Here is" + " " + contact.getName() + " " + "phone: " + contact.getPhone());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
    
    //Display contacts
    public void DisplayContact()
    {
        if(list.isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
        System.out.println("\nAdress Book");
        System.out.println("Contact Name" + "     " + "Phone Number");
        
        for(Contact st : list)
        {
            st.Display();
        }
    }
}
