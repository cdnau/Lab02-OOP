/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;
import java.util.Scanner;

public class Deposit11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your money : ");
        double money = input.nextDouble();

        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        String accountType = input.next();

        double interestRate;
        switch (accountType) {
            case "A":
            case "C":
                interestRate = 0.015;
                break;
            case "B":
                interestRate = 0.020;
                break;
            case "X":
                interestRate = 0.050;
                break;
            default:
                return;
        }

        double totalMoney = money + (money * interestRate);
        System.out.printf("Your total money in one year = %.0f\n", totalMoney);
    }
}

