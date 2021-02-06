package pers.jamie.temp;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test05 {
    public static void main(String[] args) throws ParseException {
        Double a = 0.05;
        Double b = 0.02;
        Double c = a-b;
//        BigDecimal b2 = new BigDecimal(Double.toString(b));
//        BigDecimal b3 = new BigDecimal(Double.toString(a));
//        System.out.println(b3.subtract(b2).doubleValue());
//        System.out.println(b2.add(b3).doubleValue());
        Double d = 0.0000000001d;
        BigDecimal e = new BigDecimal(d.toString());
        System.out.println(e.toPlainString());

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyyMMdd");
        String format = dateFormat.format(date);
        System.out.println(format);

        String date1 = "20201220";
        Date parse = dateFormat.parse(date1);
        System.out.println(parse);
        String date2 = "20201221";
        Date parse2 = dateFormat.parse(date2);
        System.out.println(parse2);
        //比较两个日期大小
        System.out.println(parse2.compareTo(parse));
        System.out.println(parse.compareTo(parse2));


    }
}
