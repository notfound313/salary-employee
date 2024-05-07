package services;

public class ValidasiDataServices {
    public boolean validasiNumber(String number){
        String regexNumber = "^[0-9]+$";
        boolean isNumber = number.matches(regexNumber);
        return isNumber;

    }
    
}
