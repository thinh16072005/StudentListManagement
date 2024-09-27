package test;

import model.StudentManager;

public class StudentTest {

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.addStudent();
        System.out.println("List of students: ");
        sm.displayStudentList();
        
        System.out.println("Student sorted:");
        sm.sortStudentByName();
    }
}
