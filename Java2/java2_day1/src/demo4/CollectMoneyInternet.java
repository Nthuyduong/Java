/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo4;

import java.util.Scanner;

/**
 *
 * @author nguyenthuyduong
 */
public class CollectMoneyInternet extends CollectMoney{

    double sothang;

    public CollectMoneyInternet() {
    }

    public CollectMoneyInternet(double sothang) {
        this.sothang = sothang;
    }

    public double getSothang() {
        return sothang;
    }

    public void setSothang(double sothang) {
        this.sothang = sothang;
    }
    
    @Override
    public double calculateMoney(){
       double dongia = 285000;
       double thanhtien = 0;
       if(this.sothang<3){
           thanhtien = this.sothang*dongia;
       }
       else if(this.sothang>=3 && this.sothang<6){
           thanhtien = this.sothang*dongia*0.95;
       }
       else if(this.sothang>=6){
           thanhtien = this.sothang*dongia*0.9;
       }
       return thanhtien;
    }
}
