package Employees;

import BaggageScanner.OperatingStation;

import java.util.Date;

public class InspectorOperationStation extends Inspector{
    OperatingStation assignedOS;
    public InspectorOperationStation(int pid, String pname, Date pbirthDate, boolean pisSenior, OperatingStation passignedOS) {
        super(pid, pname, pbirthDate, pisSenior);
        this.assignedOS=passignedOS;
    }
}
