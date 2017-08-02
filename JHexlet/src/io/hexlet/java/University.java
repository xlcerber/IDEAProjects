package io.hexlet.java;
import java.util.*;

class University {
    private final String name;

    private final String address;

    private final List students;

    public University(final String name, final String address) {
        this.name = name;
        this.address = address;
        students = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List getStudentsList() {
        return students;
    }

    public void showAllStudents() {
        for (Object student : students) {
            System.out.println(student);
        }
    }
    // BEGIN (write your solution here)
    static University.Student createStudent(final University univ, final String name, final int grade){
        University.Student newStudent = univ.new Student(name, grade);
        return newStudent;
    }
    // END

    // public static class Student {

    // 	private final String name;

    // 	private final int grade;

    // 	public Student(final String name, final int grade) {
    // 		this.name = name;
    // 		this.grade = grade;
    // 	}

    // 	@Override
    // 	public String toString() {
    // 		return String.format("name: %s, grade: %d", name, grade);
    // 	}

    // 	public String getName() {
    // 		return name;
    // 	}

    // 	public int getGrade() {
    // 		return grade;
    // 	}

    // }

    // BEGIN (write your solution here)
     public class Student {

     	private final String name;

     	private final int grade;





     	public Student(final String name, final int grade) {
     		this.name = name;
     		this.grade = grade;
     	}

     	@Override
     	public String toString() {
     		return String.format("name: %s, grade: %d", name, grade);
     	}

     	public String getName() {
     		return name;
     	}

     	public int getGrade() {
     		return grade;
     	}

        public University getUniversity(){
            return University.this;
        }

     }
    // END
}
