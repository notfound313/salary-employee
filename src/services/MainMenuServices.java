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
        System.out.println("----- Selamat Datang di Aplikasi Pendataan karyawan PT. Secret Semut 79");

        do{
            System.out.println("1. Add Employee");
            System.out.println("2. Edit employee");
            System.out.println("3. Data Employee");
            System.out.println("4. Data Payroll");
            System.out.println("5. Delete Employee");
            System.out.println("6. Searching");
            System.out.println("0. Exit");
            option = Integer.parseInt(inputData.inputScanner());
            switch (option) {
                case 1:
                    String[] dataBaruKaryawan= inputData.inputJenisKaryawan();
                    fiturMenu.menambahKarywanBaru(dataBaruKaryawan, listEmployeeUmum);                    
                    break;
            
                default:
                    break;
            }
            
        }while(option !=0);
    }

     
    
     
   
    
}
