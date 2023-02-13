/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;

/**
 *
 * @author nguyenthuyduong
 */
public class ComplexDemo {
    public static void main(String[] args) {
        System.out.println("Complex number no1:");
        Complex cp1 = new Complex();
        cp1.Input();
        System.out.println("Complex number no2:");
        Complex cp2 = new Complex();
        cp2.Input();
        
        //test add
        System.out.println("Addition:" + cp1.add(cp2).toString());
        
        //test subtraction
        System.out.println("Subtraction:" +  cp1.subtract(cp2).toString());
        
        //test multiply
        System.out.println("Multiply:" +  cp1.multiply(cp2).toString());
        
        //test divide
        System.out.println("Divide:" +  cp1.divide(cp2).toString());
    }
}
