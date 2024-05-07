package services;

import java.util.ArrayList;
import java.util.List;

import model.child.job.Analyst;
import model.child.job.Programmer;
import model.child.job.ProjectLeader;
import model.parent.EmployeeTech;
import model.parent.EmployeeUmum;
import model.parent.Placement;

public class MenuFiturServices { 


    InputDataServices inputServices = new InputDataServices();
    
    /*
     * Menu fitur Menambah data Karyawan
     */

    public void menambahKarywanBaru(List<EmployeeUmum> employeeUmums){
        String[] dataKaryawanBaru= inputServices.inputJenisKaryawan();
        String [] jenisKaryawan = {"employee","Programmer","Project Leader", "Analyst"};
        int idx = 0 ;
        if(dataKaryawanBaru.length != 0){
            for (int i = 0; i < jenisKaryawan.length; i++) {
                if(dataKaryawanBaru[0].equalsIgnoreCase(jenisKaryawan[i])){
                    idx = i+1;
                }
                
            } 

        }       
        
        
        
        switch (idx) {
            case 1: 
                addEmployee(dataKaryawanBaru, employeeUmums);               
                break;
            case 2:
                addProgrammer(dataKaryawanBaru, employeeUmums);
                break;
            case 3:
                addProjectLeader(dataKaryawanBaru, employeeUmums);
                break;
            case 4:
                addAnalyst(dataKaryawanBaru, employeeUmums);
                break;        
            default:
                break;
        }
        
        

    }

    /*
     * Karywan Umum
     */

    public void addEmployee(String[] employeeUmum, List<EmployeeUmum> employeeUmums){
        List<EmployeeUmum> listEmployeeUmums = new ArrayList<>();
        for (EmployeeUmum employ : employeeUmums) {
            if(employ.getEmployeeId().contains("Emp")){
                listEmployeeUmums.add(employ);
            }
            
        }
        Placement place = new Placement();
        List<Placement> listPlace = getAllPlacement(employeeUmums);
        for (Placement placement : listPlace) {
            if(placement.getNamaKota().contains(employeeUmum[5])){
                place=placement;
            }
            
            
        }

        String generateId = generateIdEmployee(listEmployeeUmums);
        EmployeeUmum emp = new EmployeeUmum(generateId, employeeUmum[1], employeeUmum[2], Integer.valueOf(employeeUmum[3]), employeeUmum[4], place);

        employeeUmums.add(emp);
        System.out.println("Success menambah karyawan");

    }

    public static String generateIdEmployee(List<EmployeeUmum> listEmployeeUmums){
        String empId ="Emp-";
        int idNum = 1;
        int idInt;

        if(listEmployeeUmums.size()==0){
            empId +="001";
        }else{
            for (EmployeeUmum employ : listEmployeeUmums) {
                idInt=Integer.parseInt(employ.getEmployeeId().charAt(5)+""+employ.getEmployeeId().charAt(6));
                if(idNum==idInt){
                    idNum+=1;                    
                }               
                
            }          
            if(listEmployeeUmums.size() < 9){               
                empId +="00"+String.valueOf(idNum);
            }else{                
                empId +="0"+String.valueOf(idNum);

            }
           
        }

        return empId;

    }

    /*
     * Programmer
     */
    public void addProgrammer(String[] employeeUmum, List<EmployeeUmum> employeeUmums){
        List<Programmer> listEmployeeUmums = new ArrayList<>();
        for (EmployeeUmum employ : employeeUmums) {
            if(employ.getEmployeeId().contains("Prog")){
                listEmployeeUmums.add((Programmer)employ);
            }
            
        }
        Placement place = new Placement();
        List<Placement> listPlace = getAllPlacement(employeeUmums);
        for (Placement placement : listPlace) {
            if(placement.getNamaKota().contains(employeeUmum[5])){
                place=placement;
            }
            
            
        }

        String generateId = generateIdProgrammer(listEmployeeUmums);
        EmployeeUmum emp = new Programmer(generateId, employeeUmum[1], employeeUmum[2], Integer.valueOf(employeeUmum[3]), employeeUmum[4], place,employeeUmum[6],Integer.valueOf(employeeUmum[7]));

        employeeUmums.add(emp);

    }

    public static String generateIdProgrammer(List<Programmer> listEmployeeUmums){
        String empId ="Prog-";
        int idNum = 1;
        int idInt;

        if(listEmployeeUmums.size()==0){
            empId +="001";
        }else{
            for (EmployeeUmum employ : listEmployeeUmums) {
                idInt=Integer.parseInt(employ.getEmployeeId().charAt(6)+""+employ.getEmployeeId().charAt(7));
                if(idNum==idInt){
                    idNum+=1;                    
                }               
                
            }          
            if(listEmployeeUmums.size() < 9){               
                empId +="00"+String.valueOf(idNum);
            }else{                
                empId +="0"+String.valueOf(idNum);

            }
           
        }

        return empId;

    }

