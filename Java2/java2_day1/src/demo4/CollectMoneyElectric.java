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
public class CollectMoneyElectric extends CollectMoney{
    public double chisodau;
    public double chisocuoi;

    public CollectMoneyElectric() {
    }

    public CollectMoneyElectric(double chisodau, double chisocuoi) {
        this.chisodau = chisodau;
        this.chisocuoi = chisocuoi;
    }

    public double getChisodau() {
        return chisodau;
    }

    public void setChisodau(double chisodau) {
        this.chisodau = chisodau;
    }

    public double getChisocuoi() {
        return chisocuoi;
    }

    public void setChisocuoi(double chisocuoi) {
        this.chisocuoi = chisocuoi;
    }
    
    @Override
    public double calculateMoney(){
        double dongia = 2500;
        double thanhtien = 0;
        double tieuthu = this.chisocuoi - this.chisodau;
        if(tieuthu <100){
            thanhtien = tieuthu*dongia;
        }
        else if(100<=tieuthu && tieuthu<300){
            thanhtien = tieuthu*dongia*1.05;
        }
        else if(tieuthu>=300){
            thanhtien = tieuthu*dongia*1.1;
        }
        return thanhtien;
    }
}
