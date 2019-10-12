package Employees;

import java.util.Date;
import BaggageScanner.ManualPostControl;
public class InspectorManualPostControl extends Inspector implements iInspectorManualPostControl {
    ManualPostControl assignedMPC;

    public InspectorManualPostControl(int pid, String pname, Date pbirthDate, boolean pisSenior, ManualPostControl passignedMPC) {
        super(pid, pname, pbirthDate, pisSenior);
        this.assignedMPC=passignedMPC;
    }
    @Override
    public void ConfiscateKnife(){
        //entfernt Messer
    }
    @Override
    public void NeutralizeExplosive(){
        //neutralisiert Sprengstoff
    }
    @Override
    public void PushBack(){
        //Gepaeck zur Kontrolle nochmals abgeben
    }
}
