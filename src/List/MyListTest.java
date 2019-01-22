package List;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Integer> listInt = new MyList<Integer>();

        listInt.add(1);
        listInt.add(2);
        listInt.add(10);
        listInt.add(-1);
        listInt.add(-5);
        System.out.println(listInt.get(1));
        System.out.println(listInt.getSize());
    }
}
