package ReviewClass.class12;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //We want to sort and remove the duplicates from an ArrayList
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(150000);
        numbers.add(120000);
        numbers.add(130000);
        numbers.add(140000);
        numbers.add(140000);

        Set<Integer> set=new TreeSet<>(numbers);//converts the ArrayList to a TreeSet
      //  numbers.clear();
        //numbers.addAll(set);
        System.out.println(numbers);

        ArrayList<Integer> numbers2=new ArrayList<>(set);
        System.out.println(numbers2);

    }
}
