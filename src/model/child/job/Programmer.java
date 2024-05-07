package model.child.job;



import model.parent.EmployeeTech;

import model.parent.Placement;

public class Programmer extends EmployeeTech  {

    private String programmingLanguage;
    private int experience;
    
    
    public Programmer(String employeeId,String name, String address, int age,  String jobDesc,
            Placement placement, String programmingLanguage, int experience) {
        super(employeeId,name, address, age,  jobDesc, placement);
        this.programmingLanguage = programmingLanguage;
        this.experience = experience;
        calculateSalaryEmployee();
        calculateAllowance();
    }

    @Override
    public void calculateSalaryEmployee() {
        // TODO Auto-generated method stub
        setSalary(getPlacement().getUMK()*PRESENTASE_SALARY[1]);
        
    }

    @Override
    public void calculateAllowance() {
        // TODO Auto-generated method stub
        int idx = 0;
        if(getExperience() > THRESHOLD_PROGRAMMER){
            idx = 1;
        }

        setAllowance(getSalary()*PRSESENTASE_PROGRAMMER[idx]);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

   



    

    

    
}
