package equalhashcode;

import com.judy.hash.code.Hash;

import java.util.HashMap;


/**
 * @Author: judy
 * @Description:  ֻҪid  ,hashcode�ж�����������һ��Ͱ����, equals�ж���Ͱ�����ҵ���,������дequal,hashcode��һ�����, ��ʱ��дhash
 * @Date: Created in 7:50 2019/6/15
 */
public class equals {
    public static void main(String[] args){
        Person person1 = new Person(1, "judy1");
        Person person2 = new Person(1, "judy1");
        System.out.println(person1.equals(person2));

        HashMap<Person, String> hashMap = new HashMap<Person, String>();
        hashMap.put(person1, "��ʦ");
        System.out.println(hashMap.get(person1).equals(person1));
        System.out.println(hashMap.get(person1).equals(person2));
        System.out.println(hashMap.get(person1));
        System.out.println(hashMap.get(person2));
    }



    static class Person{
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
        @Override
        public boolean equals(Object obj) {
            if(this==obj) return true;
            if(obj ==null || getClass() !=obj.getClass()) {
                return false;
            }
            Person person = (Person) obj;
            return id == person.id;
        }

        @Override
        public int hashCode() {
            return Hash.hash(id);
        }
    }
}

