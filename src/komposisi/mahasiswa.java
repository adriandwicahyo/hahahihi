/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komposisi;

/**
 *
 * @author Rizky Firmansah
 */
public class mahasiswa {
    private String nrp, nama;
    
    public mahasiswa(String nrp, String nama){
        this.nrp=nrp;
        this.nama=nama;
    }
    
    public void setNRP(String nrp){
        this.nrp=nrp;
    }
    
    public void setNama_mhs(String nama){
        this.nama=nama;
    }
    
    public String getNRP(){
        return nrp;
    }
    
    public String getNama_mhs(){
        return nama;
    }
    
    public String cetak(){
        return("NRP : "+this.nrp+"\n"+"Nama : "+this.nama);
    }
    
}
