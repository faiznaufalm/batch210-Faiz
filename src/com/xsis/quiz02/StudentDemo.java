package com.xsis.quiz02;

public class StudentDemo {
    public static void main(String[] args) {
        Student std1 = new Student("6123", "Kang", "Informatika");
        Student std2 = new Student("6124", "Bojo", "Komputer");
        Student std3 = new Student("6125", "Neng", "Matematka");
        Student std4 = new Student("6126", "Ike", "English");
        //Student std5 = new Student("6127","Udin","Biology");

        //System.out.println(std1.toString());
        System.out.println("Total Student = " + Student.totalStudent);


    }


}
