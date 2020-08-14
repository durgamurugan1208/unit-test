/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class fooditem {
    public static void main(String[] args) { 
    
        food s=new food("lunch",15.3);
        System.out.println(s.getname());
        System.out.println(s.gettype());
        System.out.println(s.getprice());
        System.out.println(s);
    }
}
       
       
        
    

    class food{
             String name;
             String type;
             double price;
    
    String getname()
    {
        return name;
    }
    String gettype()
    {
        return type;
    }
    double getprice()
    {
        return price;
    }
 
 
    public String tostring()
    {
      return "Name"+name+"type"+type+"price"+price;
    }
    }
      
                
    
 


    
        
 
