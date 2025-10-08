public class Main {

    // Este é o método que o Java executa primeiro
    public static void main(String[] args) {

        // 1. CRIAR O OBJETO (Instanciar o molde Carro)
        // Chamamos o CONSTRUTOR que definimos na classe Carro
        // Passamos "Fusca" como o modelo inicial, conforme exigido pelo construtor
        Carro meuCarro = new Carro("Fusca");

        // 2. CHAMAR OS MÉTODOS (Fazer o carro funcionar)
        meuCarro.acelerar(); // O Fusca vai a 10 km/h
        meuCarro.acelerar(); // O Fusca vai a 20 km/h

        // Imprime a velocidade final
        System.out.println("A velocidade atual do " + meuCarro.modelo + " é: " + meuCarro.velocidadeAtual);

        // Se você tentar chamar um método que não existe no Carro.java,
        // como meuCarro.frear(), o VS Code dará o erro "cannot find symbol".
        meuCarro.frear(); // O Fusca vai a 10 km/h
        meuCarro.frear(); // O Fusca vai a 0 km/h
        System.out.println("A velocidade atual do " + meuCarro.modelo + " é: " + meuCarro.velocidadeAtual);
    }
}