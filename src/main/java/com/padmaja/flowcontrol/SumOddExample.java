package com.padmaja.flowcontrol;
import java.lang.String;

public class SumOddExample {
    public int sumOddExample(int sum, int count) {

        for (int i = 1; i <= 1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if(count == 5){
                break;
            }
        }
        return sum;
    }
}