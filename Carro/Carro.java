public class Carro {

    // 1. ATRIBUTOS (O que o carro tem)
    // Usando a nomenclatura camelCase
    String modelo;
    int velocidadeAtual = 0; // Inicialmente, todos os carros estão parados

    // 2. CONSTRUTOR (Como criar o carro)
    // O nome DEVE ser igual ao nome da classe (Carro)
    // Este construtor exige apenas o modelo para criar o carro
    public Carro(String modeloInicial) {
        this.modelo = modeloInicial;
    }

    // 3. MÉTODO (O que o carro faz)
    // Um método simples para mudar a velocidade
    public void acelerar() {
        this.velocidadeAtual = this.velocidadeAtual + 10;
        System.out.println(this.modelo + " acelerou para: " + this.velocidadeAtual + " km/h");
    }
    public void frear() {
        this.velocidadeAtual = this.velocidadeAtual - 10;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0; // A velocidade não pode ser negativa
        }
        System.out.println(this.modelo + " frenou para: " + this.velocidadeAtual + " km/h");
    }
}