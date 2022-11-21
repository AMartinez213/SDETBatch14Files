package com.syntax.class24;

public class Horse {
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    public Horse(String name, String breed, String color, int age, double weight) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public String getBreed(String name) {
        if (name.equals("Josh")) {
            return "Not allowed";
        } else {
            return breed;
        }
    }

    public String getColor() {
        return color;
    }

    public int getAge(int age) {
        if (age == 100) {
            return 1000000;
        } else {
            return age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        if (name.length() > 10) {
            System.out.println("Name is too long");
        } else {
            this.name = name;
        }
    }

    public void setBreed(String breed) {
        if (breed.length() < 1) {
            System.out.println("Breed name is too short");
        } else {
            this.breed = breed;
        }
    }

    public void setColor(String color) {
        if (color.equals("green")) {
            System.out.println("Horses cant be green");
        } else {
            this.color = color;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cant be negative");
        } else {
            this.age = age;
        }
    }

    public void setWeight(double weight) {
        if (weight > 1000) {
            System.out.println("This weight is too heavy for a hourse");
        } else {
            this.weight = weight;
        }
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed+" "+age+" "+weight);

    }
}
class Test1 {
    public static void main(String[] args) {


        Horse horse = new Horse("Peanut", "Pure", "brown", 12, 100);
        horse.printInfo();
        System.out.println(horse.getBreed("Josh"));
        System.out.println(horse.getAge(100));

    }
}
