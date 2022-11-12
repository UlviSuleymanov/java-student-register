package main;

import util.InputUtil;
import util.StudentUtil;

public class Main {
    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.requireNumber("What do you to do?"
                    + "\n1. Register Student"
                    + "\n2. Show all students"
                    + "\n3. Find student"
                    + "\n4. Update student"
            );
            if (menu == 1) {
                StudentUtil.registerStudents();
            } else if (menu == 2) {
                StudentUtil.printAllRegisteredStudents();
            } else if (menu == 3) {
                StudentUtil.findStudentsAndPrint();
            }


        }
    }
}