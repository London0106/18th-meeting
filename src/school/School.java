/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import Model.Student;
import Model.Subject;
import Model.Teacher;
import View.StaffView;
import View.StudentView;
import View.SubjectView;
import View.TeacherView;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author London
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Subject subject = new Subject();
        Teacher teacher = new Teacher();
        Student student = new Student();
        TeacherView teacherView = new TeacherView();
        
        StudentView studentView = new StudentView();
        SubjectView subjectView = new SubjectView();
        StaffView staffView = new StaffView();
       int main, Mstudent, Mteacher, Msubject;

        do {
            System.out.println("---main menu---");
            System.out.println("[1] teacher's menu");
            System.out.println("[2] student's menu");
            System.out.println("[3] subject's menu");
            System.out.println("[4] staff's menu");
            System.out.println("[0] exit");
            System.out.println("input menu :");
            main = scanner.nextInt();
            switch (main) {
                case 1:
                    teacherView.menu(scanner, subject);
                    break;
                case 2:
                     studentView.menu(scanner,subject);
                    break;
                case 3:
                    subjectView.menu(scanner, subject);
                    break;
                case 4 :
                    staffView.menu(scanner);
                    break;
                case 0:
                    break;
            }

        } while (main != 0);

    }

}
