package entities;

public abstract class Conta {

    private String nomeTitular;
    private int idConta;
    private double saldo;

    public Conta(String nomeTitular, int idConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.idConta = idConta;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    //para idConta e saldo não deixei setters pq não pode alterar o número da conta
    //nome pode mudar (casa, separa, etc) o númeri da conta bancaria nao
    // saldo tbm só deve ser alterado via depósito e saque

    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract double saldoAposSaque(double valor);


    public String ImprimeSaldo(double valorSaque){
        return String.format("%.2f",saldoAposSaque(valorSaque));
    }
}
