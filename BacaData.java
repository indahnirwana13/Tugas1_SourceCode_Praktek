/*NIM   : 13020210012
Nama    : Indah Nirwana
Hari/Tgl: Jumat, 10 Maret 2023
Waktu   : 13:30 AM*/
package tugas4;
import java.util.Scanner;

public class BacaData {

    /**
     * @param args
     */

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print("Contoh membaca dan menulis, ketik nilai integer : \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); Apa akibatnya?*/
        System.out.print("Nilai yang dibaca : " +a);
    }
    
}
