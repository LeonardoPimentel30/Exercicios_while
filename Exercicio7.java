import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura): ");
        double altura = sc.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC = " + imc);

        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("IMC ideal");
        } else {
            System.out.println("Fora do peso ideal");
        }

        sc.close();
    }
}