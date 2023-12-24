package oops.generics;

public class CustomArrayList {
    private int[] data;
    private int size = 0;
    private final int DEFAULT_SIZE = 1;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int item){
        if(isFull()){
            resize();
        }
        data[size++] = item;
    }

    private void resize() {
        int[] temp = new int[size * 2];
        if (size >= 0) System.arraycopy(data, 0, temp, 0, size);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        if (size == 0){
            throw new IndexOutOfBoundsException();
        }
        return data[--size];
    }

    public int remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        int item = data[index];
        for(int i = index; i < size - 1; i++){
            data[i] = data[i+1];
        }
        --size;
        return item;
    }

    public void set(int index, int item){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        data[index] = item;
    }

    public void print(){
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            if(i != size - 1)
                System.out.printf("%d, ",data[i]);
            else
                System.out.printf("%d ]", data[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
//        list.remove();
        int popped = list.remove(2);
        System.out.println("Popped item: " + popped);
//        list.add(5);
        list.print();
    }
}
