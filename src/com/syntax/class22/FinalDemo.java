package com.syntax.class22;

public class FinalDemo {
    public static void main(String[] args) {
        Phone phone=new IPhone();
        //phone.RAM=50;

    }

}
 class Phone{
    final int RAM=12;

    void takePics(){
        final int number=10;


    }
}
class IPhone extends Phone{

    void takePics(){}
}