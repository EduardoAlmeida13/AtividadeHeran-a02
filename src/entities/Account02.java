package entities;

public class Account02 {
        private String conta;
    private String titular;
    private Integer numConta;
    private Double saldo;
    private Double saque;
    private Double deposito;
    
    public Account02(){
        
    }

    public Account02(String conta, String titular, Integer numConta, Double saldo, Double saque, Double deposito) {
        this.conta = conta;
        this.titular = titular;
        this.numConta = numConta;
        this.saldo = saldo;
        this.saque = saque;
        this.deposito = deposito;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaque() {
        return saque;
    }

    public void setSaque(Double saque) {
        this.saque = saque;
    }

    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double depósito) {
        this.deposito = depósito;
    }

    @Override
    public String toString() {
        return "Account{" + "conta=" + conta + ", titular=" + titular + ", número da conta=" + numConta + ", saldo=" + saldo + ", saque=" + saque + " - 20% do valor saquado, depósito=" + deposito + '}';
    }
}
