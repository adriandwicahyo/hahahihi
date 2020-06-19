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
public class matakuliah {
    private String kode, nama;
    
    public matakuliah(String kode, String nama){
        this.kode=kode;
        this.nama=nama;
    }
    
    public void setKode(String kode){
        this.kode=kode;
    }
    
    public void setNama_matkul(String nama){
        this.nama=nama;
    }
    
    public String getKode(){
        return kode;
    }
    
    public String getNama_matkul(){
        return nama;
    }
    
    public String cetak(){
        return("Kode : "+this.kode+"\n"+"Nama : "+this.nama);
    }
    
}
