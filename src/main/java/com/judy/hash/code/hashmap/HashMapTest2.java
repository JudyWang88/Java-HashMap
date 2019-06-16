package com.judy.hash.code.hashmap;

/**
 * @Author: judy
 * @Description: 测试HashMap数组+链表
 * @Date: Created in 15:42 2019/6/9
 */
public class HashMapTest2 {
    public static void main(String[] args){
        MyHashMap2<String, String> myHashMap2 = new MyHashMap2<String, String>();
        myHashMap2.put("1","lv");
        myHashMap2.put("2","2v");
        myHashMap2.put("3","3v");
        System.out.println(myHashMap2.get("1"));
    }
}
