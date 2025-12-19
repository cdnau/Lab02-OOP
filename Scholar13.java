/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

import java.util.Scanner;

public class Scholar13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Enter family income: ");
        int income = scanner.nextInt();

        if (gpa >= 3.5) {
            if (income <= 15000) {
                System.out.println("You are eligible for the scholarship.");
            } else {
                System.out.println("You are not eligible for a scholarship.");
            }
        } else {
            System.out.println("You are not eligible for a scholarship.");
        }
    }
}

