package entities;

public class Veiculo implements AcaoVeiculo {

    private String nome;

    public Veiculo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String acelerarVeiculo(){
        return "";
    }

    @Override
    public String frearVeiculo(){
        return "";
    }

    @Override
    public String ligarVeiculo(){
        return "";
    }
}
