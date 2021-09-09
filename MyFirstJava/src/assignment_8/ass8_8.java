package assignment_8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ass8_8 {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(9);
        list1.add(8);
        list1.add(7);
        list1.add(6);
        list1.add(5);
        Consumer<List<Integer>> display = list2->list2.forEach(System.out::println);
        Thread t = new Thread();
        t.run();
    }
}



