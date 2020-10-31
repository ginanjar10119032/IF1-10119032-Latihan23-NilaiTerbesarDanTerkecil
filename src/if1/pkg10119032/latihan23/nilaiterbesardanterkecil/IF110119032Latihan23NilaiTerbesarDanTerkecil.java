package if1.pkg10119032.latihan23.nilaiterbesardanterkecil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * nilai terbesar dan terkecil mahasiswa ke layar
 */
public class IF110119032Latihan23NilaiTerbesarDanTerkecil {

    public static void main(String[] args) {
        System.out.println("===== Program Nilai Terbesar dan Terkecil Mahasiswa =====");
        System.out.print("Masukkan nama petugas : ");
        Scanner scan = new Scanner(System.in);
        String petugas = scan.next();
        
        //membuat sebuah array yang menampung nilai mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        int banyakMhs = scan.nextInt();
        int arrayMhs[] = new int [banyakMhs];
        
        //perulangan yang terjadi sebanyak nilai mahasiswa
        for(int i=0; i<banyakMhs; i++){
          System.out.print("Masukkan nilai Mahasiswa ke-" + (i+1) + " = ");
          arrayMhs[i] = scan.nextInt();
        }

        //menampilkan ulang nilai mahasiswa yang telah dimasukkan
        System.out.println("\n===== Hasil Nilai Mahasiswa =====");
        for(int i=0; i<arrayMhs.length; i++){
            System.out.print("Nilai mahasiswa ke-" +(i+1) +" = ");
            System.out.println(arrayMhs[i]);
        }
        
        //megurutkan nilai arrayMhs lalu menampilkannya
        Arrays.sort(arrayMhs);
        System.out.println("\nNilai terbesar adalah " + arrayMhs[arrayMhs.length-1]);
        System.out.println("Nilai terkecil adalah " + arrayMhs[0]);
        
        System.out.println("\nPetugas : " + petugas);        
    }
    
}
