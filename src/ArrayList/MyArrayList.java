package ArrayList;

import java.util.Arrays;

public class MyArrayList<E> {

    // tao ra so luong mang co the chua khi khoi tao
    private static final int INITIAL_CAPACITY = 3;

    private int size = 0;

    private Object elementData[] = {};

    //constructor cua arraylist
    public MyArrayList() {
        elementData = new Object[INITIAL_CAPACITY];
    }

    //ham de tang dung luong array len gap doi
    private void ensureCapacity() {
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }

    //phuong thuc de add
    public void add(E e) {
        if (size == elementData.length) {
            ensureCapacity();
        }
        elementData[size++] = e;
    }

    //phuong thuc de get theo index
    public E get(int index) {
        //neu index la so am hay lon hon hoac bang size thi throw exception
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size" +index);
        }
        return (E) elementData[index];//return ket qua
    }


    //phuong thuc de xoa 1 phan tu theo index
    public Object remove(int index) {
        //neu index nho hon 0 hoac lon hon hoac bang size thi throw exception
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }

        Object removedElement = elementData[index];
        for (int i = index; i < size -1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size --;//giam 1 size cua array sau khi remove 1 phan tu

        return removedElement;
    }

    //lay size cua Array list
    public int getSize() {
        return size;
    }


    //hien thi danh sach trong arrayList
    public void displayMyArrayList() {
        System.out.println("Displaying list: ");
        for (int i = 0; i < size ; i++) {
            System.out.println(elementData[i] + " ");
        }
    }
}
