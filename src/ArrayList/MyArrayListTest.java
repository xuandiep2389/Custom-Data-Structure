package ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();

        myArrayList.add(-1);
        myArrayList.add(-10);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);

        myArrayList.displayMyArrayList();
    }
}
