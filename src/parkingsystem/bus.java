/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingsystem;

/**
 *
 * @author Dell G5 15
 */
public class bus extends vehicle 
{
    static int []slots=new int[26];
        
    int id;
    String type;
    int c;
    
    public bus(int i, String t)
    {
        this.id=i;
        this.type=t;
    }
    
    public void adding_vehicle(int id)
    {
        boolean ch=false;
        for(int i=0;i<slots.length;i++)
        {
            if(slots[i]==0)
            {
                slots[i]=id;
                ch=true;
                break;
            }
            
        }
        if(ch==false)    
            System.out.println("There is no empty place");
    }
    
     public void removing_vehicle(int id)
    {
        boolean b=false;
        for(int i=0;i<slots.length;i++)
        {
            if(slots[i]==id)
            {
                slots[i]=0;
                b=true;
                break;
            }
            
        }
        if(b==false)
            System.out.println("Your car is not there");
    }
     
    public void print_array()
    {
         for(int i=0;i<slots.length;i++)
        {
            System.out.print(slots[i]+" ");
        }
    }
    public void count()
    {
        for(int i=0;i<slots.length;i++)
        {
            if(slots[i]!=0)
                c++;
        }
        System.out.println("the no of not available places is "+c);
        System.out.println("the no of available places is "+(26-c));
    }
    public double calcMoney(double re,int a)
    {
        return re*a;
    }
}
