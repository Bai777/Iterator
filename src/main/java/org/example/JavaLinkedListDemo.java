package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Collections.addAll(arrayList, 1, 2, 3, 4, 5);
        Collections.addAll(linkedList, 1, 2, 3, 4, 5);
    }
}
