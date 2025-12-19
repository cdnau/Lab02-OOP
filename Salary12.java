/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

import java.util.Scanner;

public class Salary12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Please enter number of working days: ");
        int numDay1 = scanner.nextInt();

        System.out.print("Please enter number of absent days: ");
        int numDay2 = scanner.nextInt();

        System.out.print("Please enter your body weight: ");
        int weight = scanner.nextInt();
        
        int salary = 0;
        
        if ((age>=21)&&(age<=30))
            salary = (numDay1 * 300)-(numDay2 * 50);
        else if ((age>=31)&&(age<=40))
            salary = (numDay1 * 500)-(numDay2 * 50);
        else if  ((age>=41)&&(age<=50))
            salary = (numDay1 * 1000)-(numDay2 * 20);
        else if  ((age>=51)&&(age<=60))
            salary = (numDay1 * 3000);
        
        int bonus;
        
        if (weight >= 10 && weight <= 60)
            bonus = salary + 5000;
        else if (weight >= 61 && weight <= 90)
            bonus = salary + (5000 - ((weight-60) * 10));
        else
            bonus = salary;

        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        System.out.println("Your salary and bonus is " + bonus + " Baht");
    }
}

