import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai : "); //print Masukkan nilai
        int N = sc.nextInt(); //untuk menginput nilai N
        for (int i = 1; i<=N; i++) { //untuk perulangan baris/perulangan 1
            for (int j = N; j>i; j--) { //perulangan untuk kolom agar rata kiri/perulangan 2
                System.out.print(" "); //untuk blank space
            }
            for (int j = 1; j<=i; j++) { //perulangan untuk kolom agar rata kanan/perulangan 3
                System.out.print(j + ""); //output 
            }
            System.out.println(); //untuk enter pada setiap perulangan 1
        }
    }
}