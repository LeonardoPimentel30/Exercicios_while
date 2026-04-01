import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int numero;
        int menor = Integer.MAX_VALUE;

        while (contador <= 10) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}