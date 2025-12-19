/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;
import java.util.Scanner;
public class Pass9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true){
            System.out.print("Enter password: ");
            String pass = input.nextLine();
            if (pass.equals("PASS2025")){
                System.out.println("Access granted.");
                break;
            } else {
                System.out.println("Try again.");
            }
        }
    }
}
