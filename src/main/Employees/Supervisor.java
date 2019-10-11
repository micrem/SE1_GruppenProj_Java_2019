package Employees;

import java.util.Date;

public class Supervisor extends Employee {
    private boolean isSenior;
    private boolean isExecutive;

    public Supervisor(int pid, String pname, Date pbirthDate, boolean pisSenior, boolean pisExecutive) {
        super(pid, pname, pbirthDate);
        this.isSenior=pisSenior;
        this.isExecutive=pisExecutive;
    }
}