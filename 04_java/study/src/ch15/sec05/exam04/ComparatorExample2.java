package ch15.sec05.exam04;

import ch15.sec05.exam03.Person;

import java.util.*;

public class ComparatorExample2 {
    public static void main(String[] args) {
        ArrayList<Fruit> list = new ArrayList<Fruit>();

        list.add(new Fruit("포도", 3000));
        list.add(new Fruit("수박", 10000));
        list.add(new Fruit("딸기", 6000));

        Collections.sort(list, new Comparator<Fruit>() {
            public int compare(Fruit o1, Fruit o2) {
                if (o1.price > o2.price) {
                    return 1;
                } else if (o1.price < o2.price) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (Fruit f : list) {
            System.out.println(f.name + ": " + f.price);
        }
    }
}
