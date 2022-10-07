package ReviewClass;

public class Shelter {

    public static void main(String[] args) {

        //accesing static - use class name
        Dog.breed="Pitbull";
        Dog dog1=new Dog();
        //How to access instance variables
        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printInfo();



        Dog dog2=new Dog();
        System.out.println(dog2.name);
        dog2.name="Tommy";
        dog2.weight=10;
        System.out.println(dog2.breed);
        dog2.printInfo();

        System.out.println("Making changes");
        dog1.name="Bobik";
        dog1.breed="German";

        dog1.printInfo();
        dog2.printInfo();

        double price=dog1.getPrice();
        System.out.println(price);

        double price2=dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

        dog1.love("to walk");
        dog2.love("to play");



    }

}
