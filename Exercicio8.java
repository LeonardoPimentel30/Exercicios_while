import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;

        while (contador <= 5) {
            double nota1, nota2;

            do {
                System.out.print("Digite a primeira nota: ");
                nota1 = sc.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.print("Digite a segunda nota: ");
                nota2 = sc.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;

            System.out.println("Média do aluno: " + media);
            contador++;
        }

        sc.close();
    }
}