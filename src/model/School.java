package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class School {
    private final ArrayList<Student> studentList = new ArrayList<>();
    private final ITStudent itStudent = new ITStudent();
    private final BizStudent bizStudent = new BizStudent();

    public School() {
    }

    public ArrayList<Student> getStudents() {
        return studentList;
    }

    public void addStudent() {
        studentList.add(new ITStudent("1", "Nguyen Van A", new Address("Vietnam", "Da Nang", "Hai Chau", "Hung Vuong"), 8.0, 9.0, itStudent.getItAvgScore()));
        studentList.add(new ITStudent("2", "Nguyen Van C", new Address("Vietnam", "Da Nang", "Hoa Vang", "Nguyen Phuoc Lan"), 8.5, 9.0, itStudent.getItAvgScore()));
        studentList.add(new ITStudent("3", "Nguyen Van B", new Address("Vietnam", "Da Nang", "Hai Chau", "Hung Vuong"), 8.0, 9.0, itStudent.getItAvgScore()));
        studentList.add(new ITStudent("4", "Nguyen Hai Duong", new Address("Vietnam", "Quang Nam", "Hoi An", "Phan Chau Trinh"), 8.5, 0.0, itStudent.getItAvgScore()));
        studentList.add(new ITStudent("5", "Nguyen Van Phong", new Address("Vietnam", "Quang Binh", "Dong Hoi", "Hung Vuong"), 8.5, 9.0, itStudent.getItAvgScore()));
        
        studentList.add(new BizStudent("6", "Nguyen Hong Hanh", new Address("Vietnam", "Da Nang", "Hai Chau", "Hung Vuong"), 5.5, 9.0, bizStudent.getBizAvgScore()));
        studentList.add(new BizStudent("7", "Nguyen Thai Vinh", new Address("Vietnam", "Da Nang", "Hai Chau", "Hung Vuong"), 5.5, 0.0, bizStudent.getBizAvgScore()));
        studentList.add(new BizStudent("8", "Nguyen Truong Minh", new Address("Vietnam", "Da Nang", "Hai Chau", "Hung Vuong"), 5.5, 9.0, bizStudent.getBizAvgScore()));
        studentList.add(new BizStudent("9", "Nguyen Thi Hang", new Address("Vietnam", "Nghe An", "Hoi An", "Le Loi"), 7.0, 8.0, bizStudent.getBizAvgScore()));
        studentList.add(new BizStudent("10", "Nguyen Dong Ha", new Address("Vietnam", "Quang Nam", "Hoi An", "Le Loi"), 7.0, 0.0, bizStudent.getBizAvgScore()));
    }

    public void displayStudentList() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    
    public void sortStudents(Comparator<Student> c1) {
        studentList.sort(c1);
        displayStudentList();
    }
    
    public void studentStatistics(Predicate<Student> condition, String attribute) {
        Map<String, Integer> countMap = new HashMap<>();
        for (Student student : studentList) {
            if (condition.test(student)) {
                String key = "";
                switch (attribute) {
                    case "city" -> key = student.getAddress().getCity();
                    case "district" -> key = student.getAddress().getDistrict();
                    case "street" -> key = student.getAddress().getStreet();
                }
                countMap.put(key, countMap.getOrDefault(key, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println("- " + entry.getKey() + ": \t" + entry.getValue());
        }
    }
    
    public ArrayList<Student> searchStudents(Predicate<Student> p1) {
        ArrayList<Student> searchResult = new ArrayList<>();
        for (Student student : studentList) {
            if (p1.test(student)) searchResult.add(student);
        }
        return searchResult;
    }
    
    public void updateStudent(String id, Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.set(i, student);
                break;
            }
        }
    }

    public void deleteStudent(String id) {
        studentList.removeIf(student -> student.getId().equals(id));
    }
}
