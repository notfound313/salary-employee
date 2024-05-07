package model.parent;

public class Placement {
    private String namaKota;
    private double UMK;
    public Placement(String namaKota, double uMK) {
        this.namaKota = namaKota;
        UMK = uMK;
    }
    public Placement(){
        
    }
    public String getNamaKota() {
        return namaKota;
    }
    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }
    public double getUMK() {
        return UMK;
    }
    public void setUMK(double uMK) {
        UMK = uMK;
    }
    

    
    
}
