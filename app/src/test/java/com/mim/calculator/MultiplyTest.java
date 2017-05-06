package com.mim.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mim on 5/6/2017 AD.
 */

public class MultiplyTest {
    Calculator calculator = new Calculator();
    @Test
    public void
    คูณเลขด้วย_1_กับ_3_ต้องได้_3 () {
        int actualResult = calculator.multiply(1,3);

        assertEquals("ผิดแล้ว", 3, actualResult);
    }
}
