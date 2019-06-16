package com.judy.hash.code.hashmap;

/**
 * @Author: judy
 * @Description: 数组和链表
 * @Date: Created in 14:41 2019/6/9
 */
public class MyHashMap2<K,V> {



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
     * 想知道HashMap元素
     */
    private int size;


    /**
     * 1 存储数据的实体
     * @param <K>
     * @param <V>
     */
    class Entry<K,V>{
        public K key;
        public V value;
        //因为会发生冲突,所以使用链地址法
        public Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
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
        addEntry(k,v, index);

        //key相同过的时候把V进行更新,循环链表是否有相同的key
        for(Entry<K,V> entry =table[index]; entry !=null ; entry =entry.next){
            //传过来的k与我当前的k做比较
            if (entry.key.equals(k)) {
                entry.key = k;
            }
        }

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
    private void addEntry(K k,V v,int index){

        // 添加一个节点
        Entry<K, V> newEntry = new Entry<K,V>(k, v, table[index]);
//        jdk7 可以这样写
//        Entry<K, V> newEntry = new Entry<>(k, v, table[index]);
        table[index] = newEntry;
        //表示hashmap里面有多少元素
        size++;
    }


    /**
     *  4 从数组里面取出对象
     */
    public V get(K k){
        //转化为hashcode,从hashcode算法得到index
        int hashCode = hash(k);
        int index = indexFor(hashCode);
         //循环链表得到k的value
        for( Entry<K,V> entry = table[index]; entry != null; entry=entry.next){
            if (entry.key.equals(k)) {
                return entry.value;
            }
        }
        return null;
    }





}
