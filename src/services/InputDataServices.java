package services;

import java.util.List;
import java.util.Scanner;

import model.parent.EmployeeUmum;
import model.parent.Placement;

public class InputDataServices {
    ValidasiDataServices validasi = new ValidasiDataServices();
    
    public  String inputScanner(){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String inp = input.nextLine();
        return inp;
        

    }

    public String[] inputJenisKaryawan(List<Placement> listPlacements){
        int option;
        String[] dataKaryawan = {};
        
        do {
            System.out.println("pilih jenis Karyawan");
            System.out.println("1. Karyawan umum");
            System.out.println("2. Programmer");
            System.out.println("3. Project Leader");
            System.out.println("4. Analyst");
            System.out.println("jangan tekan 0");
            option = inputIsNumber();
            switch (option) {
                case 1:
                    dataKaryawan = inputDataEmployeeUmum(listPlacements);
                    option=0;                                        
                    break;
                case 2:
                    dataKaryawan = inputDataProgrammer(listPlacements);
                    option=0; 
                    break;
                case 3:
                    dataKaryawan = inputDataProjectLeader(listPlacements);
                    option=0; 
                    break;
                case 4:
                    dataKaryawan = inputDataAnalyst(listPlacements);
                    option=0; 
                    break;
            
                default:
                    System.out.println("dadah");
                    break;
            }

        }while(option!=0);

        return dataKaryawan;
    }

    public String[] inputDataEmployeeUmum(List<Placement> listPlacements){        
        String [] pertanyaan ={"Name","Address","Age","Jobdesc","Placement"};
        String [] dataInteger ={"Age"};
        String [] dataKaryawan = new String[pertanyaan.length+1];
        dataKaryawan[0]="employee";
        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println(pertanyaan[i]);
            for(int j =0; j < dataInteger.length; j++){
                if(pertanyaan[i].contains(dataInteger[j])){
                    dataKaryawan[i+1] = String.valueOf(inputIsNumber());  
    
                }        
            }
            if(dataKaryawan[i+1] == null){
                if(pertanyaan[i].equalsIgnoreCase("Placement")){
                    dataKaryawan[i+1]= inputPlacement(listPlacements);

                }
               else{
                 dataKaryawan[i+1] = inputAlphabet();
               }

            }                    
        }

        return dataKaryawan;
        

    }

    public String[] inputDataProgrammer(List<Placement> listPlacements){        
        String [] pertanyaan ={"Name","Address","Age","Jobdesc","Placement","Programming Language","Experience"};
        String[] dataInteger = {"Age", "Experience"};
        String [] dataKaryawan = new String[pertanyaan.length+1];
        dataKaryawan[0] = "Programmer";
        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println(pertanyaan[i]);           
            for(int j =0; j < dataInteger.length; j++){
                if(pertanyaan[i].contains(dataInteger[j])){
                    dataKaryawan[i+1] = String.valueOf(inputIsNumber());  
                       
                }       
            } 
            if(dataKaryawan[i+1] == null){
                if(pertanyaan[i].equalsIgnoreCase("Placement")){
                    dataKaryawan[i+1]= inputPlacement(listPlacements);

                }
               else{
                 dataKaryawan[i+1] = inputAlphabet();
               }

            }
                      
        }

        return dataKaryawan;
        

    }
    public String[] inputDataProjectLeader(List<Placement> listPlacements){        
        String [] pertanyaan ={"Name","Address","Age","Jobdesc","Placement","Total Project"};
        String [] dataInteger = {"Age","Total Project"};
        String [] dataKaryawan = new String[pertanyaan.length+1];
        dataKaryawan[0] = "Project Leader";
        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println(pertanyaan[i]);
            for(int j =0; j < dataInteger.length; j++){
                if(pertanyaan[i].contains(dataInteger[j])){
                    dataKaryawan[i+1] = String.valueOf(inputIsNumber());  
    
                }           
        }
        if(dataKaryawan[i+1] == null){
            if(pertanyaan[i].equalsIgnoreCase("Placement")){
                dataKaryawan[i+1]= inputPlacement(listPlacements);

            }
           else{
             dataKaryawan[i+1] = inputAlphabet();
           }

        }
    }

        return dataKaryawan;
        

    }

    public String[] inputDataAnalyst(List<Placement> listPlacements){
       
        String [] pertanyaan ={"Name","Address","Age","Jobdesc","Placement"};
        String [] dataInteger ={"Age"};
        String [] dataKaryawan = new String[pertanyaan.length+1];
        dataKaryawan[0] = "Analyst";
                        
        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println(pertanyaan[i]);
            for(int j =0; j < dataInteger.length; j++){
            if(pertanyaan[i].contains(dataInteger[j])){
                dataKaryawan[i+1] = String.valueOf(inputIsNumber());  

            }
                      
        }
        if(dataKaryawan[i+1] == null){
            if(pertanyaan[i].equalsIgnoreCase("Placement")){
                dataKaryawan[i+1]= inputPlacement(listPlacements);

            }
           else{
             dataKaryawan[i+1] = inputAlphabet();
           }

        }
    }
        


    

        return dataKaryawan;
        

    }

    public String requestIdEmployee(List<EmployeeUmum> listEmployee){
        boolean valreq;
        String idEmployee;
        do{
            System.out.println("Masukan Id Employee");
            idEmployee = inputScanner();
            valreq = validasi.validasiIdEmployee(idEmployee, listEmployee);
            if(!valreq){
                System.out.println("id tidak ditemukan");
            }

        }while(!valreq);

        return idEmployee;
    }

    public String requestPlacement(List<Placement> placements){
        boolean valreq;
        String placement;
        do{
            System.out.println("Silahkan masukan placement employee");
            placement = inputAlphabet();
            valreq = validasi.validasiPlacement(placement, placements);
            if(!valreq){
                System.out.println("Placement tidak dalam jangkoan");
            }

        }while(!valreq);

        return placement;


    }

    public String inputPlacement(List<Placement> placements){
        boolean valreq;
        String placement;
        do{
           
            placement = inputAlphabet();
            valreq = validasi.validasiPlacement(placement, placements);
            if(!valreq){
                System.out.println("Placement tidak dalam jangkoan");
            }

        }while(!valreq);

        return placement;


    }
    public String inputAlphabet(){
        boolean valreq;
        String alphabet;        
        
        do{
            
            alphabet = inputScanner();
            valreq = validasi.validasiAlphabet(alphabet);
            if(!valreq){
                System.out.println("Hanya menerima nilai alphabet");
            }
        }while(!valreq);
        return alphabet;


    }
    public int inputIsNumber(){
        boolean valreq;
        String number;        
        
        do{
            
            number = inputScanner();
            valreq = validasi.validasiNumber(number);
            if(!valreq){
                System.out.println("Hanya menerima nilai number");
            }
        }while(!valreq);

        

        return Integer.parseInt(number);
    }
    
}
