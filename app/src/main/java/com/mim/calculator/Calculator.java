package com.mim.calculator;

/**
 * Created by mim on 5/6/2017 AD.
 */
public class Calculator {
    public int add(int param1, int param2) throws InvalidNumberException {
        if (param1 < 0 || param2 < 0) {
            throw new InvalidNumberException();
        }
        return param1 + param2;
    }

    public int subtract(int param1, int param2) {
        if(param1 < param2){
            return param2;
        }
        return param1 - param2;
    }

    public int multiply(int param1, int param2) {
        return param1 * param2;
    }
}
