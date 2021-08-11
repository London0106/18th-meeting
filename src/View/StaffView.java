/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.StaffController;
import Model.Staff;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class StaffView {

    public StaffController cont = new StaffController();
    int menu, i, id, date_birth;
    String name;

    public void menu(Scanner scanner) {
        do {
            System.out.println("==--Staff Menu--==");
            System.out.println("1.add staff");
            System.out.println("2.show staff");
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    
                    Staff staff = new Staff();
                    id = cont.staff.getStaffs().size() + 1;
                    staff.setid(id);
                    System.out.println("id = " + id);
                    System.out.println("==--add staff--==");
                    System.out.println("name = ");
                    staff.setName(scanner.next());
                    System.out.println("date birth = ");
                    staff.setDate_Birth(scanner.nextInt());

                    cont.staff.addStaffs(staff);
                    break;
                case 2:
                    for (Staff staff1 : cont.staff.getStaffs()) {
                        System.out.println("==--show staff--==");
                        System.out.println("id = " + staff1.getId());
                        System.out.println("name = " + staff1.getName());
                        System.out.println("date birth = " + staff1.getDate_Birth());
                    }
                    break;
            }

        } while (i != 0);
    }
}
