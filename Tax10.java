/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;
import java.util.Scanner;
public class Tax10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Salary = input.nextDouble();
        double Tax;
        
        if (Salary > 50000){
            Tax = Salary * 0.1;
        } else {
            Tax = Salary * 0.05;
        }
        System.out.println(Tax);
    }
    
}
