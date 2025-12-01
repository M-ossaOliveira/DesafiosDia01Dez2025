package entities;

public class ContaCorrente extends Conta{

    private double limiteSaque;
    private double taxaCobradaPorSaque;

    public ContaCorrente(String nomeTitular, int idConta, double saldo, double limiteSaque, double taxaCobradaPorSaque) {
        super(nomeTitular, idConta, saldo);
        this.limiteSaque = limiteSaque;
        this.taxaCobradaPorSaque = taxaCobradaPorSaque;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public double getTaxaCobradaPorSaque() {
        return taxaCobradaPorSaque;
    }

    public void setTaxaCobradaPorSaque(double taxaCobradaPorSaque) {
        this.taxaCobradaPorSaque = taxaCobradaPorSaque;
    }

    @Override
    public double saldoAposSaque(double valor){
        if(valor<=limiteSaque) {
            return getSaldo() - valor - getTaxaCobradaPorSaque();
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
}
