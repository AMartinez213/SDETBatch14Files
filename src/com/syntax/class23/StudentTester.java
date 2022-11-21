package com.syntax.class23;

public class StudentTester {

    public static void main(String[] args) {

        Student [] arr={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

        for (Student st:arr
             ) {
            st.study();
            st.doHomeWork();
            st.doPractice();
        }

    }
}
