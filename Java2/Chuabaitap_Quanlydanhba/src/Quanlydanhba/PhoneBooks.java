/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlydanhba;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

/**
 *
 * @author Admin
 */
public class PhoneBooks {
    Vector<Phone> list;

    public PhoneBooks() {
        this.list = new Vector<Phone>();
        //thêm các phần tử vào danh sách
        list.add(new Phone("Họ tên 1", "11111111", "email1@a.b"));
        list.add(new Phone("Họ tên 2", "22222222", "email2@a.b"));
        list.add(new Phone("Họ tên 3", "33333333", "email3@a.b"));
    }

    public Vector<Phone> getList() {
        return list;
    }

    public void setList(Vector<Phone> list) {
        this.list = list;
    }
    public boolean addItem(Phone phone)
    {
        list.add(phone);
        return true;
    }
    public boolean updateItem(int i, Phone newPhone)
    {
        if(i<0)
            return false;
        else
        {
            list.set(i, newPhone);
        return true;
        }
    }
    public boolean updateItem(Phone oldPhone, Phone newPhone)
    {
        int i = list.indexOf(oldPhone);
        if(i>0)
        {
            updateItem(i,newPhone);
            return true;
        }
        else
            return false;
    }
    public boolean deleteItem(int i)
    {
        if(i<0)
            return false;
        else
        {
            list.remove(i);
            return true;
        }
    }
    public boolean deleteItem(Phone phone)
    {
        if(phone == null)
            return false;
        else
        {
            list.remove(phone);
            return true;
        }
    }
    //hàm ghi list ra tệp phonebook.dat
    public boolean SavetoFile(){
        if(list.isEmpty()){
            return false;
        }
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos =  new FileOutputStream("/Users/nguyenthuyduong/Documents/PhoneBooks.dat");
            oos = new ObjectOutputStream(fos);
            //thao tac ghi du lieu ra tep kieu nhi phan
            oos.write(list.size());
            for(int i = 0; i<list.size();i++){
                Phone phone = list.get(i);
                oos.writeObject(phone);
            }
        }catch(FileNotFoundException e){
            Logger.getLogger(PhoneBooks.class.getName()).log(Level.SEVERE,null,e);
        }
        catch(IOException e){
            Logger.getLogger(PhoneBooks.class.getName()).log(Level.SEVERE,null,e);
        }
        finally{
            try{
                if(fos!=null){
                    fos.close();
                }
                if(oos!=null){
                    oos.close();
                }
            }
            catch(IOException e){
                Logger.getLogger(PhoneBooks.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return true;
    }
    //hàm đọc dữ liệu từ phonebook.dat đưa vào list
    public boolean Getdatafromfile(){
        //xoa phan tu trong dnah 
        list.clear();
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("/Users/nguyenthuyduong/Documents/PhoneBooks.dat");
            ois = new ObjectInputStream(fis);
            int n = ois.readInt();
            for (int i = 0; i<n; i++){
                Phone phone = (Phone)ois.readObject();
                list.add(phone);
            }
        }
        catch(FileNotFoundException e){
            Logger.getLogger(PhoneBooks.class.getName()).log(Level.SEVERE,null,e);
        }
        
        
    }
}
