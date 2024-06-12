import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código da cor atual do semáforo: ");
        int currentColor = scanner.nextInt();

        if (currentColor == 1) {
            System.out.println("O próximo semáforo é Verde");
        } else if (currentColor == 2) {
            System.out.println("O próximo semáforo é Amarelo");
        } else if (currentColor == 3) {
            System.out.println("O próximo semáforo é Vermelho");
        } else {
            System.out.println("Cor inválida");
        }
    }
}
