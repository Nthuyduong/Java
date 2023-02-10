/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

/**
 *
 * @author nguyenthuyduong
 */
public class main {
    public static void main(String[] args) {
        Triangle trg = new Triangle();
        trg.Input();
        trg.Perimeter();
        trg.Area();
        trg.Display();
        Triangle eTrg = new Etriangle();
        eTrg.Input();
        eTrg.Perimeter();
        eTrg.Area();
        eTrg.Display();
      
    }
}
