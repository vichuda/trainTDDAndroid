package com.mim.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SubtractTest {

    Calculator calculator = new Calculator();
    @Test
    public void
    ลบเลขด้วย_9_กับ_3_ต้องได้_6 () {
        int actualResult = calculator.subtract(9,3);

        assertEquals("ผิดแล้ว", 6, actualResult);
    }

    @Test
    public void
    ลบเลขด้วย_2_กับ_4_ต้องได้_4 () {
        int actualResult = calculator.subtract(2,4);

        assertEquals("ผิดแล้ว", 4, actualResult);
    }
}
