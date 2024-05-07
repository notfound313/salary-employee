package model.parent;

import interfaces.AllowanceInterface;

public abstract class EmployeeTech extends EmployeeUmum implements AllowanceInterface{

    private double allowance;

    public EmployeeTech(String employeeId, String name, String address, int age, String jobDesc,
            Placement placement) {
        super(employeeId,name, address, age, jobDesc, placement);
        
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    
    
    
}
