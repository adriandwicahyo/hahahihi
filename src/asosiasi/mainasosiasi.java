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
public class mainasosiasi {
    
     public static void main(String[] args) {
         manusia mns=new manusia("mobil");
         kucing kcg=new kucing();
         
        kcg.setJenis("Sedan");
        kcg.setMerk("Honda");
        
        mns.cetak();
        kcg.cetak();
         
         
     }
    
}
