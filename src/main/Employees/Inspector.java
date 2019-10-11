package Employees;

import java.util.Date;

public class Inspector extends Employee {
    private boolean isSenior;

    public Inspector(int pid, String pname, Date pbirthDate, boolean pisSenior) {
        super(pid, pname, pbirthDate);
        this.isSenior=pisSenior;
    }
}
