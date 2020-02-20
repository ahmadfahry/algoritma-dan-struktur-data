import java.util.Scanner;

public class LingkaranMain{

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Lingkaran li = new Lingkaran();
		li.PHI = 3.14;

		System.out.println("Fitur : ");
		System.out.println("1.) Hitung Luas Lingkaran");
		System.out.println("2.) Hitung Keliling Lingkaran");
		System.out.print("Masukkan pilihan anda : ");
		int select = input.nextInt();
		System.out.print("Masukkan panjang jari-jari : ");
		li.r = input.nextDouble();

		switch(select){
			case 1 : 
				System.out.println("luas lingkaran adalah " + li.hitungLuas());
			break;
			case 2 : 
				System.out.println("Keliling lingkaran adalah " + li.hitungKeliling());
			break;
			default:System.exit(0);
		}

	}
}