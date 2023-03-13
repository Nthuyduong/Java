/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlydanhba;

/**
 *
 * @author nguyenthuyduong
 */
public class Phone {
    String Name;
    String Phone;
    String Email;

    public Phone() {
    }

    public Phone(String Name, String Phone, String Email) {
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Phone{" + "Name=" + Name + ", Phone=" + Phone + ", Email=" + Email + '}';
    }
    
    
}
