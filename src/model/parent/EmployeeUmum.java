package model.parent;

import interfaces.SalaryInterface;

public  class EmployeeUmum extends Person implements SalaryInterface{

    private String employeeId;
    private double salary;
    private String jobDesc;
    private Placement placement;
    public EmployeeUmum(String employeeId,String name, String address, int age,  String jobDesc,
            Placement placement) {
        super(name, address, age);
        this.employeeId = employeeId;        
        this.jobDesc = jobDesc;
        this.placement = placement;
        calculateSalaryEmployee();
    }

    @Override
    public void calculateSalaryEmployee() {
        // TODO Auto-generated method stub
        setSalary(getPlacement().getUMK());  
        
    }


    
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getJobDesc() {
        return jobDesc;
    }
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }
    public Placement getPlacement() {
        return placement;
    }
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }
    

    
}
