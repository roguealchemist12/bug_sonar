package school.managment.system;
//Class for students id fees names grade ..
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     *
     * Fees for every student is $30k
     * Fees paint initially is 0.
     * @param id id for the student: unique.
     * @param name name for the student.
     * @param grade grade for the student
     */
    //Create new student object by initializing values.
    public Student(int id, String name, int grade)
    {
        feesPaid = 0;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not going to alter student's name, id.
    //press forward slash star star twice // and endter

    /**
     * Used to update the student's grade.
     * @param g new grade of the student
     */
    public void setGrade(int g)
    {
        grade = g;
    }

    /**
     *
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * @param fees
     */
    public void payFees(int fees)
    {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return the id of the student
     */
    public int getId() {
        return id;
    }
    /**
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }
    /**
     *
     * @return the feesPaid of the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }
    /**
     *
     * @return the feesTotal of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees()
    {
        return feesTotal - feesPaid;
    }
}
