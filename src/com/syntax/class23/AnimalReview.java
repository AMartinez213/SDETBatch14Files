package com.syntax.class23;

public abstract class AnimalReview {
    abstract void eat();
    abstract void sleep();
    void walk(){
        System.out.println("Cat walk");
    }
}
    class CatReview extends AnimalReview {
        @Override
        void eat() {
            System.out.println("Cats like fish");
        }
        @Override
        void sleep() {
            System.out.println("Cats like to sleep 12 to 16 hours");
        }
        void showAttitude(){
            System.out.println("hmm hmm hmm hmm");
        }
    }
   abstract class DogReview extends AnimalReview{
        @Override
        void eat() {
            System.out.println("Dogs like watermelon");
        }
        /*@Override
        void sleep() {
            System.out.println("Dogs like to sleep 8 to 10 hours");
        }*/
       void Bark(){
           System.out.println("Woof Woof Woof");
       }
    }


