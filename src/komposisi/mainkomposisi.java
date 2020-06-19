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
public class mainkomposisi {
    public static void main(String[] args) {
         dosen dsn=new dosen("Manto","111", 
                 new mahasiswa("74","Rizky"), 
                 new matakuliah("001","OOP"));
        
        dsn.cetak();
        
    
}
}
