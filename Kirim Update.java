package latihansoalbulan; //Nama paket 

import java.util.Scanner; //Mengimpor kelas Scanner

/**
 *
 * @author Rizky Firmansah
 */
public class Latihansoalbulan { //Mendefinisikan kelas

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Metoda main
        int bulan; //Deklarasi variable Integer
        
        Scanner input = new Scanner (System.in); //Membuat Scanner baru
         
        System.out.print("Masukan Bulan : "); //Menampilkan output ke User
        bulan=input.nextInt(); //Menggunakan scanner dan menyimpan apa yang 
                                //diketik user di variabel bulan
        
        //kondisi yang akan tejadi sesuai input user
        if(bulan==1){
            System.out.println("Januari");
        }else if(bulan==2){
            System.out.println("Februari");
        }else if(bulan==3){
            System.out.println("Maret");
        }else if(bulan==4){
            System.out.println("April");
        }else if(bulan==5){
            System.out.println("Mei");
        }else if(bulan==6){
            System.out.println("Juni");
        }else if(bulan==7){
            System.out.println("Juli");
        }else if(bulan==8){
            System.out.println("Agustus");    
        }else if(bulan==9){
            System.out.println("September");
        }else if(bulan==10){
            System.out.println("Oktober");
        }else if(bulan==11){
            System.out.println("November");
        }else if(bulan==12){
            System.out.println("Desember");    
        }else{
            System.out.println("Masukan 1-12"); 
        }
    }
}
