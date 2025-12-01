package entities;

public class ContaPoupanca extends Conta{
    
    private double limiteSaque;
    private double jurosPoupanca;
    //valor que a poupança rende a juros compostos ao mes

    public ContaPoupanca(String nomeTitular, int idConta, double saldo, double limiteSaque, double jurosPoupanca) {
        super(nomeTitular, idConta, saldo);
        this.limiteSaque = limiteSaque;
        this.jurosPoupanca = jurosPoupanca;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public double getjurosPoupanca() {
        return jurosPoupanca;
    }

    public void setjurosPoupanca(double jurosPoupanca) {
        this.jurosPoupanca = jurosPoupanca;
    }

    @Override
    public double saldoAposSaque(double valor){
        if(valor<=limiteSaque) {
            return getSaldo() - valor;
        }
        else return getSaldo();
    }

    @Override
    public String ImprimeSaldo(double valorSaque){
        if(getSaldo()==saldoAposSaque(valorSaque)){
            return "Não foi possível efetuar saque, excedeu limite";
        }
        else{
            return "O valor do saldo após o saque de R$"+String.format("%.2f",valorSaque)+" é de R$"+ String.format("%.2f",saldoAposSaque(valorSaque));
        }
    }
    
    public String rendimentoAposXMeses( int meses){
        return String.format("%.2f",getSaldo()*Math.pow((1+jurosPoupanca),meses));
    }
    
}
