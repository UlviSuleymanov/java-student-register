package util;

import beans.Student;
import main.student.Config;

public class StudentUtil {
    public static Student fillStudent(){
        String name = InputUtil.requireText("enter name");
        String surname = InputUtil.requireText("enter surname");
        String className = InputUtil.requireText("enter class");
        int age = InputUtil.requireNumber("enter age");
        Student st = new Student(name,surname,age, className);
        return st;
    }
    public static void printAllRegisteredStudents(){
        if(Config.students==null){
            return;
        }
        for(int i=0; i<Config.students.length; i++){
            Student st = Config.students[i];
            System.out.println(st.getFullInfo());
        }
    }
    public static void registerStudents(){
        int count = InputUtil.requireNumber("How many students do you want to register?");
        Config.students=new Student[count];
        for(int i=0; i<count; i++){
            System.out.println((i+1)+".Register");
            Config.students[i]=StudentUtil.fillStudent();
        }
        System.out.println("Registration is completed successfully");
        StudentUtil.printAllRegisteredStudents();
    }

    public  static  void findStudentsAndPrint(){
        String text = InputUtil.requireText("Please enter search query");
        Student[] result = findStudents(text);
        for(int i =0; i<result.length; i++){
            System.out.println(result[i].getFullInfo());
        }

    }

    public static Student[] findStudents(String text){
        int count = 0;
        for (int i =0; i<Config.students.length; i++){
            Student st = Config.students[i];
            if(st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)){
                count++;
            }
        }
        Student[] result= new Student[count];
        int found =0;
        for(int i =0; i<Config.students.length; i++){
            Student st = Config.students[i];
            if(st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)){
                result[found]=st;
                found++;
            }
        }
        return result;
    }


}
