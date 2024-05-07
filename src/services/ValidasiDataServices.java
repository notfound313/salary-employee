package services;

import java.util.List;

import model.parent.EmployeeUmum;
import model.parent.Placement;

public class ValidasiDataServices {
    public boolean validasiNumber(String number){
        String regexNumber = "^[0-9]+$";
        boolean isNumber = number.matches(regexNumber);
        return isNumber;

    }

    public boolean validasiIdEmployee(String idEmployee, List<EmployeeUmum> listEmployee){
        boolean status = false;
        for (EmployeeUmum employeeUmum : listEmployee) {
            if(employeeUmum.getEmployeeId().contains(idEmployee)){
                status=true;
            }
            
        }

        return status;
        
    }
    public boolean validasiPlacement(String place, List<Placement> placements){
        boolean status = false;
        for (Placement places : placements) {
            if(places.getNamaKota().contains(place)){
                status=true;
            }
            
        }

        return status;
        
    }
    public  boolean validasiAlphabet(String dataInput){
        String regexAlphabet = "^[a-zA-Z ]*$";
        boolean isAlphabet = dataInput.matches(regexAlphabet);
        return isAlphabet;
     }
    
}
