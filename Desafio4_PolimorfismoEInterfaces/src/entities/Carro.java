package entities;

public class Carro extends Veiculo{

    private String barulhoFreio;
    private String barulhoAceleracao;
    private String barulhoLigaMotor;

    public Carro(String nome, String barulhoFreio, String barulhoAceleracao, String barulhoLigaMotor) {
        super(nome);
        this.barulhoFreio = barulhoFreio;
        this.barulhoAceleracao = barulhoAceleracao;
        this.barulhoLigaMotor = barulhoLigaMotor;
    }

    public String getBarulhoFreio() {
        return barulhoFreio;
    }

    public void setBarulhoFreio(String barulhoFreio) {
        this.barulhoFreio = barulhoFreio;
    }

    public String getBarulhoAceleracao() {
        return barulhoAceleracao;
    }

    public void setBarulhoAceleracao(String barulhoAceleracao) {
        this.barulhoAceleracao = barulhoAceleracao;
    }

    public String getBarulhoLigaMotor() {
        return barulhoLigaMotor;
    }

    public void setBarulhoLigaMotor(String barulhoLigaMotor) {
        this.barulhoLigaMotor = barulhoLigaMotor;
    }

    @Override
    public String acelerarVeiculo(){
        return "O carro acelera "+getBarulhoAceleracao();
    }

    @Override
    public String frearVeiculo(){
        return "O carro freia "+getBarulhoFreio();
    }

    @Override
    public String ligarVeiculo(){
        return "O carro liga "+getBarulhoLigaMotor();
    }
}
