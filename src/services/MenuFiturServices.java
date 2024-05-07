package services;

import java.util.ArrayList;
import java.util.List;

import model.child.job.Analyst;
import model.child.job.Programmer;
import model.child.job.ProjectLeader;
import model.parent.EmployeeUmum;
import model.parent.Placement;

public class MenuFiturServices { 
    
    /*
     * Menu fitur Menambah data Karyawan
     */

    public void menambahKarywanBaru(String[] dataKaryawanBaru, List<EmployeeUmum> employeeUmums){
        
        String [] jenisKaryawan = {"employee","Programmer","Project Leader", "Analyst"};
        int idx = 0 ;
        for (int i = 0; i < jenisKaryawan.length; i++) {
            if(dataKaryawanBaru[0].equalsIgnoreCase(jenisKaryawan[i])){
                idx = i+1;
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
        System.out.println("Success menamah karyawan");
        

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
        EmployeeUmum emp = new ProjectLeader(generateId, employeeUmum[1], employeeUmum[2], Integer.valueOf(employeeUmum[3]), employeeUmum[4], place, Integer.valueOf(employeeUmum[6]));

        employeeUmums.add(emp);

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
