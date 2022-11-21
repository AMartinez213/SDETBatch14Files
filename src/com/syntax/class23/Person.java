package com.syntax.class23;

public interface Person {
    void eat();
}
interface Employee{
    void work();
}
interface SyntaxEmployee extends Employee,Person{

}
class Asghar implements SyntaxEmployee{

    @Override
    public void eat() {
        System.out.println("Like to eat grileed Fish");
    }

    @Override
    public void work() {
        System.out.println("Teaches Batch 14");
    }
}