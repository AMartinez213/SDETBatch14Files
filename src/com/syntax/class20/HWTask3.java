package com.syntax.class20;

public class HWTask3 {

    /*Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3
    subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features
    and behaviour. Test all 4 classes*/
}
class Teacher {
    private String name;
    private int age;
    private int yearOfExperience;

    Teacher(String name, int age, int yearOfExperience) {
        this.name = name;
        this.age = age;
        this.yearOfExperience = yearOfExperience;
    }

    void teach() {
        System.out.println(name + " is teaching");
    }

class MathTeacher extends Teacher{
        MathTeacher(String name, int noOfYears, int age){
            super(name,age,noOfYears);
        }
    void teach(){
        System.out.println(name+" is teaching math");
    }
}

class ChemistryTeacher extends Teacher{

    ChemistryTeacher(String name, int age, int yearOfExperience) {
        super(name, age, yearOfExperience);
    }
    void teachChem(){
        System.out.println(name+" teaching chemistry");
    }
}
class PianoTeacher extends Teacher{

    PianoTeacher(String name, int age, int yearOfExperience,String pianoType) {
        super(name, age, yearOfExperience);
        //this.pianoType=pianoType;
    }
    void playPiano(){
        System.out.println(name+" teaching the piano");
    }
}

}
