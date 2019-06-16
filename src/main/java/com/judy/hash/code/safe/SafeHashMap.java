package com.judy.hash.code.safe;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 8:18 2019/6/15
 */
public class SafeHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "1");
        hashMap.put("2", "2");
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("1")) {
                iterator.remove();
            }
        }
        System.out.println(hashMap);
    }
}
