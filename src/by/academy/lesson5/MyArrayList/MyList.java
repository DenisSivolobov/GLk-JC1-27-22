package by.academy.lesson5.MyArrayList;

public interface MyList<T> {
    int Size();

    boolean isEmpty();

    boolean contains(Object var1);

    boolean addIn(String var1);

    boolean add(T var1);

    boolean remove(Object var1);

    boolean addAll(MyList<? extends T> var1);

    boolean removeAll(MyList<?> col);

    void add(int index, T obj);

    boolean addAll(int index, MyList<? extends T> col);

    T get(int index);

    int indexOf(Object obj);

    int lastIndexOf(Object obj);

    T remove(int index);

    T set(int index, T obj);
}

