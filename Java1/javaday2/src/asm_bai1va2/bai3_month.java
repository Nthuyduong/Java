/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm_bai1va2;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class bai3_month {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";

        System.out.println("Enter a month number:");
        int month = sc.nextInt();
        System.out.println("Enter a year number:");
        int year =sc.nextInt();

        switch(month) {
            case(1):
                MonthOfName = "Jan";
                number_Of_DaysInMonth = 31;
                break;

            case(2):
                MonthOfName = "Feb";
                number_Of_DaysInMonth = 28;
                break;

            case(3):
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;

            case(4):
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;

            case(5):
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;

            case(6):
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;

            case(7):
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;

            case(8):
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;

            case(9):
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;

            case(10):
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;

            case(11):
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;

            case(12):
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
                break;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}
