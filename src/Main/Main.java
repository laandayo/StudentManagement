package Main;

import Model.Student;
import java.util.ArrayList;
import Controller.Manager;
import Controller.Validation;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        Validation validation = new Validation();
        int count = 3;
        while (true) {
            Manager.menu();
            int choice = validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    Manager.createStudent(count, ls);
                    break;
                case 2:
                    Manager.findSort(ls);
                    break;
                case 3:
                    Manager.updateDelete(count, ls);
                    break;
                case 4:
                    Manager.report(ls);
                    break;
                case 5:
                    return;
            }

        }
    }

}