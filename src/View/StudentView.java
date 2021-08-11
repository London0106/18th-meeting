/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.StudentController;
import Model.Student;
import Model.Subject;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class StudentView {
    public StudentController cont = new StudentController();
    int menu;
    
    public void menu(Scanner scanner, Subject subject){
        do {
            System.out.println("---student menu---");
            System.out.println("[1] add student's data");
            System.out.println("[2] show student's data");
            System.out.println("[3] add student's subject");
            System.out.println("[4] show student's subject");
            System.out.println("[0] back");
            System.out.println("input menu :");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    cont.student.addStudents(
                            addStudent(
                                    scanner,
                                    cont.student.getStudents().size() + 1
                            )
                    );
                    break;
                case 2:
                    showStudent(cont.student.getStudents());
                    break;
                case 3:
                    showStudent(cont.student.getStudents());
                    subject.showSubjects(subject.getSubjects());
                    System.out.println("chose student's id : ");
                    int id = scanner.nextInt()-1;
                    System.out.println("chose student's id : ");
                    cont.student.getStudents()
                            .get(id)
                            .addSubjects(subject.getSubjects()
                                    .get(scanner.nextInt()-1));
                    break;
                case 4:
                    showSubject(cont.student.getStudents());
                    break;
            }

        } while (menu != 0);
    }
    
    public Student addStudent(Scanner scanner, int id) {
        System.out.println("student id : " + id);
        System.out.println("student name : ");
        cont.student.setName(scanner.next());
        System.out.println("student birth date : ");
        cont.student.setDateBirth(scanner.next());

        return new Student(id, cont.student.getName(), cont.student.getName());
    }
    
    public void showStudent(List<Student> students) {
        if (students.size() == 0) {
            System.out.println("there are no student on the list");
        } else {
            System.out.println("===---STUDENTS---===");
            for (Student student : students) {
                System.out.println("id :" + student.getStudentID() + " | name :" + student.getName() + " | birth date :" + student.getDateBirth());
            }
        }
    }
    
    public void showSubject(List<Student> students) {
        if (students.size() == 0) {
            System.out.println("there are no teacher on the list");
        } else {
            System.out.println("===---TEACHERS---===");
            for (Student student : students) {
                System.out.println("id :" + student.getStudentID() + " | name :" + student.getName() + " | birth date :" + student.getDateBirth());
                if (student.getSubjects().size() != 0) {
                    System.out.println("     ===---SEUBJECTS---===");
                    for (Subject subject : student.getSubjects()) {
                        System.out.println("     id :" + subject.getSubjectID() + " | name :" + subject.getName());
                    }
                }
            }
        }
    }
    
}
