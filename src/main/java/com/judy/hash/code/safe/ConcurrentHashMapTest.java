package com.judy.hash.code.safe;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 8:19 2019/6/15
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
        concurrentHashMap.put("1", "1");
        concurrentHashMap.put("2", "2");

        for (String s : concurrentHashMap.keySet()) {
            if (s.equals("2")) {
                concurrentHashMap.remove(s);
            }
        }
        System.out.println(concurrentHashMap);
    }
}
