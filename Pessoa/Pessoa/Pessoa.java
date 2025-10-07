public class Pessoa {
    
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String cpf, int idade, String nome) {
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
     
        public void Mostrar() {
        System.out.println ("seu nome é : " + nome);
        System.out.println ("sua idade é : " + idade);
        System.out.println ("seu cpf é : " + cpf);

    }
        public void fazerAniversario(){
        idade = idade + 1;
        
    }

}
