import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double alan, a, b, c, u;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Ucgenin Kenarlar�n� Giriniz");
		
		System.out.print("1.Kenar�n� Giriniz:");	
		a=input.nextDouble();
		System.out.print("2.Kenar�n� Giriniz:");
		b=input.nextDouble();
		System.out.print("3.Kenar�n� Giriniz:");
		c=input.nextDouble();
		
		//�evre = 2u'dan u'yu hesapladik.
		u = (a+b+c)/2;
		
		//alani hesapladik.
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.print("Ucgenin Alani: ");
		System.out.println(alan);
		

	}

}
