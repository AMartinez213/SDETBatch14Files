package ReviewClass.class12;

import java.util.ArrayList;

public class ListsDemo {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");
        System.out.println(animals);

        for(String animal:animals){
            System.out.println(animal.length());
        }


        animals.removeIf(x->x.length()>4);
        System.out.println(animals);

    }
}
