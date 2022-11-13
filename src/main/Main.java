package main;

import beans.Student;
import main.student.Config;
import util.InputUtil;
import util.StudentUtil;

import java.util.Arrays;

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
            }else if (menu ==4){
                StudentUtil.printAllRegisteredStudents();
                int i = InputUtil.requireNumber("Which student you want to edit?");
                System.out.println("Please enter new data");
                Student s =StudentUtil.fillStudent();
                Config.students[i-1]=s;
            }


        }
    }
}