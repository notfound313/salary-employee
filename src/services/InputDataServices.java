package services;

import java.util.Scanner;

public class InputDataServices {
    ValidasiDataServices validasi = new ValidasiDataServices();
    public  String inputScanner(){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String inp = input.nextLine();
        return inp;
        

    }

    public String[] inputJenisKaryawan(){
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
                    dataKaryawan = inputDataEmployeeUmum();
                    option=0;                                        
                    break;
                case 2:
                    dataKaryawan = inputDataProgrammer();
                    option=0; 
                    break;
                case 3:
                    dataKaryawan = inputDataProjectLeader();
                    option=0; 
                    break;
                case 4:
                    dataKaryawan = inputDataAnalyst();
                    option=0; 
                    break;
            
                default:
                    System.out.println("dadah");
                    break;
            }

        }while(option!=0);

        return dataKaryawan;
    }

    public String[] inputDataEmployeeUmum(){        
        String [] pertanyaan ={"Name","Address","Age","Jobdesc","Placement"};
        String [] dataKaryawan = new String[pertanyaan.length+1];
        dataKaryawan[0]="employee";
        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println(pertanyaan[i]);
            dataKaryawan[i+1] = inputScanner();            
        }

        return dataKaryawan;
        

    }

    public String[] inputDataProgrammer(){        
        String [] pertanyaan ={"Name","Address","Age","Jobdesc","Placement","Programming Language","Experience"};
        String [] dataKaryawan = new String[pertanyaan.length+1];
        dataKaryawan[0] = "Programmer";
        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println(pertanyaan[i]);
            dataKaryawan[i+1] = inputScanner();            
        }

        return dataKaryawan;
        

    }
    public String[] inputDataProjectLeader(){
        String [] dataKaryawan = {"Project Leader"};
        String [] pertanyaan ={"Name","Address","Age","Jobdesc","Placement","Total Project"};
        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println(pertanyaan[i]);
            dataKaryawan[i+1] = inputScanner();            
        }

        return dataKaryawan;
        

    }

    public String[] inputDataAnalyst(){
        String [] dataKaryawan = {"Analyst"};
        String [] pertanyaan ={"Name","Address","Age","Jobdesc","Placement"};
        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println(pertanyaan[i]);
            dataKaryawan[i+1] = inputScanner();            
        }

        return dataKaryawan;
        

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
