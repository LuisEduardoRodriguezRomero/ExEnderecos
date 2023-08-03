import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Pessoa> pessoas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int sair = 1;
        int opcao = 1;
        int controle = 1;

        do {




        System.out.println(" O que deseja fazer?");
        System.out.println("1: Cadastrar pessoa \n 2: Buscar pessoa  \n 0: Sair");
        opcao = scanner.nextInt();


        switch (opcao) {

            case 0:
                System.exit(0);
            case 1:

                do {
                    List<Endereco> enderecos = new ArrayList<>();
                    System.out.println("digite um nome:");
                    String nome = scanner.next();
                    System.out.println("Digite a idade");
                    int idade = scanner.nextInt();
                    System.out.println("Quantos enderecos deseja cadastrar?");
                    int qtend = scanner.nextInt();
                    for (int i = 0; i < qtend; i++) {
                        System.out.println("Digite o endereco: " + (i+1));
                        enderecos.add(new Endereco(scanner.next(), scanner.nextInt()));
                    }


                    pessoas.add(new Pessoa(nome, idade, enderecos));


                    System.out.print("Deseja cadastrar outra pessoa?");
                    System.out.print(" 1: Sim ou 0: Nao ");
                    sair = scanner.nextInt();


                } while (sair == 1);

                break;

            case 2:
                System.out.println("Realizando bsuqueda");
                System.out.println("Qual pessoa deseja mostrar os dados?");

                for (int i = 0; i< pessoas.size(); i++) {
                    System.out.println((i+1) + " " + pessoas.get(i).getNome());
                }
                int x = scanner.nextInt();
                System.out.print(pessoas.get((x-1)));
                break;


            default:
                System.out.print("Opcao invalida \n");



        }



    }while(controle==1);



        }



    }



