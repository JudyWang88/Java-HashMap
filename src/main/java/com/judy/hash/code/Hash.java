package com.judy.hash.code;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 14:01 2019/6/9
 */
public class Hash {
    public static int hash(int i){
        return ((i+2)<< 2 % 8)^5;
//        return i % 8;
    }
    public static int hash(String s){
        int hashcode = 0;
        char[] ch = s.toCharArray();
        for (char c : ch) {
            hashcode += hash(c);
        }
        return hashcode;
    }
    public static void main(String[] args){
//        System.out.println(hash(10));
//        System.out.println(hash(11));
//        System.out.println(hash(12));
//        System.out.println(hash(13));
//        System.out.println(hash(14));
//        System.out.println(hash(15));
        System.out.println(hash("10"));
        System.out.println(hash("11"));

    }
}
