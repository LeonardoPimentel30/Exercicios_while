import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int continuar = 1;
        double totalGeral = 0;

        while (continuar == 1) {
            System.out.print("Digite o código do produto: ");
            int codigo = sc.nextInt();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            double preco = 0;

            switch (codigo) {
                case 1: preco = 1.20; break;
                case 2: preco = 1.30; break;
                case 3: preco = 1.50; break;
                case 4: preco = 1.20; break;
                case 5: preco = 1.30; break;
                case 6: preco = 1.00; break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }

            double totalProduto = preco * quantidade;
            totalGeral += totalProduto;

            System.out.println("Total do produto: R$ " + totalProduto);

            System.out.print("Deseja continuar? (1 = sim / 0 = não): ");
            continuar = sc.nextInt();
        }

        System.out.println("Total geral: R$ " + totalGeral);

        sc.close();
    }
}