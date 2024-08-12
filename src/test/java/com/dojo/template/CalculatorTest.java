package com.dojo.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTest {

    @Test
    public void testSum(){
        Assertions.assertEquals(3, Calculator.sum(1,2));
    }

    @Test
    public void testSubtraction(){
        Assertions.assertEquals(-1, Calculator.subtract(1,2));
    }

    @Test
    public void testMultiplication(){
        Assertions.assertEquals(2, Calculator.multiply(2,1));
    }

    @Test
    public void testDivision(){
        Assertions.assertEquals(2, Calculator.division(2, 1));
    }
}
