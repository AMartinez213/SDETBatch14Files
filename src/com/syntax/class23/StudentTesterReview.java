package com.syntax.class23;

public class StudentTesterReview {
    public static void main(String[] args) {

        Student[] arr={new CollegeStudent(),new SyntaxStudent(),new SchoolStudent()};

        for (Student st:arr
             ) {
            st.study();
            st.doHomeWork();
            st.doPractice();
        }
    }
}
