package Employees;

import BaggageScanner.RollerConveyer;

import java.util.Date;


public class InspectorRollerConveyer extends Inspector {

    RollerConveyer assignedConveyer;
    public void ExecutePush(){
        //this.assignedConveyer.push(); //doesnt exist yet
    }

    public InspectorRollerConveyer(int pid, String pname, Date pbirthDate, boolean pisSenior, RollerConveyer passignedConveyer) {
        super(pid, pname, pbirthDate, pisSenior);
        this.assignedConveyer=passignedConveyer;
    }


}
