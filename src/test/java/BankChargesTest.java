/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author raspb
 */
public class BankChargesTest {
    
    public BankChargesTest() {
    }


    @Test
    public void testBankFees15() {
        System.out.println("bankFees");
        int checks = 15;
        double expResult = 11.5;
        double result = BankCharges.bankFees(checks);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testBankFees25() {
        System.out.println("bankFees");
        int checks = 25;
        double expResult = 12;
        double result = BankCharges.bankFees(checks);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testBankFees50() {
        System.out.println("bankFees");
        int checks = 50;
        double expResult = 13;
        double result = BankCharges.bankFees(checks);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testBankFees62() {
        System.out.println("bankFees");
        int checks = 62;
        double expResult = 12.48;
        double result = BankCharges.bankFees(checks);
        assertEquals(expResult, result, 0.0);
    }
    
}
