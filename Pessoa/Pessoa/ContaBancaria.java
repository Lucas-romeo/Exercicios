public class ContaBancaria {
    private String numeroConta;
    private Double saldo;
    private String titular;

public ContaBancaria(String numeroConta, String titular) {
    
    this.numeroConta = numeroConta;
    this.titular = titular;
    
    
    this.saldo = 0.0; 
}

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo inválido");
        } else {
            this.saldo = saldo;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido");
        } else {
            this.titular = titular;
        }
    }
    
}
