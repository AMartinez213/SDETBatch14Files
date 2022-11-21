package ReviewClass.class12;

import java.util.Objects;

public class Student {
    String name;
    String lname;
    int rollNo;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public Student(String name, String lname, int rollNo) {
        this.name = name;
        this.lname = lname;
        this.rollNo = rollNo;

    }
    void printName(){
        System.out.println(name+" "+lname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name) && Objects.equals(lname, student.lname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lname, rollNo);
    }
}
