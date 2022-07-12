package school.managment.system;

/**
 * This class is responsible for keeping the track of teacher's name, id and salary.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * Creates a new Teacher object
     * @param _id id for the teacher.
     * @param _name name for the teacher.
     * @param _salary salary of the teacher.
     */
    public Teacher(int _id, String _name, int _salary)
    {
        id = _id;
        name = _name;
        salary = _salary;
    }

    /**
     *
     * @return the id of the teacher
     */
    public int getId()
    {
        return id;
    }

    /**
     *
     * @return the name of the teacher
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return the salary of the teacher
     */
    public int getSalary()
    {
        return salary;
    }

    /**
     * Set the salary for the teacher
     * @param s salary value
     */
    public void setSalary(int s)
    {
        salary = s;
    }

}
