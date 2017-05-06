package com.mim.calculator;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test(expected = InvalidNumberException.class)
    public void
    ถ้าเลขที่หนึ่งติดลบ_ต้องโยน_exception_ออกมา() throws InvalidNumberException {
        calculator.add(-1,10);
    }

    @Test(expected = InvalidNumberException.class)
    public void
    ถ้าเลขที่สองติดลบ_ต้องโยน_exception_ออกมา() throws InvalidNumberException {
        calculator.add(1,-10);
    }

    @Test
    public void
    ถ้าเลขติดลบ_ต้องโยน_exception_ออกมา() {
        try {
            calculator.add(1, -10);
            fail("ddddd");
        } catch (InvalidNumberException e) {
        }
    }

    @Test
    public void
    บวกเลขด้วย_1_กับ_2_ต้องได้ค่า_3 () throws InvalidNumberException {     //test case name กำลังทำอะไร คาดหวังอะไร
        //Given (Arrange)
        //Calculator calculator = new Calculator();

        //When (Act)
        int actualResult = calculator.add(1,2);

        //Then (Assert)
        assertEquals("ผิดแล้ว", 3, actualResult);
    }

    @Test
    public void
    บวกเลขด้วย_3_กับ_4_ต้องได้ค่า_7 () throws InvalidNumberException {
        //Given (Arrange)
        //Calculator calculator = new Calculator();

        //When (Act)
        int actualResult = calculator.add(3,4);

        //Then (Assert)
        assertEquals("ผิดแล้ว", 7, actualResult);
    }
}
