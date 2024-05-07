package model.child.job;


import model.parent.EmployeeTech;
import model.parent.Placement;

public class ProjectLeader extends EmployeeTech {
    
    private int totalProject;
   
    public ProjectLeader(String employeeId,String name, String address, int age,  String jobDesc,
            Placement placement, int totalProject) {
        super(employeeId, name, address, age,  jobDesc, placement);
        this.totalProject = totalProject;
        calculateSalaryEmployee();
        calculateAllowance();
        
        
    }

    @Override
    public void calculateSalaryEmployee() {
        // TODO Auto-generated method stub
        setSalary(getPlacement().getUMK()*PRESENTASE_SALARY[2]);    
    
    }



    @Override
    public void calculateAllowance() {
        // TODO Auto-generated method stub
        int idx = 0;
        if(getTotalProject()>= THRESHOLD_PROJECT_LEADER){
            idx=1;
        }
        setAllowance(getSalary()*PRESENTASE_PROJECT_LEADER[idx]);
    }

    

    public int getTotalProject() {
        return totalProject;
    }
    public void setTotalProject(int totalProject) {
        this.totalProject = totalProject;
    }
    
    
}
