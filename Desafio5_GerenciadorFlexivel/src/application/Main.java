package application;
import entities.Aluno;
import entities.Book;
import entities.GerenciadorDeObjetos;

public class Main {
    public static void main(String[] args) {

        GerenciadorDeObjetos<Aluno> alunos= new GerenciadorDeObjetos<>();
        alunos.adicionaObjeto(new Aluno("Maria",5.5,10));
        alunos.adicionaObjeto(new Aluno("João",10,10));
        alunos.adicionaObjeto(new Aluno("Luis",3.5, 8));
        alunos.listarDados();

        GerenciadorDeObjetos<Book> livros= new GerenciadorDeObjetos<>();
        livros.adicionaObjeto(new Book("HP", "JK Rowlling", true));
        livros.adicionaObjeto(new Book("Biblia","Diversos autores",false));
        livros.listarDados();



    }
}
