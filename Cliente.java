import java.util.Scanner;

public class Cliente {
    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String CPF;
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    public void comprar(){

        int escolha;
        for (int i = 1; i <= 10; i++) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------COMPRA-----------------");
        System.out.println("Deseja comprar nossos produtos?");
        System.out.println("1- Sim ");
        System.out.println("2- Não");
        System.out.print("Digite sua escolha: ");

        escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("------------Lista de Itens-----------------");
                System.out.println("1- Pipoca(2.50 R$)");
                System.out.println("2- Refrigerante(4.90 R$)");
                System.out.println("3- Doritos(5.60 R$)");
                System.out.println("4- Chocolate em barra(6.40 R$)");
                System.out.println("5- Água(2.00 R$)");
                System.out.println("");
                System.out.print("Selecione o Item: ");
                escolha = sc.nextInt();
                        switch (escolha) {
                            case 1:
                                System.out.println("Pipoca comprada com sucesso!!");
                                break;
                            case 2:
                                System.out.println("Refrigerante comprado com sucesso!!");
                                break;
                            case 3:
                                System.out.println("Doritos comprado com sucesso!!");
                                break;
                            case 4:
                                System.out.println("Chocolate em barra comprado com sucesso!!");
                                break;
                            case 5:
                                System.out.println("Água comprada com sucesso!!");
                                break;
                            default:
                                System.out.println("Ítem não reconhecido");
                                break;
                        }
                    } 
            
            else{
                System.out.println("Obrigado pelo interesse");
                break;
            } 
        }
              
    }
}
