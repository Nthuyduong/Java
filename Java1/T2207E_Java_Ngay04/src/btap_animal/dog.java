/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btap_animal;

/**
 *
 * @author nguyenthuyduong
 */
public class dog extends animal{
    public dog(String name){
        super(name);
    }
    
    public void sayHello() {
        System.out.println("Woof woof, My name is " + this.getName());
    }
}
