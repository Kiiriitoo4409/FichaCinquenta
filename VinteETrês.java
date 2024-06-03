import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite o número em metros para a conversão: ");
		double num = ref.nextDouble();
		
		double decimetro = num * 10;
		double centimetro = num * 100;
		double milimetro = num * 1000;
		
		System.out.println("A conversão de metros para decimetro é: " + decimetro);
		System.out.println("A conversão de metros para centímetros é: " + centimetro);
		System.out.println("A conversão de metros para milimetros é: " + milimetro);
			
	}
}
