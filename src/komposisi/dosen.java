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
public class dosen {
    private String nip, nama_ds;
    private mahasiswa mhs;
    private matakuliah matkul;
    
    public dosen(String nip, String nama_ds){
       this.nip=nip;
        this.nama_ds=nama_ds;
    }
    
    public dosen(String nip, String nama_ds, mahasiswa mhs, matakuliah matkul){
        this.nip=nip;
        this.nama_ds=nama_ds;
        this.matkul=matkul;
        this.mhs=mhs;
    }
    
    public void setNIP(String nip){
        this.nip=nip;
    }
    
    public void setNama_dsn(String nama_ds){
        this.nama_ds=nama_ds;
    }
    
    public String getNIP(){
        return nip;
    }
    
    public String getNama_dsn(){
        return nama_ds;
    }
    
    public void cetak(){
        System.out.println("NIP : "+this.nip+"\n"+"Nama : "+this.nama_ds
                +"\n"+"Mahasiswa"+"\n"+this.mhs.cetak()
                +"\n"+"Mata Kuliah"+"\n"+this.matkul.cetak());
    }
    
}
