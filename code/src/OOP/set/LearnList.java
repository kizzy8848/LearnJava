package OOP.set;

import java.util.ArrayList;

public class LearnList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);//在末尾添加一个元素
        arrayList.add(0,2);//在指定索引添加一个元素
        arrayList.remove(1);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}
