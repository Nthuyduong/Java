/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical_exam;

/**
 *
 * @author nguyenthuyduong
 */
public class Book extends Author{
    public String Title;
    public Double Price;

    public Book(String Title, Double Price, String FirstName, String LastName) {
        super(FirstName, LastName);
        this.Title = Title;
        this.Price = Price;
    }
    
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public void Display(){
        super.Display();
        System.out.println("Book's title is:" + this.Title);
        System.out.println("Price of book:" + this.Price);
    }
}
