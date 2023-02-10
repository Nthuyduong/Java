/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btap_animal;

/**
 *
 * @author nguyenthuyduong
 */
public class main {
    public static void main(String[] args) {
        animal a = new animal("Maica");
        show(a);
        animal d = new dog("Hecules");
        show(d);
        animal c = new cat("Tom");
        show(c);
    }
    
    public static void show(animal a) {
        a.SayHello();
    }
}
