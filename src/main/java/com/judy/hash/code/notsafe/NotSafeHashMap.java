package com.judy.hash.code.notsafe;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 16:08 2019/6/9
 */
public class NotSafeHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "1");
        hashMap.put("2", "2");
        for (String Key : hashMap.keySet()) {
            if (Key.equals("1")) {
                hashMap.remove(Key);
            }
        }
        System.out.println(hashMap);



    }
}
