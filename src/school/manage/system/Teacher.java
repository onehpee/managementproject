package school.manage.system;

/**
 * This class is responsible for keeping track
 * of teacher's id, name, salary
 */
public class Teacher {
    private  int id;
    private  String name;
    private  int salary;


    /**
     * Creates a new Teacher object
     * @param id id of the teacher:unique
     * @param name name of the Teacher
     * @param salary salary of the Teacher
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    /**
     *
     * @return the id of the teacher
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return the name of the teacher
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return salary of the Teacher
     */
    public  int getSalary(){
        return salary;
    }

    /**
     * Set the Teachers salary
     * @param salary Teachers current salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }


}
