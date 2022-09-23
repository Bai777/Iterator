package org.example;

public interface LinkedList<T> extends Iterable<T> {
    void addFirst(T element);
    void addLast(T element);

    T getFirst();

    T getLast();

    T get(int index);

    void delete(int index);

    void add(T element, int index);
}
