package org.example;

import java.util.*;

public class IteratorDemo {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        LinkedList<Integer> customLinkedList = new LinkedListImpl<>();
        customLinkedList.addLast(1);
        customLinkedList.addLast(2);
        customLinkedList.addLast(3);
        customLinkedList.addLast(4);
        customLinkedList.addLast(5);

        // TODO: 22.09.2022 Реализовать итератор для связного списка.
        // TODO: 22.09.2022 Должно работать.
        for (Integer in :
                customLinkedList) {
            System.out.println(in);
        }
    }



    private static void iterator(Collection<Integer> collection) {
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
    }

    private static void foreach(Collection<Integer> collection) {
        for (Integer integer : collection) {
            System.out.println(integer);
        }
    }

    private static void arrayForeach() {
        int[] array = new int[]{1, 2, 3};
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static Collection<Integer> iteratorRemoveExample() {
        Collection<Integer> collection = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Iterator<Integer> iterator = collection.iterator();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.remove();
        return collection;
    }
}
