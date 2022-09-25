package org.example;

import java.util.Iterator;

public class ArrayIteratorDemo {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        ArrayIterable arrayIterable = new ArrayIterable(array);

        for (Integer in :
                arrayIterable) {
            System.out.println(in);
        }
    }

    static class ArrayIterable implements Iterable<Integer> {

        private final int[] array;

        public ArrayIterable(int[] array) {
            this.array = array;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new ArrayIterator();
        }


        private class ArrayIterator implements Iterator<Integer> {

            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < array.length;
            }

            @Override
            public Integer next() {
                return array[cursor++];
            }
        }
    }
}
