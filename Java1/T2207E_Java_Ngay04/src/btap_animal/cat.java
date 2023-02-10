/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btap_animal;

/**
 *
 * @author nguyenthuyduong
 */
public class cat extends animal{
    public cat(String name){
        super(name);
    }
    
    public void sayHello() {
        System.out.println("Meo meo, My name is " + this.getName());
    }
}
