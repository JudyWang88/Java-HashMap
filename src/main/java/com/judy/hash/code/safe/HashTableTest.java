package com.judy.hash.code.safe;

import java.util.Hashtable;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 9:16 2019/6/15
 */
public class HashTableTest {
    public static void main(String[] args){
        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        hashtable.put("a", "judy");
        hashtable.put("b", "judy");
        hashtable.put("c", "judy");
        for (String s : hashtable.keySet()) {
            if (hashtable.get("a").equals(s)){
                hashtable.remove("a");
            }
        }
        System.out.println(hashtable);

    }
}
