import java.util.Scanner;
public class BarangMain{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Barang br = new Barang();

		System.out.print("Masukkan Nama anda : ");
		br.nama = input.nextLine();
		System.out.print("Harga Barang : Rp. ");
		br.hargaSatuan = input.nextInt();
		System.out.print("jumlah barang : ");
		br.jumlah = input.nextInt();

		System.out.println("Nama\t\t\t = " + br.nama);
		System.out.println("Harga Satuan Barang\t = " + br.hargaSatuan);
		System.out.println("Harga Total \t\t = " + br.hitungHargaBayar());


	}
}