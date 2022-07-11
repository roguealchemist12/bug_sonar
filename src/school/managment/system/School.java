package school.managment.system;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and students using an ArrayList.
 */
public class School {

    private List<Teacher> teacher;
    private List<Student> student;
    private int totalMoneyEarned;
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

    public void updateTotalMoneyEarned(int MoneyEarned) {
        this.totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
