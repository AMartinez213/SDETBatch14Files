package com.syntax.class23;

public interface PersonReview {
    void eat();
}

interface EmployeeReview{
    void work();
}
interface SyntaxEmployeeReview extends EmployeeReview,PersonReview{
    void createRepl();
}
class AsgharReview implements SyntaxEmployeeReview{

    @Override
    public void eat() {
        System.out.println("Likes to eat grilled fish");
    }

    @Override
    public void work() {
        System.out.println("Teaches Batch14 ");
    }

    @Override
    public void createRepl() {
        System.out.println("Create easy Repls ");
    }
}