/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class Complex {
    public double realPart;
    public double imaginaryPart;
    
    public Complex(){
        
    }
    
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    
    public Complex add(Complex otherNumber){
        double newRealPart = this.realPart + otherNumber.realPart;
        double newImaginaryPart = this.imaginaryPart + otherNumber.imaginaryPart;
        return new Complex (newRealPart, newImaginaryPart);
    }
    
    public Complex subtract(Complex otherNumber){
        double newRealPart = this.realPart - otherNumber.realPart;
        double newImaginaryPart = this.imaginaryPart - otherNumber.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }
    
    public Complex multiply(Complex otherNumber){
        double newRealPart = this.realPart * otherNumber.realPart - this.imaginaryPart * otherNumber.imaginaryPart;
        double newImaginaryPart = this.realPart * otherNumber.imaginaryPart + this.imaginaryPart * otherNumber.realPart;
        return new Complex(newRealPart, newImaginaryPart);
    }
    
    public Complex divide(Complex otherNumber){
        double denominator = otherNumber.realPart * otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart;
        double newRealPart = (this.realPart * otherNumber.realPart + this.imaginaryPart * otherNumber.imaginaryPart) / denominator;
        double newImaginaryPart = (this.imaginaryPart * otherNumber.realPart - this.realPart * otherNumber.imaginaryPart) / denominator;
        return new Complex(newRealPart, newImaginaryPart);
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part");
        this.realPart = sc.nextDouble();
        System.out.println("Enter the imaginary part");
        this.imaginaryPart = sc.nextDouble();
    }
}
