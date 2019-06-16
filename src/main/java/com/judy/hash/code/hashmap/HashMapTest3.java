package com.judy.hash.code.hashmap;

/**
 * @Author: judy
 * @Description: 测试HashMap中Hash冲突
 * @Date: Created in 15:42 2019/6/9
 */
public class HashMapTest3 {
    public static void main(String[] args){
        MyHashMap3<String, String> myHashMap3 = new MyHashMap3<String, String>();
        myHashMap3.put("1","lv");
        myHashMap3.put("2","2v");
        myHashMap3.put("3","3v");
        System.out.println(myHashMap3.get("1"));
    }
}
