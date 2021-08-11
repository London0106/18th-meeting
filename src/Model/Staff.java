package Model;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//1.add staff
//2.show staff
//3.using list
//4.no need assosiation
//5. nama, id, date birth
/**
 *
 * @author London
 */
public class Staff {
    private String name;
    private int date_birth, id;
    private List<Staff> staffs = new ArrayList<>();
    public Staff(){
        
    }
    public String getName(){
        return name;
    }
    public int getDate_Birth(){
        return date_birth;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDate_Birth(int date_birth){
        this.date_birth = date_birth;
    }
    public void setid(int id){
        this.id = id;
    }
    public void setStaffs(List <Staff> staffs){
        this.staffs = staffs;
    }
    public List<Staff> getStaffs(){
        return staffs;
    }
    public void addStaffs(Staff staff){
        staffs.add(staff);
    }
}
    
    