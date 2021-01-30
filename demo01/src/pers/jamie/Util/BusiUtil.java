package pers.jamie.Util;

import java.util.List;
import java.util.Map;

public class BusiUtil {
    public static boolean isNull(Object obj) {
        if (obj == null) {
            return true;
        }
        if (String.class.isInstance(obj)) {
            String str = (String) obj;
            return str == null || str.length() == 0;
        } else if (List.class.isInstance(obj)) {
            return ((List<?>) obj).size() == 0;
        } else if (Map.class.isInstance(obj)) {
            return ((Map<?, ?>) obj).size() == 0;
        } else {
            return obj == null;
        }
    }

    public static boolean isEquals(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return true;
        } else {
            return s1 != null && s2 != null ? s1.equals(s2) : false;
        }
    }

    public boolean isNotNull(String s1, String s2){
        if (s1 == null && s2 == null) {
            return true;
        } else {
            return s1 != null && s2 != null ? s1.equals(s2) : false;
        }
    }
}
