package com.syntax.class22;

public class Car {
    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use brakes to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}

class BMW extends Car {
    @Override
        void start(){
            System.out.println("Push the button to start the car");
        }

    @Override
    void stop() {
        super.stop();
        System.out.println("You can also use auto-break to stop me");
    }
}
class Toyota extends Car{
    @Override
    void start(){
        System.out.println("push me to start");
    }
}
class Tesla extends Car{
    @Override
    void start(){
        System.out.println("Use the app to start me");
    }
    @Override
    void stop(){
        System.out.println("Use AI and Auto-break to stop me");
    }
    @Override
    void park(){
        System.out.println("I can auto park myself");
    }
}