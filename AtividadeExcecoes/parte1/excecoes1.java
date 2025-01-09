import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome = null;
        int ddd = 0, numero = 0;

        // Solicitar nome do usuário
        while (nome == null || nome.isEmpty()) {
            System.out.println("Informe seu nome completo: ");
            nome = scan.nextLine();
        }

        // Solicitar DDD
        System.out.println("Informe seu número");
        while (true) {
            try {
                System.out.print("DDD: ");
                ddd = scan.nextInt();
                if (ddd < 10 || ddd >= 100) {
                    throw new java.util.InputMismatchException("DDD com mais de dois dígitos ou inválido");
                }
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro, DDD inválido, tente novamente");
                scan.nextLine(); // Esvaziar buffer
            }
        }

        // Solicitar número
        while (true) {
            try {
                System.out.print("Número: ");
                numero = scan.nextInt();
                if (numero < 900000000 || numero >= 1000000000) {
                    throw new java.util.InputMismatchException("Número inválido");
                }
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro, número inválido, tente novamente");
                scan.nextLine(); // Esvaziar buffer
            }
        }

        scan.close();

        // Exibir resultados
        System.out.println("\n\n\nNome: " + nome);
        System.out.printf("Número: (%d) %d\n", ddd, numero);
    }
}
