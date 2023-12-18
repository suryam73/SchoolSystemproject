package org.student_system;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        
        Student std1 = new Student("Sasi", "kumar", 1201, 95, 3);
        Student std2 = new Student("Kani", "meera", 1202, 70, 3);
        Student std3 = new Student("Sakthi","Kumar", 1203, 58,0);
        Student std4 = new Student("Anish", "Banu", 1204, 97, 1);
        Student std5 = new Student("Sakthi", "vel", 1205, 68, 1);
           Course sub = new Course("Junior Java Fillstack Developer", "Prof. Annamalai", 2024);

       
        sub.enroll(std1);
        sub.enroll(std2);

        System.out.println("list Number Of Students in JSD class BEFORE Entroll :");
        System.out.println("Number of students: " + sub.countStudents());
        System.out.println("Best grade in the course: " + sub.bestGrade() );

   
        List<Student> studentList = Arrays.asList(std3,std4,std5);
        sub.enroll(studentList);
        
        System.out.println();
       
        System.out.println("list Number Of Students in JSD class AFTER Entroll :");
        System.out.println("Number of students after enrolling a list: " + sub.countStudents());
        System.out.println("Best grade in the course after enrolling a list: " + sub.bestGrade());
    }
}