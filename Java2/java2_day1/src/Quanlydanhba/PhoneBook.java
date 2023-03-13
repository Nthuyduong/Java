/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlydanhba;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenthuyduong
 */
public class PhoneBook {
    
    Vector<Phone> list;

    public PhoneBook() {
        this.list = new Vector<Phone>();
        list.add(new Phone("Ho ten 1","123","email1@a.b"));
        list.add(new Phone("Ho ten 2","456","email2@a.b"));
        list.add(new Phone("Ho ten 3","789","email3@a.b"));
    }

    public Vector<Phone> getList() {
        return list;
    }

    public void setList(Vector<Phone> list) {
        this.list = list;
    }
    //them mot doi tuong vao trong mang
    public boolean additem(Phone phone){
        list.add(phone);
        return true;
    }
    //update doi tuong trong mang
    public boolean updateitem(Phone oldphone, Phone newphone){
        int i = list.indexOf(oldphone);
        //i=-1 nghia la trong list khong co doi tuong do
        if(i<0){
           return false;
        }
        else{
            list.set(i, newphone);
            return true;
        }
    }
    //xoa doi tuong ra khoi mang
    public boolean deleteitem(Phone phone){
        if(phone == null){
            return false;
        }
        else{
            list.remove(phone);
            return true;
        }
    }
    //hàm ghi list ra tệp phonebook.dat
    public boolean SavetoFile(String filePath){
        if(list.isEmpty()){
            return false;
        }
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos =  new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            //thao tac ghi du lieu ra tep kieu nhi phan
            oos.write(list.size());
            for(int i = 0; i<list.size();i++){
                Phone phone = list.get(i);
                oos.writeObject(phone);
            }
        }catch(FileNotFoundException e){
            Logger.getLogger(PhoneBook.class.getName()).log(Level.SEVERE,null,e);
        }
        catch(IOException e){
            Logger.getLogger(PhoneBook.class.getName()).log(Level.SEVERE,null,e);
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
                Logger.getLogger(PhoneBook.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return true;
    }
    //hàm đọc dữ liệu từ phonebook.dat đưa vào list
    public boolean Getdatafromfile(String filePath){
        //xoa phan tu trong dnah 
        list.clear();
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            int n = ois.readInt();
            for (int i = 0; i<n; i++){
                Phone phone = (Phone)ois.readObject();
                list.add(phone);
            }
        }
        catch(FileNotFoundException e){
            Logger.getLogger(PhoneBook.class.getName()).log(Level.SEVERE,null,e);
            return false;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
        finally{
            try{
               if(ois!=null)
                    ois.close(); 
            }
            catch(Exception e){
                
            }
        }
        return true;
    }
}
