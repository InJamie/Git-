package pers.jamie.temp;

import java.util.HashMap;
import java.util.Map;

public class test001 {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap();
        String a="" ;
        String b = map.get(a);
        a.equals(b);
        System.out.println("-------------------------------------------------");
        System.out.println(b);
        System.out.println(a.equals(b));
        System.out.println("-------------------------------------------------");
        String asd = null;
        a.equals(asd);
        map.get(asd);
        System.out.println("-------------------------------------------------");
        System.out.println(asd + "");
    }
}
