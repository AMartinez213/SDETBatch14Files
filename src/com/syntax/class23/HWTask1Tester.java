package com.syntax.class23;

public class HWTask1Tester {
    public static void main(String[] args) {
        Student[] arr={new CollegeStudent(),new SyntaxStudent(),new Student()};
        for(Student st:arr){
            st.study();
            st.doHomeWork();
            st.doPractice();
        }
    }
}
