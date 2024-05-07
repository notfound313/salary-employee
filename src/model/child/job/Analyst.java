package model.child.job;


import model.parent.EmployeeTech;
import model.parent.Placement;

public class Analyst extends EmployeeTech {

   

    public Analyst(String employeeId,String name, String address, int age,  String jobDesc,
            Placement placement) {
        super(employeeId,name, address, age , jobDesc, placement);
        calculateSalaryEmployee();
        calculateAllowance();
       
    }

    @Override
    public void calculateSalaryEmployee() {
        // TODO Auto-generated method stub
        setSalary(getPlacement().getUMK()*PRESENTASE_SALARY[3]);
        
    }

    @Override
    public void calculateAllowance() {
        // TODO Auto-generated method stub
        setAllowance(getSalary()*PRESENTASE_ANALYST);
    }

    
    
    
}
