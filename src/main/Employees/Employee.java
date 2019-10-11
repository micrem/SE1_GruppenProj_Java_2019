package Employees;
import java.util.Date;

public abstract class Employee {

    protected int id;
    protected String name;
    protected Date birthDate;

    public Employee(int pid, String pname, Date pbirthDate){
        this.id=pid;
        this.name=pname;
        this.birthDate=pbirthDate;
    }
}
