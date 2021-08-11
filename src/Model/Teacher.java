/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Teacher {

    private String name, dateBirth;
    private int teacherID;
    private List<Subject> subjects = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public Teacher(int teacherID, String name, String dateBirth) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.teacherID = teacherID;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addSubjects(Subject subject) {
        this.subjects.add(subject);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public Teacher addTeacher(Scanner scanner, int id) {
        System.out.println("teachers id : " + id);
        System.out.println("teachers name : ");
        name = scanner.next();
        System.out.println("teachers birth date : ");
        dateBirth = scanner.next();

        return new Teacher(id, name, dateBirth);
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
                    System.out.println("     ===---SEUBJECTS---===");
                    for (Subject subject : teacher.getSubjects()) {
                        System.out.println("     id :" + subject.getSubjectID() + " | name :" + subject.getName());
                    }
                }
            }
        }
    }
}
