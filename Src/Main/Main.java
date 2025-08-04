import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();

        int opcaoPrincipal = 0;

        do {
            System.out.println("\n******** Tela Inicial ********");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Navegador de Internet");
            System.out.println("3 - Telefone");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch(opcaoPrincipal) {
                case 1:
                    int opcaoMusica;
                    do {
                        System.out.println("\n--- Reprodutor Musical ---");
                        System.out.println("1 - Selecionar música");
                        System.out.println("2 - Tocar");
                        System.out.println("3 - Pausar");
                        System.out.println("4 - Voltar ao menu\n");
                        System.out.print("Escolha uma opção: ");
                        opcaoMusica = scanner.nextInt();
                        scanner.nextLine();

                        switch(opcaoMusica) {
                            case 1:
                                System.out.print("Digite o nome da música: ");
                                String musica = scanner.nextLine();
                                iphone.selecionarMusica(musica);
                                break;
                            case 2:
                                iphone.tocar();
                                break;
                            case 3:
                                iphone.pausar();
                                break;
                            case 4:
                                System.out.println("Voltando ao menu...");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while(opcaoMusica != 4);
                    break;

                case 2:
                    int opcaoNavegador;
                    do {
                        System.out.println("\n--- Navegador de Internet ---");
                        System.out.println("1 - Exibir página");
                        System.out.println("2 - Adicionar nova aba");
                        System.out.println("3 - Atualizar página");
                        System.out.println("4 - Voltar ao menu");
                        System.out.print("Escolha uma opção: ");
                        opcaoNavegador = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoNavegador) {
                            case 1:
                                System.out.print("Digite a URL: ");
                                String url = scanner.nextLine();
                                iphone.exibirPagina(url);
                                break;
                            case 2:
                                iphone.adicionarNovaAba();
                                break;
                            case 3:
                                iphone.atualizarPagina();
                                break;
                            case 4:
                                System.out.println("Voltando ao menu...");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while (opcaoNavegador != 4);
                    break;

                case 3:
                    int opcaoTelefone;
                    do {
                        System.out.println("\n--- Telefone ---");
                        System.out.println("1 - Ligar");
                        System.out.println("2 - Atender");
                        System.out.println("3 - Iniciar Correio de Voz");
                        System.out.println("4 - Voltar ao menu");
                        System.out.print("Escolha uma opção: ");
                        opcaoTelefone = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoTelefone) {
                            case 1:
                                System.out.print("Digite o número: ");
                                String numero = scanner.nextLine();
                                iphone.ligar(numero);
                                break;
                            case 2:
                                iphone.atender();
                                break;
                            case 3:
                                iphone.iniciarCorreioVoz();
                                break;
                            case 4:
                                System.out.println("Voltando ao menu...");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while (opcaoTelefone != 4);
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcaoPrincipal != 4);

        scanner.close();
    }
}
