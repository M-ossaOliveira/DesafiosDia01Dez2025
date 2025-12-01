package entities;

public class Aluno extends GerenciadorDeObjetos{

    private String nome;
    private double N1;
    private double N2;

    public Aluno(String nome, double N1, double N2) {
        this.nome = nome;
        this.N1 = N1;
        this.N2 = N2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return N1;
    }

    public void setN1(double n1) {
        N1 = n1;
    }

    public double getN2() {
        return N2;
    }

    public void setN2(double n2) {
        N2 = n2;
    }

    //funcoes calcularMedia e isAprovado

    public double calcularMedia(double n1, double n2){
        return 0.5*(N1+N2);
    }

    public boolean isAprovado(double n1, double n2){
        if(calcularMedia(n1,n2)>=7){
            return true;
        }
        else{
            return false;
        }
    }

    public String Conceito (double n1, double n2){
        boolean aux=isAprovado(n1,n2);
        if(aux){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }

    @Override
    /*public String toString(String nome, boolean n1, boolean n2, double media, double meuConceito){
        return "O aluno "+nome+", teve a media"+String.format("%.2f",calcularMedia(n1,n2))+ " e foi "+Conceito(n1,n2);
    }*/
    public String toString(){
        return "O aluno "+getNome()+", teve média "+String.format("%.2f",calcularMedia(N1,N2))+" e foi "+Conceito(N1,N2);
    }
}
