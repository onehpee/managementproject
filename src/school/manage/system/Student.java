package school.manage.system;

/**
 * This class is responsible for keeping
 * track of student fees, name, grade and fees
 * */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * Constructor
     * initializes a newly created object of that type
     * by initializing the values
     * Fee for every student is $30,000
     * Fees paid initially is $0
     * @param id id for the student: unique
     * @param name name of the student.
     * @param grade grade of the student
     */
    public Student(int id, String name, int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //Students name,id won't be altered

    /**
     * Used to update the students grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * Keep adding the fees to feesPaid field
     * feespaid = $10,000 + $5000 = $15,000
     * Add the fees to the fees paid
     * The school is going to receive the funds
     * @param fees the fees that the student pays
     */
    public void updateFeesPaid(int fees){
        feesPaid+=fees;
    }

    /**
     *
     * @return the id of the Student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the Student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the Student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the feesPaid by the Student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the Student
     */
    public int getFeesTotal() {
        return feesTotal;
    }
}
