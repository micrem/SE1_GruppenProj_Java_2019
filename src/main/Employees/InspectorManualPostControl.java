package Employees;

import java.util.Date;
import BaggageScanner.ManualPostControl;
public class InspectorManualPostControl extends Inspector {
    ManualPostControl assignedMPC;
    public void ExecuteKnifeConfiscation(){
        //this.assignedMPC.KnifeCOnfiscation(); //doesnt exist yet
    }
    public void ExecuteButtonLeft(){
        //this.assignedMPC.PushButtonLeft(); //doesnt exist yet
    }
    public InspectorManualPostControl(int pid, String pname, Date pbirthDate, boolean pisSenior, ManualPostControl passignedMPC) {
        super(pid, pname, pbirthDate, pisSenior);
        this.assignedMPC=passignedMPC;
    }
}
