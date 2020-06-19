/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregasi;

import komposisi.mahasiswa;

/**
 *
 * @author 
 */
public class dosen {
    private String nama;
    private String kendaraan;
    
    public dosen(){}
    
    public dosen(String nama){
        this.nama=nama;
    }
    
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    
    public String getNama(){
        return nama;
    }
    
    public String getkendaraan(){
        return kendaraan;
    }
    

    public void cetak(){
        System.out.println("Nama : "+this.nama
                +"\n"+"kendaraan"+"\n"+this.kendaraan);
    }

    void setnama(String manto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNIP(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMhs(mahasiswa mhs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}