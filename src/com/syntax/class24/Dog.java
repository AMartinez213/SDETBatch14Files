package com.syntax.class24;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private double weight;

   public Dog(String name,String breed,int age,double weight){
       setName(name);
       setBreed(breed);
       setAge(age);
       setWeight(weight);
   }
    void setName(String name) {
        if (name.length() > 30) {
            System.out.println("Name can't be more than 30 characters. Please try again");
        } else if (name.isEmpty()) {
            System.out.println("Name can't be empty");
        } else {
            this.name = name;
        }
    }
    void setWeight(double weight){
       if(weight<0){
           System.out.println("Negative weight cant be entered");
       }else if(weight>300){
           System.out.println("Enter a weight less than 300lbs");
       }else{
           this.weight=weight;
       }
    }
    void setAge(int age){
       if(age>20){
           System.out.println("Re-enter age");
       }else if(age<0){
           System.out.println("Age cant be negative");
       }else{
           this.age=age;
       }
    }
    void setBreed(String breed){
        if(breed.length()>20){
            System.out.println("Breed can't be more than 20 letters. Please try again");
        }else if(breed.isEmpty()){
            System.out.println("Breed can't be empty. Please try again");
        }else {
            this.breed = breed;
        }
    }

    String getName(){
       return name;
    }
    String getBreed(){
       return breed;
    }
    int getAge(){
       return age;
    }
    double getWeight(){
       return weight;
    }
    void printInfo(){
       System.out.println("Name "+name+" Breed "+breed+" age "+age+" Weight "+weight);
    }
}
class Test{
    public static void main(String[] args) {
        Dog tommy=new Dog("2Pac","German",4,95);
        System.out.println(tommy.getName());
        //System.out.println(tommy.age);
        System.out.println(tommy.getAge());
        System.out.println(tommy.getBreed());
        System.out.println(tommy.getWeight());

        tommy.printInfo();
    }
}
