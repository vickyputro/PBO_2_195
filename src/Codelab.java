import java.time.LocalDate;
import java.util.Scanner;

public class Codelab
{
    public static void main(String[] args)
    {
        Scanner se = new Scanner(System.in);
        System.out.println("Masukkan nama :");
        System.out.println("Masukkan Jenis Kelamin (P/L) :");
        System.out.println("Masukkan Tahun Lahir :");
        LocalDate tanggal = LocalDate.now();
        int tahunSekarang = tanggal.getYear();
        String nama = se.next();
        String jenisKelamin = se.next();
        int Tahun = se.nextInt();
        int umur = tahunSekarang - Tahun;
        System.out.println("Data Diri:");
        System.out.println("Nama            : "+nama);
        System.out.println("Jenis Kelamin   : "+jenisKelamin);
        System.out.println("Umur            : "+umur);
    }
}