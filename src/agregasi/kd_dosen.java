/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregasi;

/**
 *
 * @author Rizky Firmansah
 */
public class kd_dosen {
    private String kd_dosen ;
    private String total_mobil;
    
    public kd_dosen(){}
    
    public kd_dosen(String total_mobil, String kd_dosen){
        this.total_mobil=total_mobil;
        this.kd_dosen=kd_dosen;
    }
    
    public void setkd_dosen(String kd_dosen){
        this.kd_dosen=kd_dosen;
    }
    
    public void settotal_mobil(String total_mobil){
        this.total_mobil=total_mobil;
    }
    
    public String getkd_dosen(){
        return kd_dosen;
    }
    
    public String gettotak_mobil(){
        return total_mobil;
    }
    
    public String cetak(){
        return("daftar kendaraan: "+this.kd_dosen+"\n"+"total_mobil : "+this.total_mobil);
    }
    
}
