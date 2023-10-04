package school.manage.system;

import java.util.List;

/**
 * The School has many students and teachers
 * in an ArrayList
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * New School object is created
     * @param teachers List of Teachers in the School
     * @param students List of Students in the School
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return List of Teachers in the School
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the School
     * @param teacher The teacher that is being added to School
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return List of Students in the School
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @param student The Student being added to the School
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return The total money earned in the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *Add money to the total of the school
     * @param MoneyEarned money that is being added
     */
    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money earned
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school
     * This is money given to the Teachers from the School
     * @param MoneySpent money spent by the school
     */
    public void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
