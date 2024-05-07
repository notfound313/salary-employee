package interfaces;

public interface AllowanceInterface {

    void calculateAllowance();

    int  THRESHOLD_PROGRAMMER = 4;
    int THRESHOLD_PROJECT_LEADER= 2;
    double [] PRSESENTASE_PROGRAMMER = {0.10,0.20};
    double [] PRESENTASE_PROJECT_LEADER ={0.05,0.15};
    double PRESENTASE_ANALYST = 0.05;

    
} 
