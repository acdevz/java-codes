package oops.generics;

import java.util.Arrays;

public class CustomGenArrayList<T extends Number> {
    private Object[] data;
    private int size = 0;

    public CustomGenArrayList() {
        int DEFAULT_SIZE = 1;
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T item){
        if(isFull()){
            resize();
        }
        data[size++] = item;
    }

    private void resize() {
        Object[] temp = new Object[size * 2];
        if (size >= 0) System.arraycopy(data, 0, temp, 0, size);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        if (size == 0){
            throw new IndexOutOfBoundsException();
        }
        return (T)(data[--size]);
    }

    public T remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        T item = (T)(data[index]);
        for(int i = index; i < size - 1; i++){
            data[i] = data[i+1];
        }
        --size;
        return item;
    }

    public void set(int index, T item){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        data[index] = item;
    }

    public String toString(){
        return "CustomArrayList{" +
                " data = " + Arrays.toString(data) +
                ", size = " + size +
                " }";
    }


    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        list.set(1, 10);
        list.add(6);
        System.out.println(list);
    }
}
