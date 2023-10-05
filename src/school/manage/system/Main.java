package school.manage.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1,"Tamasha",4);
        Student adedayo = new Student(2,"Adedayo",12);
        Student steve = new Student(3,"Steve",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(adedayo);
        studentList.add(steve);

        School hfh = new School(teacherList, studentList);

        Teacher megan =new Teacher(6,"Megan",900);

        hfh.addTeachers(megan);

        tamasha.payFees(5000);
        adedayo.payFees(6000);
        System.out.println("HFH has earned $"+hfh.getTotalMoneyEarned());


        System.out.println("--------MAKING HFH SCHOOL PAY SALARY-------------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("HFH has payed the salary of "+ lizzy.getName()+" and now has "+ hfh.getTotalMoneyEarned());
        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("HFH has payed the salary of "+ vanderhorn.getName()+" and now has "+ hfh.getTotalMoneyEarned());
        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println(adedayo);
        System.out.println(mellisa);
    }
}