    /*
     * project leader
     */

     public void addProjectLeader(String[] employeeUmum, List<EmployeeUmum> employeeUmums){
        List<ProjectLeader> listEmployeeUmums = new ArrayList<>();
        for (EmployeeUmum employ : employeeUmums) {
            if(employ.getEmployeeId().contains("PL")){
                listEmployeeUmums.add((ProjectLeader)employ);
            }
            
        }
        Placement place = new Placement();
        List<Placement> listPlace = getAllPlacement(employeeUmums);
        for (Placement placement : listPlace) {
            if(placement.getNamaKota().contains(employeeUmum[5])){
                place=placement;
            }
            
            
        }

        String generateId = generateIdProjectLeader(listEmployeeUmums);
        EmployeeUmum emp = new ProjectLeader(generateId, employeeUmum[1], employeeUmum[2], Integer.valueOf(employeeUmum[3]), employeeUmum[4], place, Integer.valueOf(employeeUmum[6]));

        employeeUmums.add(emp);
        System.out.println("Success menambah karyawan");

    }

    public static String generateIdProjectLeader(List<ProjectLeader> listEmployeeUmums){
        String empId ="PL-";
        int idNum = 1;
        int idInt;

        if(listEmployeeUmums.size()==0){
            empId +="001";
        }else{
            for (EmployeeUmum employ : listEmployeeUmums) {
                idInt=Integer.parseInt(employ.getEmployeeId().charAt(4)+""+employ.getEmployeeId().charAt(5));
                if(idNum==idInt){
                    idNum+=1;                    
                }               
                
            }          
            if(listEmployeeUmums.size() < 9){               
                empId +="00"+String.valueOf(idNum);
            }else{                
                empId +="0"+String.valueOf(idNum);

            }
           
        }

        return empId;

    }

    /*
     * Analyst
     */

     public void addAnalyst(String[] employeeUmum, List<EmployeeUmum> employeeUmums){
        List<Analyst> listEmployeeUmums = new ArrayList<>();
        for (EmployeeUmum employ : employeeUmums) {
            if(employ.getEmployeeId().contains("AL")){
                listEmployeeUmums.add((Analyst)employ);
            }
            
        }
        Placement place = new Placement();
        List<Placement> listPlace = getAllPlacement(employeeUmums);
        for (Placement placement : listPlace) {
            if(placement.getNamaKota().contains(employeeUmum[5])){
                place=placement;
            }
            
            
        }

        String generateId = generateIdAnalyst(listEmployeeUmums);
        EmployeeUmum emp = new Analyst(generateId, employeeUmum[1], employeeUmum[2], Integer.valueOf(employeeUmum[3]), employeeUmum[4], place);

        employeeUmums.add(emp);
        System.out.println("Success menambah karyawan");

    }

    public static String generateIdAnalyst(List<Analyst> listEmployeeUmums){
        String empId ="PL-";
        int idNum = 1;
        int idInt;

        if(listEmployeeUmums.size()==0){
            empId +="001";
        }else{
            for (EmployeeUmum employ : listEmployeeUmums) {
                idInt=Integer.parseInt(employ.getEmployeeId().charAt(4)+""+employ.getEmployeeId().charAt(5));
                if(idNum==idInt){
                    idNum+=1;                    
                }               
                
            }          
            if(listEmployeeUmums.size() < 9){               
                empId +="00"+String.valueOf(idNum);
            }else{                
                empId +="0"+String.valueOf(idNum);

            }
           
        }

        return empId;

    }
    /*
     * Fitur edit Employee
     */
    public void editEmployee(List<EmployeeUmum> listEmployee){
        List<Placement> placements = getAllPlacement(listEmployee);
        String idEmployee = inputServices.requestIdEmployee(listEmployee);
        String place = inputServices.requestPlacement(placements);

        
        Placement plc = new Placement();
        for (Placement placement : placements) {
            if(placement.getNamaKota().contains(place)){
                plc=placement;

            }
            
        }
        for (EmployeeUmum employeeUmum : listEmployee) {
            if(employeeUmum.getEmployeeId().contains(idEmployee)){
                employeeUmum.setPlacement(plc);
                
            }
            
        }

        System.out.println("Suksess edit data employee");


        
    }

