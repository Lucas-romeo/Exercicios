import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("qual o seu nome?");
        String nome = leitor.nextLine();

        System.out.println("Qual sua idade?");
        int idade = leitor.nextInt();

        leitor.nextLine();
        System.out.println("Insira seu CPF");
        String cpf = leitor.nextLine();

        System.out.println("Cadastro Concluido");
        System.out.println("Seu nome é: " + nome + " sua idade: " + idade + " Seu CPF é: " + cpf); 
    

        Pessoa NewPessoa = new  Pessoa(cpf, idade, nome);
        



        System.out.println("\n--- Acesso à Conta Bancária ---");

        ContaBancaria contaDoUsusario = new ContaBancaria("123456789-Z", NewPessoa);
        System.out.println("titular: " + contaDoUsusario.titular.getNome());
        contaDoUsusario.depositar(250.00);
        
       
    }
      
    
}
