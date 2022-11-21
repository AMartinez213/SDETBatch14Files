package com.syntax.class22;

public class HWTask1 {

}
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need a high school diploma");
    }
}
class Bachelors extends Degree{

}

class Masters extends Degree{
    @Override
    void getPrerequisite(){
        System.out.println("To get Masters degree, you need a Bacherls degree");
    }

    public static void main(String[] args) {
        Degree degree=new Degree();
        Bachelors bachelors=new Bachelors();
        Masters masters=new Masters();

        degree.getPrerequisite();
        bachelors.getPrerequisite();
        masters.getPrerequisite();
    }

}
