/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Subject {

    private int subjectID;
    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public Subject(int subjectID, String name) {
        this.subjectID = subjectID;
        this.name = name;
    }

    public Subject() {
        addSubjects(new Subject(1, "Math"));
        addSubjects(new Subject(2, "Biology"));
        addSubjects(new Subject(3, "Physic"));
        addSubjects(new Subject(4, "Chemistry"));
        addSubjects(new Subject(5, "English"));
        addSubjects(new Subject(6, "Art"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
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

    public void showSubjects(List<Subject> subjects) {
        if (subjects.size() == 0) {
            System.out.println("there are no subject on the list");
        } else {
            System.out.println("===---SEUBJECTS---===");
            for (Subject subject : subjects) {
                System.out.println("id :" + subject.getSubjectID() + " | name :" + subject.getName());
            }
        }
    }

}
