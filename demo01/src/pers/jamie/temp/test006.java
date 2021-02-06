package pers.jamie.temp;

import java.math.BigDecimal;

public class test006 {
    public static void main(String[] args) {
        Double a = new Double("999999999999999.99");
        BigDecimal b = new BigDecimal("999999999999999.99");
        System.out.println(b.toPlainString());
    }
}
