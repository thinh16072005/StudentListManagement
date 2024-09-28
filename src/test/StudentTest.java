package test;

import model.School;

public class StudentTest {

    public static void main(final String[] args) {
        final School sm = new School();
        sm.addStudent();
        System.out.println("List of students: ");
        sm.displayStudentList();

        System.out.println("Student sorted:");
        sm.sortStudents((s1, s2) -> s1.getFullName().compareTo(s2.getFullName()));

        System.out.println("Student statistics by city:");
        sm.studentStatistics(student -> true, "city");
    }
}
