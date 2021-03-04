
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raspb
 */
public class BankCharges {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
         System.out.println("Enter the number of checks written for the month");
         int checks = keyboard.nextInt();
         
         double charges = bankFees(checks);
         
         System.out.println("Your total montly fee is: $" + charges);
    }

    public static double bankFees(int checks) {
        //base charges = 10, thats why this is initalised to 10
        double charges = 10;

        if (checks < 20) {
            //System.out.println("here");
            charges += (checks * 0.1);
        } else if (20 <= checks && checks <= 39) {
            //System.out.println("here2");
            charges += (checks * 0.08);
        } else if (40 <= checks && checks <= 59) {
            //System.out.println("here3");
            charges += (checks * 0.06);
        } else if (60 <= checks) {
            //System.out.println("here4");
            charges += (checks * 0.04);
        }
        
        return charges;
        
    }
}
