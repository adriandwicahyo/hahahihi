/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asosiasi;

/**
 *
 * @author Rizky Firmansah
 */
public class kucing {
    private String jenis, merk;
    
    public kucing(){}
    
    public kucing(String jenis, String merk){
        this.jenis=jenis;
        this.merk=merk;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setJenis(String jenis){
        this.jenis=jenis;
    }
    
    public void setMerk(String merk){
        this.merk=merk;
    }
    
    public void cetak(){
        System.out.println("Jenis : "+this.jenis+"\n"+"merk : "+this.merk);
    }
    
}
