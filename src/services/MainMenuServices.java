package services;

import java.util.List;

import model.parent.EmployeeUmum;
import repository.RepositoryEmployee;

public class MainMenuServices {
    
    public void startMainMenuService(){
        MenuFiturServices fiturMenu = new MenuFiturServices();
        InputDataServices inputData = new InputDataServices();
        RepositoryEmployee repositoryEmployee = new RepositoryEmployee();
        List<EmployeeUmum> listEmployeeUmum = repositoryEmployee.getAllEmployee();
        int option;
        System.out.println("----- Selamat Datang di Aplikasi Pendataan karyawan PT. Secret Semut 79 -----");
        

        do{
            System.out.println();
            System.out.println("1. Add Employee");
            System.out.println("2. Edit employee");
            System.out.println("3. Data Employee");
            System.out.println("4. Data Payroll");
            System.out.println("5. Delete Employee");
            System.out.println("6. Searching");
            System.out.println("0. Exit");
            System.out.println();
            option = inputData.inputIsNumber();
            switch (option) {
                case 1:                    
                    fiturMenu.menambahKarywanBaru(listEmployeeUmum);                    
                    break;
                case 2: 
                    fiturMenu.editEmployee(listEmployeeUmum);
                    break;
                case 3:
                    fiturMenu.showDataEmployee(listEmployeeUmum);
                    break;
                case 4:
                    fiturMenu.dataPayRollEmployee(listEmployeeUmum);;
                    break;
                case 5:
                    fiturMenu.removeEmployee(listEmployeeUmum);
                    break;
                case 6: 
                    break;
                case 0:
                    fiturMenu.exitApplication();
                    break;               

                default:
                System.out.println("Diluar Jangkauan");
                    break;
            }
            
        }while(option !=0);
    }

     
    
     
   
    
}
