package com.dfz.vo;

public class PhoneUtil {

    public static boolean isPhone(String phone) {
         boolean isPass = true;
        if (phone.length() == 0) {
            isPass = false;
        } else if (!phone.matches("^[1][3,4,5,7,8][0-9]{9}$")) {
            isPass = false;
        }
        return isPass;
    }
}
