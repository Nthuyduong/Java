/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap_zoo;

/**
 *
 * @author nguyenthuyduong
 */
public class Animal {
    private String Name;

    public Animal(){
        
    }
    
    public Animal(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public void SayHello(){
        System.out.println("Xin chao, toi la dong vat, ten toi la " + this.getName());
    }
}
