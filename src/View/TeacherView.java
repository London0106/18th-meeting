/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TeacherController;
import Model.Subject;
import Model.Teacher;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TeacherView {

    public TeacherController cont = new TeacherController();
    

    int main, Mteacher;

    public void menu(Scanner scanner, Subject subject) {
        do {
            System.out.println("---teacher menu---");
            System.out.println("[1] add teacher's data");
            System.out.println("[2] show teacher's data");
            System.out.println("[3] add teacher's subject");
            System.out.println("[4] show teacher's subject");
            System.out.println("[0] back");
            System.out.println("input menu :");
            Mteacher = scanner.nextInt();
            switch (Mteacher) {
                case 1:
                    cont.teacher.addTeachers(
                            addTeacher(
                                    scanner,
                                    cont.teacher.getTeachers().size() + 1
                            )
                    );
                    break;
                case 2:
                    showTeacher(cont.teacher.getTeachers());
                    break;
                case 3:
                    showTeacher(cont.teacher.getTeachers());
                    subject.showSubjects(subject.getSubjects());
                    System.out.println("chose teacher's id : ");
                    int id = scanner.nextInt() - 1;
                    System.out.println("chose subject's id : ");
                    cont.teacher.getTeachers()
                            .get(id)
                            .addSubjects(subject.getSubjects()
                                    .get(scanner.nextInt() - 1));
                    break;
                case 4:
                    showSubject(cont.teacher.getTeachers());
                    break;
            }

        } while (Mteacher != 0);
    }

    public Teacher addTeacher(Scanner scanner, int id) {
        System.out.println("teachers id : " + id);
        System.out.println("teachers name : ");
        cont.teacher.setName(scanner.next());
        System.out.println("teachers birth date : ");
        cont.teacher.setDateBirth(scanner.next());

        return new Teacher(id, cont.teacher.getName(), cont.teacher.getDateBirth());
    }

    public void showTeacher(List<Teacher> teachers) {
        if (teachers.size() == 0) {
            System.out.println("there are no teacher on the list");
        } else {
            System.out.println("===---TEACHERS---===");
            for (Teacher teacher : teachers) {
                System.out.println("id :" + teacher.getTeacherID() + " | name :" + teacher.getName() + " | birth date :" + teacher.getDateBirth());
            }
        }
    }

    public void showSubject(List<Teacher> teachers) {
        if (teachers.size() == 0) {
            System.out.println("there are no teacher on the list");
        } else {
            System.out.println("===---TEACHERS---===");
            for (Teacher teacher : teachers) {
                System.out.println("id :" + teacher.getTeacherID() + " | name :" + teacher.getName() + " | birth date :" + teacher.getDateBirth());
                if (teacher.getSubjects().size() != 0) {
                    System.out.println("     ===---SUBJECTS---===");
                    for (Subject subject : teacher.getSubjects()) {
                        System.out.println("     id :" + subject.getSubjectID() + " | name :" + subject.getName());
                    }
                }
            }
        }
    }
}
