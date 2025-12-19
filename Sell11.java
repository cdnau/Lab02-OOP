/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;
import java.util.*;
public class Sell11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of items: ");
        int n = input.nextInt();
        int total = 0;
        
        for (int i = 1; i <= n; i++){
            System.out.print("Enter number of item "+i+": ");
            int price = input.nextInt();
            total += price;
        }
        System.out.println("Total = "+total);
        
        System.out.print("Enter amount paid: ");
        int paid = input.nextInt();
        
        int change = paid - total;
        System.out.println("Change = "+change);
    }
}
