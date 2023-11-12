import java.util.Scanner;
public class tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] jml= new String [4][5];

        //print daftar cabang olahraga
        System.out.println("---------------------");
        System.out.println("|Cabor 1: badminton |");
        System.out.println("|Cabor 2: tenis meja|");
        System.out.println("|Cabor 3: basket    |");
        System.out.println("|Cabor 4: bola voly |");
        System.out.println("---------------------");
        System.out.println(); //untuk enter
        for (int i = 0; i < jml.length; i++) { //perulangan pertama untuk mengatur banyaknya jumlah cabor
            System.out.println("Cabor ke-"+(i+1)); //(i+1) digunakan agar menyesuaikan urutan cabor dari angka 1 bukan 0
            for (int j = 0; j < jml[0].length; j++) { //perulangan 2 untuk mengatur jumlah daftar nama atlet sesuai jumlah inputan
                System.out.print("Nama atlet "+(j+1)+": "); //(j+1) digunakan agar menyesuaikan urutan nama dari angka 1 bukan 0
                jml[i][j] = sc.next(); //untuk menginputkan nama atlet
            }
            System.out.println(); //untuk enter
        }
        for (int i = 0; i < jml.length; i++) { //perulangan untuk mengatur banyaknya jumlah cabor
            System.out.print("Cabor ke- "+(i+1)+": "); //(i+1) digunakan agar menyesuaikan urutan cabor dari angka 1 bukan 0
            System.out.println(); //untuk enter
            for (String nama : jml[i]) { //perulangan untuk menampilkan nama sesuai urutan dari inputan
            System.out.println(nama + " "); //print nama
        }
        System.out.println();//untuk enter
    }
}
}