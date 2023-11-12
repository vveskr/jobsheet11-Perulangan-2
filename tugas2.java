import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N minimal 5: "); 
        int N = sc.nextInt(); //untuk menginputkan jumlah N 
        if (N<6) { //jika N kurang dari 5 maka harus mengulang dan menginput N minimal 5
            System.out.println("input nilai N minimal 5!");
        }else{ //jika N=<5 maka akan melanjukan proses pada perulangan
        for(int i=0; i<=N; i++){ //perulangan 1 untuk mengatur jumlah baris sesuai N yang diinputkan
            for (int j = N; j > i; j--) { //perulangna 2 untuk mengatur jumlah kolom i tidak melebihi N dan jumlahnya berkurang
                System.out.print("*"); //output yang keluar adalah *
            }
            System.out.println(); //untuk enter
        }
    }
}
}