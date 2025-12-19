import java.util.Scanner;
public class Tax02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary;
        
        System.out.print("input your salary : ");
        salary = input.nextDouble();
        double payment;
        
        if (salary > 50000) {
            payment = salary * 0.1;
        } else {
            payment = salary * 0.05;
        }
        System.out.println(payment);
    }
}