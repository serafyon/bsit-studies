/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a104.grosspaycalculator;

/**
 *
 * @author LAB6 - PC41
 */

import java.util.Scanner;

public class GrossPayCalculator {
    public static void output(String ename, char etype, double overtime, double basic){
        if (etype == 'F'){
            //fulltime
            System.out.println("________________________");
            System.out.println("Employee Name: " + ename);
            System.out.println("Basic Pay: " + basic);
            System.out.println("________________________");
            System.out.println("Gross Pay: " + basic);
        } else {
            //parttime
            double grosspay = overtime + basic;
            System.out.println("________________________");
            System.out.println("Employee Name: " + ename);
            System.out.println("Basic Pay: " + basic + "\nOvertime Pay: " + overtime);
            System.out.println("________________________");
            System.out.println("Gross Pay: " + grosspay);
        }
    }

    static void fulltime(String ename){
        char ft = 'F';
        Scanner f_read = new Scanner(System.in);
        System.out.print("Enter your monthly salary: ");
        double f_salary = f_read.nextDouble();
        double calc_overtime = 0;
        
        GrossPayCalculator.output(ename, ft, calc_overtime, f_salary);
    }
    
    static void parttime(String ename){
        char pt = 'P';
        
        Scanner p_read = new Scanner(System.in);
        System.out.print("Enter your rate per hour: ");
        double p_rate = p_read.nextDouble();
        System.out.print("Enter your hours worked: ");
        int p_hours = p_read.nextInt();
        System.out.print("Enter your overtime hours: ");
        int p_overtime = p_read.nextInt();
        
        // calculate
        double calc_overtime = p_overtime * (p_rate * 1.25);
        double calc_basic = p_rate * p_hours;
        
        
        GrossPayCalculator.output(ename, pt, calc_overtime, calc_basic);
        
    }
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        
        String e_name = read.nextLine();
        
        
        
        OUTER:
        while (true) {
            System.out.println("Select F if employee is full time \nSelect P if employee is part time");
            char e_type = read.next().charAt(0);
            switch (e_type) {
                case 'F':
                    System.out.println("--- Full Time Employee ---");
                    GrossPayCalculator.fulltime(e_name);
                    break OUTER;
                case 'P':
                    System.out.println("--- Part Time Employee ---");
                    GrossPayCalculator.parttime(e_name);
                    break OUTER;
                default:
                    System.out.println("Error: Invalid input");
            }
        }
        
       
        
        
        
    }
}
