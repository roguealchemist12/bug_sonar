package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",26000);
        Teacher trajko = new Teacher(2,"Trajko",1000000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(trajko);

        Student davidmonster = new Student(420,"DAVID MONSTER",4);
        Student alicopter = new Student(69, "Ali Cow God", 4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(davidmonster);
        studentList.add(alicopter);
        School UZUS = new School(teacherList, studentList);


        davidmonster.payFees(50200);
        System.out.println(UZUS.getTotalMoneyEarned());


    }
}
