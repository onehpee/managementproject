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
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

}
