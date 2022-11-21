package ReviewClass.class12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class MapDemo {
    public static void main(String[] args) {

        //HashMap: Does not retain the order, but its the fastest
        //LinkedHasMap: It retains the order, but its a little slower than HashMap
        //TreeMap: When we want to sort the data but it is slowest

        Map<String,Double> vegeList=new LinkedHashMap<>();
        TreeSet<String> hashSet=new TreeSet<>();
        hashSet.add(null);
        System.out.println(hashSet);



    }
}
