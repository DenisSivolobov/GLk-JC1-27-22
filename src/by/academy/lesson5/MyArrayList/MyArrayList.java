package by.academy.lesson5.MyArrayList;

public class MyArrayList<T> implements MyList<T> {
    String[] MyArr = new String[10];

    @Override
    public int Size() {
        int x = 0;
        for (int i = 0; i < MyArr.length; i++) {
            if (MyArr[i] != null) {
                x++;
            }
        }
        return x;
    }

    @Override
    public boolean isEmpty() {
        int x = 0;
        for (int i = 0; i < MyArr.length; i++) {
            if (MyArr[i] != null) {
                x++;
            }
        }
        if (x != 0) {
            System.out.println("В коллекции есть элементы");
        } else {
            System.out.println("В коллекции элементы отсутсвуют");
        }
        return false;
    }

    @Override
    public boolean contains(Object var1) {
        return false;
    }

    @Override
    public boolean add(T var1) {
        return false;
    }

    //size != 0 ? true : false; как сделать через такую конструкцию?

    @Override
    public boolean addIn (String var1) {
        for (int i = 0; i < MyArr.length; i++) {
            if (MyArr[i] == null) {
                MyArr[i] = var1;
            }
        }
        return true;
    }


    @Override
    public boolean remove(Object var1) {
        for (int i = 0; i < MyArr.length; i++) {
            if (MyArr[i] == var1) {
                MyArr[i] = null;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(MyList<? extends T> var1) {
        return false;
    }

    @Override
    public boolean removeAll(MyList<?> col) {
        return false;
    }

    @Override
    public void add(int index, T obj) {

    }

    @Override
    public boolean addAll(int index, MyList<? extends T> col) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T set(int index, T obj) {
        return null;
    }

}

