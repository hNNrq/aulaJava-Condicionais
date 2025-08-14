import java.util.Scanner;

public class VerificIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        // Solicitação da idade ao usuário
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        // Verificação da idade para conceder acesso aos vídeos
        if (idade >= 18) {
            System.out.println("Acesso concedido! Você pode assistir aos vídeos.");
        } else {
            System.out.println("Desculpe, você não tem permissão para assistir aos vídeos.");
        }
    }
}