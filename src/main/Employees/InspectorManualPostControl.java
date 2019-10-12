package Employees;

import java.util.Date;
import BaggageScanner.ManualPostControl;
public class InspectorManualPostControl extends Inspector {
    ManualPostControl assignedMPC;

    public InspectorManualPostControl(int pid, String pname, Date pbirthDate, boolean pisSenior, ManualPostControl passignedMPC) {
        super(pid, pname, pbirthDate, pisSenior);
        this.assignedMPC=passignedMPC;
    }
}
