/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap_zoo;

import java.util.ArrayList;

/**
 *
 * @author nguyenthuyduong
 */
public class zoo {
    ArrayList<Animal> listAnimal = new ArrayList<Animal>();
    
    // them con vat
    public void add(Animal a){
        listAnimal.add(a);
        System.out.println("Da them con vat thanh cong");
    }
    
    //xoa con vat
    public void remove(String name){
        for(int i = 0; i<this.listAnimal.size(); i++){
            if(this.listAnimal.get(i).getName().equalsIgnoreCase(name)){
                Animal a = this.listAnimal.get(i);
                this.listAnimal.remove(a);
                System.err.println("Xoa thanh cong");
            }
        }
    }
    
    public void SayHello() {
        for (Animal animal : this.listAnimal) {
            animal.SayHello();
        }
    }
}
