/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btap_animal;

/**
 *
 * @author nguyenthuyduong
 */
public class animal {
    private String name;

    public animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void SayHello(){
        System.out.println("Hello, I'm Animal, My name is " + this.getName());
    }
}
