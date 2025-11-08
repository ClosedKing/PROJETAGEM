import java.util.Scanner;
import java.nio.charset.StandardCharsets;

class Biblioteca{
    public static void main (String [] args){
        int escolha = 0;
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        do{
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-=-BEM-VINDO A BIBLIOTECA 'LIVROTECA'=-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("\n\nFavor escolher uma das opções abaixo:");
        System.out.println("\n1- Cadastrar livro \n2- Alterar livro (por ID ou ISBN) \n3- Pesquisar livro (por título/autor/ISBN) \n4- Excluir \n5- livroListar \n6- acervoEmprestar \n7- livroDevolver livro \n8- Sair");
        System.out.println("============================================");

        escolha = scanner.nextInt();
        // String nome = scanner.nextLine(); // Lê a linha inteira digitada pelo usuário


        switch (escolha) {
            case 1:
                System.out.println("Que escolha bagual");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        
            default:
                System.out.println("Opção inválida, favor digite apenas o número dentre os fornecidos");
                break;
        }

        }while(escolha !=8);
        System.out.println("Obrigado por utilizar a LIVROTECA, até a próxima!");
    }

}