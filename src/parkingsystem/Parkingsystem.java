/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkingsystem;

import java.util.Scanner;

public class Parkingsystem 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double[] arr = new double[6];
        while (true) 
        {
            System.out.println("MENU : ");
            System.out.println("1- Adding a vehicle");
            System.out.println("2- Leaving a vehicle");
            System.out.println("3- Exit the program");
            System.out.println("Enter number");
            Scanner input = new Scanner(System.in);
            int no = input.nextInt();

            if (no == 1) 
            {
                System.out.println("enter the day");
                double day = input.nextDouble();
                arr[0] = day;
                //char s=input.next().charAt(0);
                System.out.println("enter the month");
                double month = input.nextDouble();
                arr[1] = month;
                System.out.println("enter the time");
                Double time = input.nextDouble();
                arr[2] = time;
                System.out.println("enter type");
                String type = input.next();
                if (type.equals("car")) 
                {
                    System.out.println("enter id");
                    int id = input.nextInt();
                    car c1 = new car(id, type);
                    c1.adding_vehicle(id);
//                c1.print_array();
//                System.out.println();
                    c1.count();
                    System.out.println();
                } 
                else if (type.equals("bus")) 
                {
                    System.out.println("enter id");
                    int id = input.nextInt();
                    bus b1 = new bus(id, type);
                    b1.adding_vehicle(id);
//                b1.print_array();
//                System.out.println();
                    b1.count();
                    System.out.println();
                } 
                else if (type.equals("truck")) 
                {
                    System.out.println("enter id");
                    int id = input.nextInt();
                    truck t1 = new truck(id, type);
                    t1.adding_vehicle(id);
//                t1.print_array();
//                System.out.println();
                    t1.count();
                    System.out.println();
                } 
                else if (type.equals("moto")) 
                {
                    System.out.println("enter id");
                    int id = input.nextInt();
                    moto m1 = new moto(id, type);
                    m1.adding_vehicle(id);
//                m1.print_array();
//                System.out.println();
                    m1.count();
                    System.out.println();
                }
            }
            if (no == 2) 
            {
                System.out.println("enter the day");
                Double day = input.nextDouble();
                arr[3] = day;
                //char s=input.next().charAt(0);
                System.out.println("enter the month");
                Double month = input.nextDouble();
                arr[4] = month;
                System.out.println("enter the time");
                Double time = input.nextDouble();
                arr[5] = time;
                double a = arr[5] - arr[2];
                double b = arr[4] - arr[1];
                double d = arr[3] - arr[0];
                double res = a + (b * 30 * 24) + (d * 24);
                System.out.println("enter type");
                String type = input.next();
                if (type.equals("car")) 
                {
                    System.out.println("enter id");
                    int id = input.nextInt();
                    car c1 = new car(id, type);
                    c1.removing_vehicle(id);
//                c1.print_array();
//                System.out.println();
                    c1.count();
                    System.out.println();
                    System.out.println("The amount to be paid is : " + c1.calcMoney(res, 10));
                } 
                else if (type.equals("bus")) 
                {
                    System.out.println("enter id");
                    int id = input.nextInt();
                    bus b1 = new bus(id, type);
                    b1.removing_vehicle(id);
//                b1.print_array();
//                System.out.println();
                    b1.count();
                    System.out.println();
                    System.out.println("The amount to be paid is : " + b1.calcMoney(res, 15));
                } 
                else if (type.equals("truck")) 
                {
                    System.out.println("enter id");
                    int id = input.nextInt();
                    truck t1 = new truck(id, type);
                    t1.removing_vehicle(id);
//                t1.print_array();
//                System.out.println();
                    t1.count();
                    System.out.println();
                    System.out.println("The amount to be paid is : " + t1.calcMoney(res, 15));
                } 
                else if (type.equals("motorcycle")) 
                {
                    System.out.println("enter id");
                    int id = input.nextInt();
                    moto m1 = new moto(id, type);
                    m1.removing_vehicle(id);
//                m1.print_array();
//                System.out.println();
                    m1.count();
                    System.out.println();
                    System.out.println("The amount to be paid is : " + m1.calcMoney(res, 5));
                    System.out.println();
                }
                //System.out.println(res);
            }
            if (no == 3) 
            {
                System.exit(0);
            }

        }

    }

}