    /*
     * Fitur Menampilkan data employee
     */
    public void showDataEmployee(List<EmployeeUmum> listEmployee){
                
        int num = 0;
        int option;
        do{
        System.out.format("+--------------------------------------------------------------------------------+%n");
        String leftColomn = "| %-5s | %-10s | %-10s | %-10s | %-20s |%-9s|%n";
        System.out.format(leftColomn,"No","Employee Id", "Name", "Addrees" ,"Jobdesc","Palcement");
        System.out.format("+--------------------------------------------------------------------------------+%n");
        String leftAlignment = "| %-5d | %-10s | %-10s | %-10s | %-20s |%-10s|%n";  
        for (EmployeeUmum employeeUmum : listEmployee) {
            System.out.format(leftAlignment, num+=1,employeeUmum.getEmployeeId(), employeeUmum.getName(), employeeUmum.getAddress(), employeeUmum.getJobDesc(), employeeUmum.getPlacement().getNamaKota());
            System.out.format("+--------------------------------------------------------------------------------+%n");
        }
        String leftC = "| %-5d | %-70s |%n";
        System.out.format(leftC,0,"Kembali Ke Main Menu");
        System.out.format("+--------------------------------------------------------------------------------+%n");

        option = inputServices.inputIsNumber();

    }while(option!=0);

    }
    /*
     * fitur data Pay roll
     */
    public void dataPayRollEmployee(List<EmployeeUmum> employeeUmums){
        double totalPayrol = 0;
        for (EmployeeUmum employeeUmum : employeeUmums) {
            if(employeeUmum instanceof EmployeeTech){
                totalPayrol += ((EmployeeTech)employeeUmum).getAllowance()+employeeUmum.getSalary();
            }else{
                totalPayrol +=employeeUmum.getSalary();
            }
            
        }
        int num = 0;
        int option;
        do{
        System.out.format("+--------------------------------------------------------------------------------+%n");
        String leftColomn = "| %-5s | %-10s | %-10s | %-20s | %-10s |%-9s|%n";
        System.out.format(leftColomn,"No","Employee Id", "Name", "Jobdesc","Allowance","Salary");
        System.out.format("+--------------------------------------------------------------------------------+%n");
        String leftAlignment = "| %-5d | %-10s | %-10s | %-20s | %-10.2f |%-10.2f|%n";  
        for (EmployeeUmum employeeUmum : employeeUmums) {
            if(employeeUmum instanceof EmployeeTech){
                num +=1;                
                System.out.format(leftAlignment,num, employeeUmum.getEmployeeId(), employeeUmum.getName(), employeeUmum.getJobDesc(),  ((EmployeeTech)employeeUmum).getAllowance(), employeeUmum.getSalary());
                System.out.format("+--------------------------------------------------------------------------------+%n");
                
            }else{
                num+=1;
                System.out.format(leftAlignment, num,employeeUmum.getEmployeeId(), employeeUmum.getName(), employeeUmum.getJobDesc(),  0.0, employeeUmum.getSalary());
                System.out.format("+--------------------------------------------------------------------------------+%n");
            }
        }
        System.out.format("| %-5d| %-15s | %53.2f |%n",num+1,"Total Payroll", totalPayrol);
        System.out.format("+--------------------------------------------------------------------------------+%n");
        String leftC = "| %-5d | %-70s |%n";
        System.out.format(leftC,0,"Kembali Ke Main Menu");
        System.out.format("+--------------------------------------------------------------------------------+%n");

        option = inputServices.inputIsNumber();

    }while(option !=0);

    }

    /*
     * Menghapus data employee
     */
    public void removeEmployee(List<EmployeeUmum> listEmployee){
        String idEmployee = inputServices.requestIdEmployee(listEmployee);
        int idx = -1;
        for (int i = 0; i < listEmployee.size(); i++){
            if(listEmployee.get(i).getEmployeeId().contains(idEmployee)){
                idx = i;
            }
            
        }
        listEmployee.remove(idx);
        System.out.println("employee berhasil dihapus...");

    }

    /*
     * 
     * Fitur Exit
     */
    public void exitApplication(){
        System.out.println();
        System.out.println("-------------Terima kasih-----------");
        System.out.println();
    }

    


    /*
     * menu tambahan
     */

    
    public List<Placement> getAllPlacement(List<EmployeeUmum> employee){
        List<Placement> listPlacement = new ArrayList<>();

        for (EmployeeUmum employ : employee) {
            if(!listPlacement.contains(employ.getPlacement())){
                listPlacement.add(employ.getPlacement());
            }         

            
        }

        return listPlacement;


    }
    
}
