package com.syntax.class24;

public class HorseReview {

    /*Create a horse class
     * have 5 fields of your choice
     * create constructor and getter setter methods for this class
     * atleast write one condition inside setter class
     * */

    private String name;
    private String breed;
    private int age;
    private String color;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name can't be blank");
        } else {
            this.name = name;
        }
    }

    public String getBreed(String name) {
        if(name.equalsIgnoreCase("Josh")){
            return "Not Allowed";
        }else {
            return breed;
        }
    }

    public void setBreed(String breed) {
        if (breed.equalsIgnoreCase("Other")) {
            System.out.println("Other is not a valid option");
        } else {
            this.breed = breed;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 30 || age < 0) {
            System.out.println("Enter a valid age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("Rainbow")) {
            System.out.println("Rainbow is not a valid option");
        } else {
            this.color = color;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 1000) {
            System.out.println("Weight is too large to be a horse");
        } else {
            this.weight = weight;
        }
    }

    void printInfo() {
        System.out.println("Name: " + name + " Breed: " + breed + " Age: " + age + " Color: " + color + " Weight: " + weight);
    }

    public HorseReview(String name, String breed, int age, String color, double weight) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setColor(color);
        setWeight(weight);
    }

} class HorseTest{
    public static void main(String[] args) {

        HorseReview horse=new HorseReview("Biggie","Dinosaur",20,"Brown",101);
        horse.printInfo();
//      System.out.println(horse.weight=5000);

        System.out.println("Color: "+horse.getColor());
        System.out.println("Age "+horse.getAge());
        System.out.println("Breed "+horse.getBreed("Josh"));
        System.out.println("Name: "+horse.getName());
        System.out.println("Weight: "+horse.getWeight());

    }
}
