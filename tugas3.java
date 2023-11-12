import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N pertama: ");
        int Npertama = sc.nextInt(); //menginputkan nilai N pertama
        System.out.print("Masukkan nilai N kedua: ");
        int Nkedua = sc.nextInt(); //menginputkan nilai N kedua
        for (int i = 1; i <= Npertama; i++) { //perulangan 1 untuk mengatur jumlah baris sesuai inputan N pertama
            for (int j = 1; j <= Npertama; j++) { //perulangan 2 untuk mengatur jumlah kolom sesuai inputan N pertama
                //pemilihan jika i sama dengan 1 atau i sama dengan N pertama atau j sama dengan 1 atau j sama dengan N pertama
                if (i==1 || i==Npertama || j==1 || j==Npertama ) { 
                    System.out.print(Npertama +" "); //maka akan diprint sesuai perulangan 2
                }else{
                    System.out.print("  "); //jika tidak, maka akan diprint spasi sehingga kosong
                }  
            }
            System.out.println(); //untuk enter
        }
        System.out.println(); //untuk enter antara N pertama dan N kedua
        //dibawah ini sama seperti N pertama
        for (int i = 1; i <= Nkedua; i++) {
            for (int j = 1; j <= Nkedua; j++) {
                if (i==1 || i==Nkedua || j==1 || j==Nkedua ) {
                    System.out.print(Nkedua +" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
