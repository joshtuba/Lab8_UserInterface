
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raspb
 */
public class InsuranceEstimator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input your age");
        int age = keyboard.nextInt();
        
        try {
            double insuranceCost = insuranceFormula(age);
            System.out.println("Your insurane will cost $" + insuranceCost +"/year.");
        } catch (InvalidAgeException ex) {
            System.out.println("The age you endered is not elgible for this life insuracne");
        }
        
    }
    public static double insuranceFormula(double age) throws InvalidAgeException{
        //returns the insurance cost for a given age
        
        if (age < 5 || age > 110) {
            throw new InvalidAgeException("Age must be between 5 and 110");
        }
        
        
        double insuranceCost = (age * 5) + 300;
        return insuranceCost;
        
    }
}
