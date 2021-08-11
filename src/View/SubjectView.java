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
public class SubjectView {
    public StudentController cont = new StudentController();
    int menu, Msubject;
    
    public void menu(Scanner scanner, Subject subject){
        do {
                        System.out.println("---subject menu---");
                        System.out.println("[1] add subject's data");
                        System.out.println("[2] show subject's data");
                        System.out.println("[0] back");
                        System.out.println("input menu :");
                        Msubject = scanner.nextInt();
                        switch (Msubject) {
                            case 1:
                                break;
                            case 2:
                                subject.showSubjects(subject.getSubjects());
                                break;
                        }

                    } while (Msubject != 0);
        
   
    }
}
