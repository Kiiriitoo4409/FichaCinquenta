import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno: ");
		double largura = ref.nextDouble();
		
		System.out.println("Digite o Cumprimento do terreno: ");
		double cumprimento = ref.nextDouble();
		
		double area = largura * cumprimento;
		
		System.out.println("A Área do seu terreno é: " + area);
			
	}
}
