package school.managment.system;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and students using an ArrayList.
 */
public class School {

    private List<Teacher> teacher;
    private List<Student> student;
    private static int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * New school object is created
     * @param teacher list of teachers in the school
     * @param student list of students in the school
     */
    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return list of teachers in the school
     */
    public List<Teacher> getTeacher() {
        return teacher;
    }

    /**
     * Adds a teacher to the school.
     * @param _teacher the teacher to be added
     */
    public void addTeacher(Teacher _teacher) {
        teacher.add(_teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudent() {
        return student;
    }

    /**
     * Adds a student to the school.
     * @param _student the student to be added
     */
    public void addStudent(Student _student) {
        student.add(_student);
    }

    /**
     *
     * @return total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *
     * @param MoneyEarned updates the money earned in the school.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by a school.
     * it is the salary given by the school to its teachers.
     * @param moneySpent money spent by the school
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

}
