package ReviewClass.class13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo1 {

    public static void main(String[] args) {

        HashMap<String,Double> items=new HashMap<>();
        items.put("iPhone 14",1000.);
        items.put("Eggs",2.4);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("flower",1.0);
        ArrayList<String> keys=getKeys(items);
        for (var key:keys
             ) {
            System.out.println(key);
        }

        List<Double> values=getValues(items);
        System.out.println(values);

    }

    public static ArrayList<String> getKeys(Map<String,Double> map){

        return new ArrayList<>(map.keySet());


    }

    public static List<Double> getValues(Map<String,Double> map){
        return new ArrayList<>(map.values());
        }
    }


