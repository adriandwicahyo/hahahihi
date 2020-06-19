/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregasi;

import komposisi.mahasiswa;

/**
 *
 * @author Rizky Firmansah
 */
public class mainagregasi {
    public static void main(String[] args) {
         mahasiswa mhs=new mahasiswa("Adrian","78");
         dosen dsn=new dosen();
         
        dsn.setNIP("111");
        dsn.setNama("Manto");
        
        dsn.setMhs(mhs);
        dsn.cetak();
               
         
    }
    
}

