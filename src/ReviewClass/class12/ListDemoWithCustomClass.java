package ReviewClass.class12;

import java.util.ArrayList;

public class ListDemoWithCustomClass {
    public static void main(String[] args) {

        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Josh","Plantin",123));
        students.add(new Student("Allan","Martinez",124));
        students.add(new Student("Bosh","Plant",125));
        students.add(new Student("Keith","Sweat",126));
        System.out.println(students);

        for(Student student:students){
            student.printName();
        }
        Student student=new Student("Josh","Plantin",123);
        System.out.println(students.contains(student));
        System.out.println(student);
        System.out.println(students);



    }
}
