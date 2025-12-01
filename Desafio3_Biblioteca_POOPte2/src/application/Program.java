package application;

import entities.Book;
import entities.Ebook;
import entities.PhysicBook;
import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        List<Book> bookList= new ArrayList<>();

        Book l1 = new Ebook("HP", "JK Rowlling", true,"pdf");
        Book l2 = new Ebook("The Lord of the Rings", "Tolkien", false, "pdf");
        Book l3 = new PhysicBook("Macunaíma", "Machado de Assis", true,"Seção 3B");
        Book l4 = new Ebook("Game of Thrones", "J. R. R. Martin", false,"pdf");
        Book l5 = new PhysicBook("Feast for the Crows", "JK Rowlling", true,"Seção2A");

        bookList.add(l1);
        bookList.add(l2);
        bookList.add(l3);
        bookList.add(l4);
        bookList.add(l5);

        System.out.println("Bem vindo a nossa biblioteca");
        System.out.println("O acerco inclui os seguintes itens");
        for(Book item:bookList){
            System.out.println(item.toString());
        }

        System.out.println("____________________________");
        System.out.println("Digite os dados de usuário");
        System.out.println("Digite nome");
        String name =scanner.nextLine();
        System.out.println("Digite id de usuário");
        String id=scanner.nextLine();
        User u = new User(name,id);
        System.out.println("Usuário "+ u.getName()+ ", ID: "+u.getId());
        System.out.println("Digite o título desejado");
        String wantedTitle=scanner.nextLine();
        char emprestarOuDevolver='0';
        boolean found=false;
        for(int i=0; i<bookList.size();i++){

            if(wantedTitle.equals(bookList.get(i).getTitle())&&found==false){
                found=true;
                System.out.println("Deseja emprestar ou devolver?");
                emprestarOuDevolver=scanner.next().charAt(0);
                if(emprestarOuDevolver=='e'){
                    bookList.get(i).emprestar();
                }
                else if(emprestarOuDevolver=='d'){
                    bookList.get(i).devolver();
                }else {
                    System.err.println("Opção inválida");
                }
            }
            if(found==false&&(i==(bookList.size()-1))){
                System.out.println("Este livro não está contido no acervo da biblioteca");
            }

        }

    }
}


