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
public class manusia {
    private String kendaraan;
    public manusia(){}
    
    public manusia(String kendaraan){
        this.kendaraan=kendaraan;
       
    }


    
    public String getKendaraan(){
        return kendaraan;
    }
    
    public void setKendaraan(String kendaraan){
        this.kendaraan=kendaraan;
    }
    
    
    public void cetak(){
        System.out.println("kendaraan : "+this.kendaraan);
    }
    
}
