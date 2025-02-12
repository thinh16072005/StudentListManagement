package controller;

<<<<<<< HEAD:src/controller/Main.java
import model.Address;
=======
import model.BizStudent;
import model.ITStudent;
>>>>>>> 99c6090022bdcfe2969fb57b997086a5ec6ac50d:src/controller/Launcher.java
import model.School;
import view.Menu;
import view.Validation;

public class Launcher extends Menu {
    School school = new School();

    static String[] options = {
        "Display student list",
        "Sort students by name",
        "Student statistics by city",
        "Update/Delete students",
        "Passed Report",
        "Exit"
    };

    public Launcher(String title, String[] options) {
        super(title, options);
    }
    
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> school.displayStudentList();
            case 2 -> school.sortStudents((s1, s2) -> s1.getFullName().compareTo(s2.getFullName()));
            case 3 -> school.studentStatistics(student -> true, "city");
            case 4 -> updateDelete();
            case 5 -> reportPassedStudents();
            case 6 -> System.exit(0);
        }
    }

    private void enterStudentInfo() {
        String fullName = Validation.checkString("Full Name: ", "Name must be LETTERS ONLY!", "[a-zA-Z ]+");
        String city = Validation.checkString("City: ", "City must be LETTERS ONLY!", "[a-zA-Z ]+");
        String district = Validation.checkString("District: ", "District must be LETTERS ONLY!", "[a-zA-Z ]+");
        String street = Validation.getValue("Street: ");
<<<<<<< HEAD:src/controller/Main.java
        double score1 = Validation.checkDouble("Score 1: ", "Score must be from 0.0 to 10.0!");
        double score2 = Validation.checkDouble("Score 2: ", "Score must be from 0.0 to 10.0!");
        return new Student(id, fullName, Address(city, district, street));
=======
        
>>>>>>> 99c6090022bdcfe2969fb57b997086a5ec6ac50d:src/controller/Launcher.java
    }
    
    private void updateDelete() {
        System.out.println("Enter student's ID: ");
        String id = Validation.checkString("ID: ", "ID must be NUMBERS ONLY!", "[1-10]");
        if (school.searchStudents(student -> student.getId().equals(id)).isEmpty()) {
            System.err.println("Student ID not found!");
            return;
        } else {
            System.out.println("Student found: ");
            System.out.println(school.searchStudents(fruit -> fruit.getId().equals(id)).get(0));
            System.out.println("Do you want to update (U) or delete (D) this student? Or press any key to exit. ");
            char choice = Validation.checkString("Enter your choice: ", "Invalid choice!", "[UD]").charAt(0);
            switch (choice) {
                case 'U' -> {
                    // school.updateStudent(id, enterStudentInfo());
<<<<<<< HEAD:src/controller/Main.java
=======
                    System.out.println("Student updated!");
>>>>>>> 99c6090022bdcfe2969fb57b997086a5ec6ac50d:src/controller/Launcher.java
                }
                case 'D' -> {
                    school.deleteStudent(id);
                    System.out.println("Student deleted!");
                }
                default -> {
                    return;
                }
            }
        }

    }
    
    public void reportPassedStudents() {
        System.out.println("Passed students: ");
        school.searchStudents(student -> student instanceof ITStudent && student.isPassed())
            .forEach(System.out::println);

        school.searchStudents(student -> student instanceof BizStudent && student.isPassed())
            .forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        Launcher main = new Launcher("----------Student Management System---------", options);
        main.run();
    }
    
}
