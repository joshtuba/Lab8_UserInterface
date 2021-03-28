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
public class InsuranceEstimatorTest {

    public InsuranceEstimatorTest() {
    }

    @Test
    public void testInsuranceFormula() throws Exception {
        System.out.println("insuranceFormula");
        double age = 33;
        double expResult = 465;
        double result = InsuranceEstimator.insuranceFormula(age);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testInvalidAgeException() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            InsuranceEstimator.insuranceFormula(2);
        });
    }
    
    @Test
    public void testInvalidAgeExceptionOld() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            InsuranceEstimator.insuranceFormula(111);
        });
    }

}
