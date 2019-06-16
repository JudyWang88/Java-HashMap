package com.judy.hash.code.hashmap;

/**
 * @Author: judy
 * @Description: 数组形式,无链表
 * @Date: Created in 14:41 2019/6/9
 */
public class MyHashMap1<K,V> {



    /**
     * 一首先需要有一个集合
     */

    /**
      * 2 定义存储对象的数组
     */
    private Entry<K, V> table[];

    /**
     * 数组初始化容量为8
     */
    private static final Integer CAPACITY = 8;

    /**
     * 1 存储数据的实体
     * @param <K>
     * @param <V>
     */
    class Entry<K,V>{
        public K key;
        public V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }


        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }


    /**
     * 3 往数组里面存储数据
     */
    public void put(K k,V v){
      //1 实例化出对象
        Entry entry = new Entry(k, v);
        //2判断存储对象的数组table是否为null
        if (table==null) {
            //3 初始化数组
            inflate();
        }
        //5 存entry对象
        //首先需要存储对象必须找到索引位置, 根据Hash算法找到位置
        int hashCode = hash(k);
        int index = indexFor(hashCode);
        //8 把某个对象加到数组的索引位置上
        addEntry(entry, index);
    }

    /***
     * 4 初始化数组
     * 4.1 如何初始化数组,首先需要给一个默认的空间
     */
    private void  inflate(){
        table = new Entry[CAPACITY];
    }

    /**
     * 6 hash算法
     */
    private int hash(K k){
        return k.hashCode();
    }

    /**
     * 7 hash算法,取模
     * 使用table.length的原因是因为我们不能让索引的大小超过我们table的大小
     */
    private int indexFor(int hashCode){
        return hashCode % table.length;
    }
    /**
     * 9在index索引位置添加entry
     */
    private void addEntry(Entry entry ,int index){
        table[index] = entry;
    }




    /**
     *  4 从数组里面取出对象
     */
    public V get(K k){
        int hash = hash(k);
        int index = indexFor(hash);
        return table[index].value;
    }


}
