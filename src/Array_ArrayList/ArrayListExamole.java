package Array_ArrayList;

import java.util.ArrayList;

public class ArrayListExamole {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(56);
        list.add(56);
        list.add(78);
//        replace
        list.set(0,987);

        System.out.println(list.contains(56));
        System.out.println(list);

    }
}
