import java.util.Scanner;

public class Tahmin {

	public static void main(String arg[]) {
		Scanner scan=new Scanner(System.in);
			int cevap=20;
			int girdi=0;
			boolean oyunDevam=true;
			while (oyunDevam) {
				System.out.print("Bir sayi giriniz: ");
				girdi = scan.nextInt();
				if (girdi>cevap) {
					System.out.println("Tahmini küçült");
				}else if (girdi<cevap) {
					System.out.println("Tahmini büyüt");
				}else {
					System.out.println("Doðru cevap");
					oyunDevam=false;
				}
			}
		}
}
