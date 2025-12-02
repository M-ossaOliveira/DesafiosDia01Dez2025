package application;
import entities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //parte 1 e 2
        GerenciadorDeObjetos<Aluno> alunos = new GerenciadorDeObjetos<>();
        alunos.adicionaObjeto(new Aluno("Maria", 5.5, 10));
        alunos.adicionaObjeto(new Aluno("João", 10, 10));
        alunos.adicionaObjeto(new Aluno("Luis", 3.5, 8));
        alunos.listarDados();

        GerenciadorDeObjetos<Book> livros = new GerenciadorDeObjetos<>();
        livros.adicionaObjeto(new Book("HP", "JK Rowlling", true));
        livros.adicionaObjeto(new Book("Biblia", "Diversos autores", false));
        livros.listarDados();

        //parte 3

        Book l1 = new Ebook("HP", "JK Rowlling", true, "pdf");
        Book l2 = new Ebook("The Lord of the Rings", "Tolkien", false, "pdf");
        Book l3 = new PhysicBook("Macunaíma", "Machado de Assis", true, "Seção 3B");
        Book l4 = new Ebook("Game of Thrones", "J. R. R. Martin", false, "pdf");
        Book l5 = new PhysicBook("Feast for the Crows", "JK Rowlling", true, "Seção2A");


        List<Book> itensProcessar = new ArrayList<>();

        itensProcessar.add(l1);
        itensProcessar.add(l2);
        itensProcessar.add(l3);
        itensProcessar.add(l4);
        itensProcessar.add(l5);

        processaFormaFlexivel(itensProcessar);

    }

    public static void processaFormaFlexivel(List<? extends Book> itens_Processar) {
        //Aqui  acima, a declaração do tipo de entrada tem de ser extends - acessa mas não adiciona;
        //se quisessemos adicionar seria super, que adiciona mas não pode dar get

        System.out.println("Processando lista usando '? extends Book':");
        for (Book item : itens_Processar) {
            // Podemos obter itens da lista e tratá-los como ItemBiblioteca
            System.out.println("- " + item.getTitle());
        }

    }
}