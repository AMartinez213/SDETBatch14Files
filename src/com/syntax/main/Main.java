package com.syntax.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Door Land");

//        Create a door:
        Door door=new Door(false,100000);
        System.out.println("Door's toString: "+door);

        System.out.println("You need "+door.getMinNumHinges()+" hinges!");

        door.setOpen(true);
        if(door.isOpen()){
            System.out.println("It's Open");
        }
    }
}
