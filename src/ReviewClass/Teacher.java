package ReviewClass;

public class Teacher {

    String name, lastName;

    int experience;
    String subject;
    double salary;

    static String school;

    /*how to create a constructor
     * 1.Constructor name=classname
     * 2.No return type not even void
     */

    //using below constructor we initialize instance variable (name, lastName)
    Teacher(String fname,String lName){
        name=fname;
        lastName=lName;
    }

    /*When you create a constructor
     *Compilier is NOT going to create a default constructor for you
     */

    void print(){
        System.out.println(name+" "+lastName);
    }

}
